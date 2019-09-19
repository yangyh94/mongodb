package com.universe.mongodb.controller;

import com.universe.mongodb.entity.User;
import com.universe.mongodb.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.Optional;

/**
 * @author ：yanghuanyu
 * @date ：Created in 2019-09-19 14:47
 * @description：
 * @modified By：
 * @version:
 */
@RestController
@RequestMapping("user")
public class UserController {


    @Autowired
    private UserRepository userRepository;


    @PostMapping("insert")
    public User addUser(@RequestBody User user) {
        Date date = new Date();
        user.setAddTime(date);
        user.setUpdateTime(date);
        return userRepository.insert(user);
    }

    @GetMapping("find")
    public List<User> findAll() {
        return userRepository.findAll();
    }


    @GetMapping("find/one/{id}")
    public User findUserById(@PathVariable Long id) {
        Optional<User> optionalUser =  userRepository.findById(id);
        return optionalUser.get();
    }
    @GetMapping("findByUsername")
    public List<User> findUserById(@RequestParam String username) {
       return userRepository.findByUsername(username);
    }
    @GetMapping("findLikeUsername")
    public List<User> findUserLikeId(@RequestParam String username) {
       return userRepository.findUserByUsernameLike(username);
    }
    @GetMapping("findLikePhone")
    public List<User> findUserLikePhone(@RequestParam String phone) {

       return userRepository.findUserByPhoneLike(phone);
    }

}
