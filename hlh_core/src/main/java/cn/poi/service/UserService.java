package cn.poi.service;

import cn.poi.po.User;

public interface UserService {
    User selectUserById(Integer userId) throws Exception;
    User login(User inputUser) throws Exception;
}
