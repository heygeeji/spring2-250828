package com.back;

import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration //뭔가를 설정하는 클래스에 붙이는 어노테이션
public class AppConfig {

//    @Bean //복잡한 객체 만들 때 사용
//    public PersonService personService() {
//        System.out.println("AppConfig.personService 호출됨!");
//        return new PersonService();
//    }

    @Bean
    public PersonRepository personRepository() {
        return new PersonRepository(1);
    }

    @Bean
    public PersonRepository personRepositoryV2() {
        return new PersonRepository(3);
    }

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

//    public ApplicationRunner myApplicationRunner() { // 리턴타입이 이렇다는건 이런객체가 있으면 스프링부한테 빈으로 등록하라는 것
//        return new ApplicationRunner();
//    }



}
