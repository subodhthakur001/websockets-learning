package com.example.WebSockets.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NotificationController {

    @MessageMapping("/sendMessage")
    @SendTo("/topic/notifications")
    public String sendMessage(String message){
        System.out.println("message is : " + message);
        return message;
    }

    @GetMapping("/admin")
    public String adminPage() {
        return "admin"; // This tells Thymeleaf to render admin.html
    }

    @GetMapping("/client1")
    public String client1Image() {
        return "client1"; // This tells Thymeleaf to render admin.html
    }

    @GetMapping("/client2")
    public String client2Image() {
        return "client2"; // This tells Thymeleaf to render admin.html
    }
}
