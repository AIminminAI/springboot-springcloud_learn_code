package com.aiminhu.springcloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * Created by HuHongBo on 2022/12/16.
 * 就相当于咱们spring中的applicationContext.xml，以前在applicationContext.xml中配置的bean现在在这配置就行
 */
public class ConfigBean {

    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
