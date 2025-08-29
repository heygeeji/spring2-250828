package com.back;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.transaction.annotation.Transactional;

@Configuration //뭔가를 설정하는 클래스에 붙이는 어노테이션
public class AppConfig {

    @Autowired
    @Lazy
    private AppConfig self;


    @Bean
    public ApplicationRunner myApplicationRunner3() {
        return args -> {
            // 리얼 객체의 메서드 호출
            this.work1();
            this.work1();

            // 프록시 객체의 메서드 호출
            self.work1();
            self.work1();
        };
    }

    @Transactional
    public void work1() {
        System.out.println("work1");
    }

    @Transactional
    public void work2() {
        System.out.println("work2");
    }




}
