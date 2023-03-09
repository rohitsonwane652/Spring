package com.example.demo;

public class HelloWorld {
    private String message;
    
    public void setMessage(String message) {
        this.message = message;
    }
    
    public void printMessage() {
        System.out.println("Message: " + message);
    }
}