package org.example;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
public class AppConfig {

    @Bean
    public ViewResolver getViewResolver() {

        return new InternalResourceViewResolver("/WEB-INF/jsp/",".jsp");
    }


    @EventListener
    public void onApplicationEvent(ContextRefreshedEvent event) {
        System.out.println("Application has started!");
        printRoutesUsage();
    }

    private void printRoutesUsage() {
        System.out.println("Usage of Routes:");
        System.out.println("1. / - Displays a welcome message.");
        System.out.println("2. /welcome - Displays a welcome page.");
        System.out.println("3. /myapp - Displays a hello world.");
        System.out.println("3. /greet/{name}?mode=<mode> - Greets the user with the given name and optional mode.");
        // Add more routes and their descriptions here
    }

}
