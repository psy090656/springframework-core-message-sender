package com.nhnacademy.edu.springframework.messagesender;

public class MessageSendService {

    private  MessageSender smsmessageSender;
    private  MessageSender emailmessageSender;

    public MessageSendService(MessageSender smsmessageSender, MessageSender emailmessageSender){
        this.smsmessageSender = smsmessageSender;
        this.emailmessageSender = emailmessageSender;
    }

    public MessageSendService(){}

    public void setMessageSendService(MessageSender messageSender){
        System.out.println("setMessageSendService invoked!");
        this.smsmessageSender = smsmessageSender;
    }


    public void doSendMessage(){
        smsmessageSender.sendMessage(new User("psy090656@gmail.com", "010"), "hi");
        emailmessageSender.sendMessage(new User("psy090656@gmail.com", "010"), "hi");
    }
}
