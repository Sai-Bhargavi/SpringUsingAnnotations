package org.example;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary//if u have 2 classes implementing a interface and u want only one class to serve as a bean then u mention @Primary above that class)
public class MediaTek implements MobileProcessor{
    @Override
    public void process() {
        System.out.println("Second best CPU in the world");
    }
}
