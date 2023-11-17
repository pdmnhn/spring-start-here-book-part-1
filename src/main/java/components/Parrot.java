package components;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

public class Parrot {
    private String name;

    public Parrot() {
        this.name = "Default parrot name";
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Parrot: " + this.name;
    }
}
