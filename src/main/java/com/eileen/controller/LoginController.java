package com.eileen.controller;


import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class LoginController {

    @GetMapping("/login")
    @ResponseBody
    public Object home(String username,String password) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("result","ok");
        return jsonObject;
    }
}
