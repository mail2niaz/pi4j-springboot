package com.pi4j.spring.boot.sample.app;

import com.pi4j.Pi4J;
import com.pi4j.context.Context;
import com.pi4j.util.Console;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {

    @GetMapping("/hello")
    public String hello(@RequestBody String name) {
        System.out.println("hello "+ name);
        return "hello "+name;
//        var console = new Console();
//        Context pi4j = Pi4J.newAutoContext();
//        PrintInfo.printLoadedPlatforms(console, pi4j);
//        PrintInfo.printDefaultPlatform(console, pi4j);
//        PrintInfo.printProviders(console, pi4j);
    }
}