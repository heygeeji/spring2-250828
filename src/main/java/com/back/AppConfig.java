package com.back;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration //뭔가를 설정하는 클래스에 붙이는 어노테이션
public class AppConfig {

    @Bean
    public PersonService personService() {
        System.out.println("AppConfig.personService 호출됨!");
        return new PersonService();
    }
}
