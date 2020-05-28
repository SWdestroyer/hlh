package cn.poi.controller;

import cn.poi.po.User;
import cn.poi.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;


    @RequestMapping("/selectUserList.do")
    public String selectUserList() throws Exception {
        User user = new User();
        user.setUserTel("13260621887");
        user.setUserPassword("123456");
        User existUser = userService.login(user);
        System.out.println("----------------------------");
        System.out.println(existUser);
        return "userList";
    }

}
