package org.ender.springclouddemo2.demo2configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
*
* EnableConfigServer    提供配置服务
* EnableDiscoveryClient 注册中心
*
*/
@EnableConfigServer
@EnableDiscoveryClient
@SpringBootApplication
public class Demo2ConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(Demo2ConfigServerApplication.class, args);
    }

}
