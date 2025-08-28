package com.back;

import lombok.RequiredArgsConstructor;

//@Repository
@RequiredArgsConstructor
public class PersonRepository {
    private final int version;


    public int count() {
        System.out.println("version: " + version);
        return 3;
    }
}
