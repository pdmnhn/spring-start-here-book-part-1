package main;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class PrototypeBeanComponent {
    public PrototypeBeanComponent() {
        System.out.println("New Prototype Bean created");
    }
}
