package com.harry.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import com.harry.common.security.annotation.EnableHarryFeignClients;

/**
 * 认证授权中心
 * 
 * @author harry
 */
@EnableHarryFeignClients
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class AuthApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(AuthApplication.class, args);
        System.out.println("\n===========认证授权中心启动成功===========\n");
    }
}
