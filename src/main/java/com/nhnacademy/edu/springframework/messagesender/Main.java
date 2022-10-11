package com.nhnacademy.edu.springframework.messagesender;

public class Main {

    public static void main(String[] args) {

        new MessageSendService(new SmsMessageSender() , new EmailMessageSender()).doSendMessage();
//        new MessageSendService(new EmailMessageSender()).doSendMessage();

    }

    public void sendSmsMessage(User user, String message){
        System.out.println("SMS Message Sent to " + user.getPhoneNumber() + message);
    }

    public void sendEmailMessage(User user, String phoneNumber){
        System.out.println("Email Message Sent " + user.getEmail() + phoneNumber);
    }
}
