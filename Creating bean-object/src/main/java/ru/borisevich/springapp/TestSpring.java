package ru.borisevich.springapp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        // поможет создать spring-у bean.
        TestBean bean = context.getBean("testBean", TestBean.class); // id bean-ф и класс, чей объект создаем.
        // получили уже готовый объект и теперь выведем имя.
        System.out.println(bean.getName());
        //обязательно закрываем.
        context.close();
    }
}
