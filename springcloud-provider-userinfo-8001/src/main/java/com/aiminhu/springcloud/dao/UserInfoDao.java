package com.aiminhu.springcloud.dao;

import com.aiminhu.springcloud.pojo.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserInfoDao {
    public boolean addUser(UserInfo userInfo);

    public UserInfo queryById(@Param("id")Long id);

    public List<UserInfo> queryAll();
}
