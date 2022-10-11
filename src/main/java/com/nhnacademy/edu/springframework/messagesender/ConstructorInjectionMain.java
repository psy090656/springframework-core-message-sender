package com.nhnacademy.edu.springframework.messagesender;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConstructorInjectionMain {

    public static void main(String[] args) {

        String location = "classpath:/beans.xml";
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(location);

        User user = new User("psy090656", "0104151");

        MessageSendService messageSendService = context.getBean("MessageSendService", MessageSendService.class );

        messageSendService.doSendMessage();

    }
}
