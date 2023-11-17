package components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Person {
    private final Parrot parrot;
    private String name;

    @Autowired
    public Person(@Qualifier("parrot2") Parrot parrot) {
        this.parrot = parrot;
        this.name = "Default Person";
    }

    public Parrot getParrot() {
        return parrot;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person: " + this.name + "\nParrot inside Person -> " + this.parrot;
    }
}
