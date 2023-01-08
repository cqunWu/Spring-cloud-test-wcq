package com.eureka.wcq;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author: Chaoqun Wu
 * @description Eureka服务端启动类
 * @date: 2023/1/8 12:25
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication {
    public static void main(String[] args) {
        //new SpringApplicationBuilder(EurekaServerApplication.class).web(WebApplicationType.NONE).run(args);
        SpringApplication.run(EurekaServerApplication.class,args);

    }
}
