package com.xr.userapp.controller;


import com.xr.userapp.bean.User;
import com.xr.userapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;


    @RequestMapping("/getAllUser")
    public String getAllUser(Model model) {
        List<User> users =  userService.getAllUser();
        //model.addAttribute("ss",users);
        User user=new User();
        for(int i=0;i<1;i++){
            user=users.get(i);
        }
        model.addAttribute("user",user);
        return "index";

    }


    @RequestMapping("/update")
    public String updateUserById(User user,Model model){
        userService.updateUserById(user);
        return "index";
    }




    @PostMapping(value="/ajax")
    @ResponseBody
    public Map<String,String> updateAjax(){
        Map<String,String> map=new HashMap<>();
        List<User> users =  userService.getAllUser();
        User user=new User();
        for(int i=0;i<1;i++){
            user=users.get(i);
        }
        String u=user.getId();
        String s=user.getName();
        String e=user.getAge();
        String r=user.getSex();
        map.put("u",u);
        map.put("s",s);
        map.put("e",e);
        map.put("r",r);
        return map;
    }



}
