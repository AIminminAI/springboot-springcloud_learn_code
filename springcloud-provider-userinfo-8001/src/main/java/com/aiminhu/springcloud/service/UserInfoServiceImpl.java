package com.aiminhu.springcloud.service;

import com.aiminhu.springcloud.dao.UserInfoDao;
import com.aiminhu.springcloud.pojo.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by HuHongBo on 2022/12/16.
 */
@Service
public class UserInfoServiceImpl implements UserInfoService{

    @Autowired
    private UserInfoDao userInfoDao;

    @Override
    public boolean addUser(UserInfo userInfo) {
        return userInfoDao.addUser(userInfo);
    }

    @Override
    public UserInfo queryById(Long id) {
        return userInfoDao.queryById(id);
    }

    @Override
    public List<UserInfo> queryAll() {
        return userInfoDao.queryAll();
    }
}
