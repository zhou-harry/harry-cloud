package com.harry.system;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.harry.common.security.annotation.EnableCustomConfig;
import com.harry.common.security.annotation.EnableHarryFeignClients;
import com.harry.common.swagger.annotation.EnableCustomSwagger2;

/**
 * 系统模块
 * 
 * @author harry
 */
@EnableCustomConfig
@EnableCustomSwagger2
@EnableHarryFeignClients
@SpringBootApplication
public class SystemApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(SystemApplication.class, args);
        System.out.println("\n===========系统模块启动成功===========\n");
    }
}
