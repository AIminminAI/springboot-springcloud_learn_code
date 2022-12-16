package com.aiminhu.springcloud.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * Created by HuHongBo on 2022/12/15.
 *  分布式中所有的实体类需要进行序列化【网络通信中需要的两个条件：序列化和通信】
 */
@Data
@NoArgsConstructor
@Accessors(chain = true) //可以进行链式写法
public class UserInfo implements Serializable {
    private Long userName;
    private String departmentName;

    /**
     * 微服务中经常是服务们都是独立部署，相当于咱们SpringBoot中能自己独立运行起来的jar包，
     * 而且每个服务有可能用不同的语言开发，有自己独立的数据库，所以咱们得把数据库信息记录下来
     */
    private String dbSourceName;

    public UserInfo(String departmentName) {
        this.departmentName = departmentName;
    }
}
