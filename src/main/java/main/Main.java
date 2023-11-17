package main;

import components.Parrot;
import components.Person;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Person person = context.getBean(Person.class);
        Parrot parrot = context.getBean("parrot1", Parrot.class);
        System.out.println(parrot);
        System.out.println(person);
    }
}