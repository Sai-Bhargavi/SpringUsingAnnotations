package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//this class is silimar to mappings.xml in xml based injection
@Configuration
@ComponentScan(basePackages = "org.example")
public class AppConfig {
  /*
  If you want to remove all the below beans and still want this to wokr then u can add the @component annotation on the classes which are defined in below beans
  and also mention @ComponentScan(basePackages = "org.example")
    here u are mentioning @Component above Snapdragon class and Samsung class
  @Bean
    public Samsung getPhone(){
        return new Samsung();
    }

    @Bean
    public MobileProcessor getProcessor(){
        return new Snapdragon();
    }*/
}
