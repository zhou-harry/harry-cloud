package com.harry.job;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.harry.common.security.annotation.EnableCustomConfig;
import com.harry.common.security.annotation.EnableHarryFeignClients;
import com.harry.common.swagger.annotation.EnableCustomSwagger2;

/**
 * 定时任务
 * 
 * @author harry
 */
@EnableCustomConfig
@EnableCustomSwagger2   
@EnableHarryFeignClients
@SpringBootApplication
public class JobApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(JobApplication.class, args);
        System.out.println("\n===========定时任务模块启动成功===========\n");
    }
}
