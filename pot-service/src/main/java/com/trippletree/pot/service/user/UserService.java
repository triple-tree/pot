package com.trippletree.pot.service.user;

import com.trippletree.pot.domain.user.User;

import java.util.List;

public interface UserService {

    public  String getAllUsers();
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

