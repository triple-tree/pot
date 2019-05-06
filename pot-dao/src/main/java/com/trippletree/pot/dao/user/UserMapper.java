package com.trippletree.pot.dao.user;

import com.trippletree.pot.domain.user.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    /**
     * 查询所有用户
     * @return
     */
    List<User> findAll();

    /**
     * 添加用户
     * @param user
     */
    void addUser(User user);

    /**
     * 跟新用户
     * @param user
     */
    void updateUser(User user);

    /**
     * 删除用户
     * @param id
     * @return
     */
    int deleteUser(Integer id);

}