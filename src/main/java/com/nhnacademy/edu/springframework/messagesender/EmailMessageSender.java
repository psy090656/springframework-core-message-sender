package com.nhnacademy.edu.springframework.messagesender;

public class EmailMessageSender implements MessageSender{

    public EmailMessageSender(){
        System.out.println("--------------EmailMessageSender create-------");
    }

    public void initial(){
        System.out.println( "init EmailMessageSender");
    }

    public void cleanup(){
        System.out.println("EmailMessageSender cleanup");
    }


    @Override
    public void sendMessage(User user, String message) {
        System.out.println("============send Email Message");
    }
}
