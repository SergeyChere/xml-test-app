package com.company;

import com.company.beans.Car;
import com.company.beans.Cat;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config.xml");
        Car bean = applicationContext.getBean("firstBean", Car.class);
        System.out.println(bean.getName());
        System.out.println(bean.getModel());
        System.out.println(bean.getYear());

        Car bean2 = applicationContext.getBean("firstBean", Car.class);
        System.out.println(bean==bean2);

        Car bean3 = applicationContext.getBean("secondBean", Car.class);
        System.out.println(bean3.getName());
        System.out.println(bean3.getModel());
        System.out.println(bean3.getYear());

        Car bean4 = applicationContext.getBean("thirdBean", Car.class);
        System.out.println(bean4.toString());

        ApplicationContext applicationContext2 = new AnnotationConfigApplicationContext("com.company.beans");
        Cat cat1 = applicationContext2.getBean("catBean", Cat.class);
        System.out.println(cat1.toString());
    }
}
