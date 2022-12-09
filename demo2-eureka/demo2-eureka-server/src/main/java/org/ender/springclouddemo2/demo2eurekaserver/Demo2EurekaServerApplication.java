package org.ender.springclouddemo2.demo2eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


/**
 * 注册中心
 * 1、配置Eureka信息
 * 2、@EnableEurekaServer
 */
@SpringBootApplication
@EnableEurekaServer
public class Demo2EurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(Demo2EurekaServerApplication.class, args);
    }

}
