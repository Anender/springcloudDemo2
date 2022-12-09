package org.ender.springcloudDemo2.service1.dao.persistence;

import org.apache.ibatis.annotations.Mapper;
import org.ender.springcloudDemo2.service1.dao.entity.User;

import java.util.List;


/**
 * @Author: ENDER
 * @Date: 2021/1/17 17:09
 * @Description:
 */
@Mapper
public interface UserMapper {

    List<User> findUserByUserName(String username);

    void insert(User user);

}
