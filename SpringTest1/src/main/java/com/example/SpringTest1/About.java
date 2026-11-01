package com.example.SpringTest1;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "about")
public class About {
    String name;
    int age;
    int count;
    String hobby;
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public void details(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(count);
        System.out.println(hobby);
    }
}
