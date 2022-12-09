package org.ender.springclouddemo2.server2.service.Controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.ender.springcloudDemo2.service1.client.UserService;
import org.ender.springcloudDemo2.service1.client.dto.UserDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Optional;

/**
 * @Author: ENDER
 * @Date: 2021/2/27 16:41
 * @Description:
 */
@RestController
public class Service2TestController {

    @Autowired
    RestTemplate restTemplate;
    @Autowired
    UserService userService;

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @RequestMapping("apiTest")
    public String apiTest(){
        logger.info("调用service2");
        return "这里是service2的服务";
    }

    //restTemplate调用
    @RequestMapping("cloudApiTest")
    public String cloudApiTest(){
        logger.info("service2调用service1服务");
        //http"//+服务名/+请求地址
        String memberUrl="http://demo-service1/getUser";
        //请求地址 , 返回类型
        UserDTO userReq = new UserDTO();
        userReq.setUserName("admin");
        UserDTO userDTO =restTemplate.postForObject(memberUrl, userReq, UserDTO.class);

        return "service2调用service1服务成功，结果：" + Optional.ofNullable(userDTO).map(UserDTO::getUserName).toString();
    }

    //restTemplate调用
    @RequestMapping("feignApiTest")
    public String feignApiTest(){
        logger.info("service2开始调用service1服务");

        UserDTO userReq = new UserDTO();
        userReq.setUserName("admin");
        UserDTO userDTO =userService.searchUser(userReq);

        return "service2调用service1服务成功，结果：" + Optional.ofNullable(userDTO).map(UserDTO::getUserName).toString();
    }

    //restTemplate调用
    @RequestMapping("fallbackApiTest")
    @HystrixCommand(fallbackMethod="fallback")
    public String fallbackApiTest(){
        logger.info("service2开始调用service1服务");

        UserDTO userReq = new UserDTO();
        userReq.setUserName("admin");
        UserDTO userDTO =userService.searchUser(userReq);

        return "service2调用service1服务成功，结果：" + Optional.ofNullable(userDTO).map(UserDTO::getUserName).toString();
    }

    private String fallback(){
        return "进入service2自定义断路器";
    }
}
