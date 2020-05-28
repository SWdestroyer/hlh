package cn.poi.dao;

import cn.poi.po.User;

public interface UserDao {
    User selectUserById(Integer userId) throws Exception;
    User login(User inputUser) throws Exception;
}
