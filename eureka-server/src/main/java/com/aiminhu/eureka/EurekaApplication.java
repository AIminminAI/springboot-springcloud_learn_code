package com.aiminhu.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by HuHongBo on 2022/12/16.
 * eureka-server服务的启动类，
 */
@SpringBootApplication
@EnableEurekaServer //启动eureka的注册中心功能
public class EurekaApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaApplication.class, args);
    }
}
