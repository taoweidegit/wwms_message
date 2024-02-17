package com.wmms.mutils.configuration;

import com.wmms.mutils.entity.TLogin;
import com.wmms.mutils.mapper.TLoginMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.connection.Message;
import org.springframework.data.redis.listener.KeyExpirationEventMessageListener;
import org.springframework.data.redis.listener.RedisMessageListenerContainer;

import java.nio.charset.StandardCharsets;

public class KeyExpiredListener extends KeyExpirationEventMessageListener
{
    @Autowired
    private TLoginMapper loginMapper;

    public KeyExpiredListener(RedisMessageListenerContainer listenerContainer)
    {
        super(listenerContainer);
    }

    public void onMessage(Message message, byte[] pattern)
    {
        String expiredKey = new String(message.getBody(), StandardCharsets.UTF_8);
        String[] array = expiredKey.split("_");
        String uid = array[array.length - 2];
        String device = array[array.length - 1];

        TLogin login = new TLogin();
        login.setUser(Long.valueOf(uid));
        login.setDevice(device);
        loginMapper.updateByUidAndDevice(login);

        System.out.println("下线用户: " + uid + " 下线设备: " + device);
    }
}
