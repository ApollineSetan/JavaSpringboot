package com.apolline.hello.service;
import com.apolline.hello.model.HelloWorld;
import org.springframework.stereotype.Component;

@Component
public class HelloWorldService {
    public HelloWorld getHelloWorld(){
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.setValue("Hello World");
        return helloWorld;
    }
}
