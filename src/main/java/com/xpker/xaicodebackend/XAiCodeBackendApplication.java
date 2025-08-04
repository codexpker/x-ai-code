package com.xpker.xaicodebackend;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy(exposeProxy = true)
@MapperScan("com.xpker.xaicodebackend.mapper")
public class XAiCodeBackendApplication {
    public static void main(String[] args) {
        SpringApplication.run(XAiCodeBackendApplication.class, args);
    }
}
