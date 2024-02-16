package com.wmms.mutils.consumer;

import com.wmms.mutils.configuration.SMSJob;
import org.apache.activemq.command.ActiveMQBytesMessage;
import org.apache.activemq.util.ByteSequence;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

@Component
public class HeartBeatConsumerListener
{
    private static final Logger logger = LogManager.getLogger(HeartBeatConsumerListener.class.getName());

    @Autowired
    private RedisTemplate redisTemplate;

    @JmsListener(destination="${spring.activemq.queue-name}")
    public void readActiveQueue(Object message)
    {
        ByteSequence bs = ((ActiveMQBytesMessage) message).getMessage().getContent();
        String ack = new String(bs.getData());
        if (Boolean.TRUE.equals(redisTemplate.hasKey(ack)))
            redisTemplate.delete(ack);
        redisTemplate.opsForValue().set(ack, String.valueOf(System.currentTimeMillis()), 1, TimeUnit.MINUTES);
        logger.info("[heart_beat] " + ack);
    }
}
