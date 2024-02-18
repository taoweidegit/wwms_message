package com.wmms.mutils.configuration;

import com.rabbitmq.client.Channel;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

@Component
public class RabbitReceiveHandler
{
    @Autowired
    private RedisTemplate redisTemplate;

    @RabbitListener(queues = {"heart_beat"})
    public void receive_heartbeat(Object msg, Message message, Channel channel)
    {
        String ack = new String(message.getBody());
        System.out.println(ack);
        if (redisTemplate.hasKey(ack))
            redisTemplate.delete(ack);
        redisTemplate.opsForValue().set(ack, String.valueOf(System.currentTimeMillis()), 60, TimeUnit.SECONDS);
    }
}
