package com.ghwy.controller;

import com.ghwy.domain.User;
import com.ghwy.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping("/userList")
    public String userList(HttpServletRequest request, Model model){
        List<User> allUsers = userService.getAllUsers();
        System.out.println(allUsers);
        return "userList";
    }

}
