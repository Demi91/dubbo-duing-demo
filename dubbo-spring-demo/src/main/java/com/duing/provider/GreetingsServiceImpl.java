package com.duing.provider;

import com.duing.api.GreetingsService;

public class GreetingsServiceImpl implements GreetingsService {

    @Override
    public String sayHi(String name) {
        return "hi, " + name;
    }
}
