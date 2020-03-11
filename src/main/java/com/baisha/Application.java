package com.baisha;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@MapperScan("com.baisha.mapper")
@SpringBootApplication
public interface Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}
