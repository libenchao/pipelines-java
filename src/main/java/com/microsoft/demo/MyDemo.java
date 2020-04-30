package com.microsoft.demo;

public class MyDemo {

    public String runDemo() {
        return "this is demo";
    }

    public static void main(String[] args) {
        System.out.println("my demo");
        System.out.println(new MyDemo().runDemo());
    }
}
