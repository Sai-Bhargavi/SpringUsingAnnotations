package org.example;

import org.springframework.stereotype.Component;

@Component
public class Snapdragon implements MobileProcessor{
    /*public void config(){
        System.out.println("This is CPU Snapdragon...");
    }
*/
    @Override
    public void process() {
        System.out.println("World best processor");
    }
}
