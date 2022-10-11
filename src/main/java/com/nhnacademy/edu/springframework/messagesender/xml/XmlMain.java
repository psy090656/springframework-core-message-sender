package com.nhnacademy.edu.springframework.messagesender.xml;

import com.nhnacademy.edu.springframework.messagesender.EmailMessageSender;
import com.nhnacademy.edu.springframework.messagesender.MessageSendService;
import com.nhnacademy.edu.springframework.messagesender.SmsMessageSender;
import com.nhnacademy.edu.springframework.messagesender.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlMain {
    public static void main(String[] args) {
        String location = "classpath:/beans.xml";
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(location);


//        SmsMessageSender smsMessageSender = context.getBean("englishGreeter", SmsMessageSender.class);
//        EmailMessageSender emailMessageSender = context.getBean("koreanGreeter", EmailMessageSender.class);

        User user = new User("psy090656", "0104151");

        System.out.println("");
        context.getBean("SmsMessageSender", SmsMessageSender.class).sendMessage(user, "hi");
        System.out.println("");
        context.getBean("SmsMessageSender", SmsMessageSender.class).sendMessage(user, "hi");
        System.out.println("");
        context.getBean("EmailMessageSender", EmailMessageSender.class).sendMessage(user, "hi");
        System.out.println("");
        context.getBean("EmailMessageSender", EmailMessageSender.class).sendMessage(user, "hi");

        context.close();
    }
}
