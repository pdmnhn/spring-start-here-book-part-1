package services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import main.PrototypeBeanComponent;


@Component
public class TestService2 {
    @Autowired PrototypeBeanComponent prototypeBeanComponent;

    public PrototypeBeanComponent getPrototypeBeanComponent() {
        return this.prototypeBeanComponent;
    }
}
