package com.company.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.List;

@Component(value = "catBean")
//without value parameter in Component annotation bean name will be "cat" by default
@PropertySource("classpath:prop.properties")
public class Cat {

    @Value(value = "${cat.name}")
    private String name;

    @Value(value = "${cat.age}")
    private int age;

    @Value(value = "#{'${cat.girls}'.split(',')}")
    private List<String> girls;

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", girls=" + girls +
                '}';
    }
}
