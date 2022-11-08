package com.lzj.demo.controller;

import com.lzj.demo.entity.User;
import com.lzj.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author xcp
 * @version 1.0
 */
@RestController
@RequestMapping("/superadmin")
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping(value = "/listuser", method = RequestMethod.GET)
    private Map<String,Object> listUser(){
        Map<String,Object> modelMap = new HashMap<>();
        List<User> list = userService.queryUser();
        modelMap.put("userList",list);
        return modelMap;
    }
    @RequestMapping(value = "/getuserbyname",method = RequestMethod.GET)
    private Map<String,Object> getUserByName(String UID){
        Map<String,Object> modelMap = new HashMap<>();
        User user = userService.queryUserByName(UID);
        modelMap.put("user",user);
        return modelMap;
    }
    @RequestMapping(value = "/insertuser",method = RequestMethod.POST)
    private Map<String,Object> insertUser(@RequestBody User user){
        Map<String,Object> modelMap = new HashMap<>();
        modelMap.put("success",userService.insertUser(user));
        return modelMap;
    }
    @RequestMapping(value = "/updateuser",method = RequestMethod.POST)
    private Map<String,Object> undateUser(@RequestBody User user){
        Map<String,Object> modelMap = new HashMap<>();
        modelMap.put("success",userService.updateUser(user));
        return modelMap;
    }
    @RequestMapping(value = "/deleteuser",method = RequestMethod.POST)
    private Map<String,Object> deleteUser(@RequestBody User user){
        Map<String,Object> modelMap = new HashMap<>();
        modelMap.put("success",userService.deleteUser(user));
        return modelMap;
    }
}
