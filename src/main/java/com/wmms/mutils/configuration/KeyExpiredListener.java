package com.wmms.mutils.configuration;

import com.wmms.mutils.entity.TLogin;
import com.wmms.mutils.mapper.TLoginMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.connection.Message;
import org.springframework.data.redis.listener.KeyExpirationEventMessageListener;
import org.springframework.data.redis.listener.RedisMessageListenerContainer;

public class KeyExpiredListener extends KeyExpirationEventMessageListener
{
    @Autowired
    private TLoginMapper loginMapper;

    public KeyExpiredListener(RedisMessageListenerContainer listenerContainer)
    {
        super(listenerContainer);
    }

    @Override
    public void onMessage(Message message, byte[] pattern)
    {
        try
        {
            String uid = message.toString().split("_")[1];
            String device = message.toString().split("_")[2];

            TLogin tLogin = new TLogin();
            tLogin.setState("logout");
            tLogin.setAccessToken("");
            tLogin.setRefreshToken("");
            tLogin.setUser(Long.valueOf(uid));
            tLogin.setDevice(device);
            loginMapper.updateByUidAndDevice(tLogin);

            System.out.println("下线用户：" + uid + " 下线设备：" + device);
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
