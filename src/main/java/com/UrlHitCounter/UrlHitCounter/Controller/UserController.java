package com.UrlHitCounter.UrlHitCounter.Controller;

import com.UrlHitCounter.UrlHitCounter.Model.User;
import com.UrlHitCounter.UrlHitCounter.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    @Autowired
    UserService userService;
    // HitUrl
    @PostMapping("user")
    public String postUser(@RequestBody User user){
        return userService.postUser(user);
    }
    @GetMapping("user/userId/{userId}")
    public String hitIncrement(@PathVariable Integer userId){
        return userService.hitIncrement(userId);
    }
    @GetMapping("user/userName/{userName}")
    public User getUser(@PathVariable String userName){
        return userService.returnUser(userName);
    }

}
