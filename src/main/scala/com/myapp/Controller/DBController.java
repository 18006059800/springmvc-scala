package com.myapp.Controller;

import com.myapp.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.myapp.Models.User;

/**
 * Created by jackywong on 28/03/2017.
 */
@Controller
public class DBController {
    @Autowired
    private UserService userService;

    @RequestMapping("/testDB")
    public String testDB(){
        User user=userService.getUserById(1L);
        System.out.println(user);
        return "index";
    }
}
