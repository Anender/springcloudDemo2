package org.ender.springcloudDemo2.service1.client.hystrix;

import org.ender.springcloudDemo2.service1.client.UserService;
import org.ender.springcloudDemo2.service1.client.dto.UserDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @Author: ENDER
 * @Date: 2021/2/28 22:32
 * @Description:
 */
@Component
public class UserServiceHystrix implements UserService {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public UserDTO searchUser(UserDTO user) {
        logger.info("进入service1断路器");

        UserDTO userDTO = new UserDTO();
        userDTO.setUserName("进入service1自定义断路器");
        return userDTO;
    }
}
