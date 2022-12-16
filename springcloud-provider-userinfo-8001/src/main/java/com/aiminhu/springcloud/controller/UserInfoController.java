package com.aiminhu.springcloud.controller;

import com.aiminhu.springcloud.pojo.UserInfo;
import com.aiminhu.springcloud.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by HuHongBo on 2022/12/16.
 * 提供Restful服务，想办法让别人来调用我这个地方的服务
 */
@RestController
public class UserInfoController {
    @Autowired
    private UserInfoService userInfoService;

    @GetMapping("/hello")
    public String hello(){
        return "hello stupid springcloud";
    }

    @PostMapping("/userinfo/add")
    public boolean addUser(UserInfo userInfo){
        return userInfoService.addUser(userInfo);
    }

    /**
     * 接收一下URL中传过来的id,@PathVariable不就正好代表从URL中取值嘛，那个@PathParam不就说的是你只能费劲的从request从刨值嘛
     * @param id
     * @return
     */
    @GetMapping("/userinfo/get/{id}")
    public UserInfo get(@PathVariable("id") Long id){ //接收一下URL中传过来的id,@PathVariable不就正好代表从URL中取值嘛，那个@PathParam不就说的是你只能费劲的从request从刨值嘛
        return userInfoService.queryById(id);
    }

    @GetMapping("/userinfo/list")
    public List<UserInfo> queryAll(UserInfo userInfo){
        return userInfoService.queryAll();
    }

}
