package com.xr.userapp.service;

import com.xr.userapp.bean.User;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface UserService {
    public List<User> getAllUser();
    public void updateUserById(User user);
}
