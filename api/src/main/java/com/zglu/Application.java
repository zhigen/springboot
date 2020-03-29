package com.zglu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author zglu
 */
@SpringBootApplication
@MapperScan(value = "com.zglu.mybatis")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
