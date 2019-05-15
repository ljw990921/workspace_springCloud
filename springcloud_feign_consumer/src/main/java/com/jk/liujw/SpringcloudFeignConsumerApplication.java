package com.jk.liujw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@EnableFeignClients    //开启feign的功能
public class SpringcloudFeignConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudFeignConsumerApplication.class, args);
    }

}
