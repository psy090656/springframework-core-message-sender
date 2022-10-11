package com.nhnacademy.edu.springframework.messagesender;

public class SmsMessageSender implements MessageSender{

    public SmsMessageSender(){
        System.out.println("-------- SmsMessage create ------");
    }

    public void init(){
        System.out.println("init method called in SmsMessageSender");
    }

    public void cleanup(){
        System.out.println("SmsMessageSender cleanup");
    }


    @Override
    public void sendMessage(User user, String message) {
        System.out.println("============ Sms send message");
    }
}
