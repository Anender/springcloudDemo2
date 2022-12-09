package org.ender.springclouddemo2.demo2gatewayserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class Demo2GatewayServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(Demo2GatewayServerApplication.class, args);
    }

}
