package com.example.dagger2example.car;

import javax.inject.Inject;
import javax.inject.Singleton;

public class Driver {

    String name;

    public Driver(String name) {
        this.name = name;
    }
}
