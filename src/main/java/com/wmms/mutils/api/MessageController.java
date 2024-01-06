package com.wmms.mutils.api;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.jms.*;

@RestController
public class MessageController
{
    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;

    @GetMapping("/queue/sendMessage")
    public String hello(@RequestParam String queueName, @RequestParam String message) throws JMSException {
        ConnectionFactory connectionFactory = jmsMessagingTemplate.getConnectionFactory();
        Connection connection = null;
        Session session = null;
        MessageProducer producer = null;

        try
        {
            connection = connectionFactory.createConnection();
            connection.start();
            session = connection.createSession(Boolean.FALSE, Session.AUTO_ACKNOWLEDGE);

            TextMessage textMessage = session.createTextMessage(message);

            Queue queue = new ActiveMQQueue(queueName);
            producer = session.createProducer(queue);
            producer.setTimeToLive(10 * 1000L);
            producer.send(textMessage);

            System.out.println("[message] " + textMessage.getText());
        }
        catch (JMSException e)
        {
            System.out.println(e.getMessage());
        }
        finally
        {
            if (producer != null)
                producer.close();

            if (session != null)
                session.close();

            if (connection != null)
                connection.close();
        }

        return "200";
    }
}
