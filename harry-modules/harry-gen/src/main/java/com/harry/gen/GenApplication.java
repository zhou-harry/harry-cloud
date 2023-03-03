package com.harry.gen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.harry.common.security.annotation.EnableCustomConfig;
import com.harry.common.security.annotation.EnableHarryFeignClients;
import com.harry.common.swagger.annotation.EnableCustomSwagger2;

/**
 * 代码生成
 * 
 * @author harry
 */
@EnableCustomConfig
@EnableCustomSwagger2   
@EnableHarryFeignClients
@SpringBootApplication
public class GenApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(GenApplication.class, args);
        System.out.println("\n===========代码生成模块启动成功===========\n");
    }
}
