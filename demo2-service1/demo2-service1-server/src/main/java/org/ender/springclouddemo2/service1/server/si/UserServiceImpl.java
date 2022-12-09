package org.ender.springclouddemo2.service1.server.si;

import org.ender.springcloudDemo2.service1.client.UserService;
import org.ender.springcloudDemo2.service1.client.dto.UserDTO;
import org.ender.springcloudDemo2.service1.dao.entity.User;
import org.ender.springcloudDemo2.service1.dao.persistence.UserMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: ENDER
 * @Date: 2021/1/17 15:26
 * @Description:
 */
@RestController
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public UserDTO searchUser(@RequestBody UserDTO userDTO) {
        List<User> userList = userMapper.findUserByUserName(userDTO.getUserName());
        if (!CollectionUtils.isEmpty(userList)) {
            UserDTO result = new UserDTO();
            BeanUtils.copyProperties(userList.get(0), result);
            return result;
        }
        return null;
    }

}
