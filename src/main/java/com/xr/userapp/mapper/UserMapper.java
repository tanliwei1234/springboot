package com.xr.userapp.mapper;

import com.xr.userapp.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


import java.util.List;

//@Mapper
@Repository
public interface UserMapper {
    public List<User> getAllUser();
    public void updateUserById(User user);
}

