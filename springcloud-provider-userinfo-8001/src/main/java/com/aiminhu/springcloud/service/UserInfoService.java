package com.aiminhu.springcloud.service;

import com.aiminhu.springcloud.pojo.UserInfo;

import java.util.List;

public interface UserInfoService {
    public boolean addUser(UserInfo userInfo);

    public UserInfo queryById(Long id);

    public List<UserInfo> queryAll();
}
