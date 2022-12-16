package com.aiminhu.springcloud.controller;

import com.aiminhu.springcloud.pojo.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by HuHongBo on 2022/12/16.
 * 消费者这边是不应该有service的,借助RestTemplate,有很多方法供我们直接调用，比如利用GET/POST方式获得实体，好多方法都跟网络有关【参数是url之类的】
 */
@RestController
public class UserInfoController {

    /**
     * RestTemplate用来提供多种便捷访问远程http服务的方法，简单的restful服务模板
     */
    @Autowired
    private RestTemplate restTemplate;

    private static final String REST_URL_PREFIX = "http://localhost:8081";

    @RequestMapping("/consumer/userinfo/get/{id}")
    public UserInfo get(@PathVariable("id") Long id){
        return restTemplate.getForObject(REST_URL_PREFIX + "/userinfo/get/" + id, UserInfo.class);
    }

    /**
     * 然后你服务提供者端有几个方法，我这里就可以写几个，不就可以写方法调用了嘛
     */

}
