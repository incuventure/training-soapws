package net.incuventure.services.notification;

import javax.jws.WebService;

@WebService(endpointInterface = "net.incuventure.services.notification.HelloWorld")
public class HelloWorldImpl implements HelloWorld {

    @Override
    public String sayHi(String text) {
        System.out.println("hello");
        return "Hi";
    }
}
