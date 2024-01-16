package com.wmms.mutils.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

@RestController
public class CacheController
{
    @Autowired
    private RedisTemplate redisTemplate;

    @GetMapping("/cache/login")
    public String setLoginCache(@RequestParam String ack)
    {
        if (Boolean.TRUE.equals(redisTemplate.hasKey(ack)))
            redisTemplate.delete(ack);
        redisTemplate.opsForValue().set(ack, String.valueOf(System.currentTimeMillis()), 1, TimeUnit.MINUTES);
        return "200";
    }
}
