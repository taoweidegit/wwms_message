package com.wmms.mutils;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.wmms.mutils.mapper")
public class MutilsApplication
{

    public static void main(String[] args)
    {
        SpringApplication.run(MutilsApplication.class, args);
    }

}
