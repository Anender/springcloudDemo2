package org.ender.springcloudDemo2.service1.client;

import org.ender.springcloudDemo2.service1.client.dto.UserDTO;
import org.ender.springcloudDemo2.service1.client.hystrix.UserServiceHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: ENDER
 * @Date: 2021/1/17 15:21
 * @Description:
 */
@FeignClient(value = "demo-service1", fallback = UserServiceHystrix.class)
public interface UserService {

    @RequestMapping("getUser")
    public UserDTO searchUser(UserDTO userDTO);

}
