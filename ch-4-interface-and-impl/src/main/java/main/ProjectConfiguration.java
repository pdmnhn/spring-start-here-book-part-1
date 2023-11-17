package main;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan(basePackages = { "proxies", "repositories", "services", "main" })
public class ProjectConfiguration {
}
