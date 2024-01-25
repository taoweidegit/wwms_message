package com.wmms.mutils.api;

import com.wmms.mutils.entity.TApplyProcess;
import com.wmms.mutils.entity.TApplyProcessExample;
import com.wmms.mutils.mapper.TApplyProcessMapper;
import org.flowable.engine.ProcessEngine;
import org.flowable.engine.RepositoryService;
import org.flowable.engine.RuntimeService;
import org.flowable.engine.TaskService;
import org.flowable.engine.repository.Deployment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Objects;

@RestController
public class ProcessController
{
    @Autowired
    private RuntimeService runtimeService;
    @Autowired
    private TaskService taskService;
    @Autowired
    private RepositoryService repositoryService;
    @Autowired
    private ProcessEngine processEngine;

    @Autowired
    private TApplyProcessMapper applyProcessMapper;

    @GetMapping("/process/deploy")
    public Response deploy()
    {
        String state = "";
        Response response = new Response();

        repositoryService = processEngine.getRepositoryService();
        List<Deployment> deploymentList =
                repositoryService.createDeploymentQuery().orderByDeploymentTime().desc().list();
        if (!deploymentList.isEmpty())
        {
            Deployment latestDeployment = deploymentList.get(0);
            TApplyProcessExample applyProcessExample = new TApplyProcessExample();
            applyProcessExample.createCriteria().andDeployIdEqualTo(latestDeployment.getId());
            List<TApplyProcess> processes = applyProcessMapper.selectByExample(applyProcessExample);
            state = processes.get(0).getState().toString();
        }

        if (deploymentList.isEmpty() || (Objects.equals(state, "") || Objects.equals(state, "End")))
        {
            Deployment deployment =
                    repositoryService.createDeployment().addClasspathResource("process/cmmn.xml").deploy();
            TApplyProcess applyProcess = new TApplyProcess();
            applyProcess.setDeployId(deployment.getId());
            applyProcess.setState("Start");
            applyProcessMapper.insert(applyProcess);

            response.setCode(200);
            response.setMsg("");

            return response;
        }

        response.setCode(201);
        response.setMsg("The process is not over!");

        return response;
    }

    @GetMapping("/process/remove")
    public Response remove(@RequestParam String deployId)
    {
        repositoryService = processEngine.getRepositoryService();
        if (!repositoryService.createDeploymentQuery().deploymentId(deployId).list().isEmpty())
            repositoryService.deleteDeployment(deployId, true);

        Response response = new Response();
        response.setCode(200);

        return response;
    }
}
