package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Samsung {
    @Autowired
    @Qualifier("mediaTek")//IF U DONT WANT TO USE @Primary over a class name then u can use this @qualifier to mention which class implementation u want to use for further process
    MobileProcessor processor;

    public void config(){
        System.out.println("This is Octa core 4, 12 MP camera");
        processor.process();
    }
}
