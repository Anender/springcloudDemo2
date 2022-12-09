package org.ender.springclouddemo2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableHystrix
@EnableFeignClients
@EnableEurekaClient
@SpringBootApplication
public class Demo2Service1serverApplication {

    public static void main(String[] args) {
        SpringApplication.run(Demo2Service1serverApplication.class, args);
    }

}
