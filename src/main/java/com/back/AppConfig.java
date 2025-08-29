package com.back;

import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration //뭔가를 설정하는 클래스에 붙이는 어노테이션
public class AppConfig {


    @Bean
    public ApplicationRunner myApplicationRunner3() {
        return args -> {
            work1();
            work2();
        };
    }

    public void work1() {
        System.out.println("work1");
    }

    public void work2() {
        System.out.println("work2");
    }




}
