package com.wmms.mutils.api;

import org.flowable.engine.ProcessEngine;
import org.flowable.engine.RepositoryService;
import org.flowable.engine.RuntimeService;
import org.flowable.engine.TaskService;
import org.flowable.engine.repository.Deployment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

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

    @GetMapping("/process/deploy")
    public Response deploy()
    {
        Response response = new Response();

        repositoryService = processEngine.getRepositoryService();

        Deployment deployment =
                repositoryService.createDeployment().addClasspathResource("process/cmmn.xml").deploy();

        response.setCode(200);
        response.setMsg("");

        return response;
    }
}
