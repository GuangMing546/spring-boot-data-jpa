package com.gm.springbootdatajpa.controller;

import com.gm.springbootdatajpa.entity.User;
import com.gm.springbootdatajpa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController //responsebody+controller
public class UserControl {
    @Autowired //自动注入这个继承了JpaRepository的接口，这个接口里面不用加如何注解，也是神奇
    UserRepository userRepository; //因为它继承了JpaRepository，JpaRepository本来封装好了很多功能：CRUD,分页，排序等
    @GetMapping("/user/{id}")
    public User getUser(@PathVariable("id") Integer id){
        User user = userRepository.findById(id).get();
        return user;
    }
    @GetMapping("/user")
    public User insertUser(User user){
        User save = userRepository.save(user);
        return save;
    }


}
