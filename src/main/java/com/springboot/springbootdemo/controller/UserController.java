package com.springboot.springbootdemo.controller;


import com.springboot.springbootdemo.vo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("user")
public class UserController {

    @GetMapping("/{id}")
    @ResponseBody
    public User getUserById(@PathVariable(value = "id") Long id){
        User user = new User();
        user.setId(id);
        user.setName("pgd");
        user.setAge(24);
        return user;
    }

    @GetMapping("/list")
    @ResponseBody
    public List<User> getUserList() {
        List<User> list = new ArrayList<>();
        User user1 = new User();
        user1.setId(1l);
        user1.setName("pdd");
        user1.setAge(24);
        list.add(user1);
        User user2 = new User();
        user2.setId(2l);
        user2.setName("pgd");
        user2.setAge(25);
        list.add(user2);
        return list;
    }

    @PostMapping("/add")
    @ResponseBody
    Map<String, Object> addUser(@RequestBody User user) {

        Map<String, Object> map = new HashMap<>();
        map.put("result", "添加成功");
        return map;
    }

    @DeleteMapping("/{id}")
    @ResponseBody
    public Map<String, Object> deleteUser(@PathVariable(value = "id") Long id) {
        Map<String, Object> map = new HashMap<>();
        map.put("result", "删除成功");
        return map;
    }


    @PutMapping("/{id}")
    @ResponseBody
    public  Map<String, Object> updateUser(@PathVariable(value = "id") Long id ,@RequestBody User user) {
        Map<String, Object> map = new HashMap<>();
        map.put("result", "修改成功");
        return map;
    }

}
