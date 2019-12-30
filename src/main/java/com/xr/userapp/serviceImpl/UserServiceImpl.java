package com.xr.userapp.serviceImpl;

import com.xr.userapp.bean.User;
import com.xr.userapp.mapper.UserMapper;
import org.springframework.stereotype.Service;
import com.xr.userapp.service.UserService;

import javax.annotation.Resource;
import java.util.List;

@Service(value = "userService")
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public List<User> getAllUser(){
        return userMapper.getAllUser();
    }


    public void updateUserById(User user){
        userMapper.updateUserById(user);
    }
}
