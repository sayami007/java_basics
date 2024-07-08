package com.in28minutes.learn_spring_framework.Example1;

import org.springframework.stereotype.Component;

@Component
class MySQLDataService implements DataService {

    @Override
    public int[] retrieveData() {
        return new int[]{21, 32, 34, 45, 57, 68, 79};
    }
}
