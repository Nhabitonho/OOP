package com.example.oop;

public class Cat extends Animal{
    public Cat(String name, String color) {
        // constructor của cha
        // nhờ thằng cha khỏi tạo
        super(name, color);
    }
}
