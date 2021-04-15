package com.example.oop;

import android.util.Log;

public class Cat extends Animal{
    public Cat(String name, String color) {
        // constructor của cha
        // nhờ thằng cha khỏi tạo
        super(name, color);
    }

    // phương thức ghi đè
    // phương thức ghi đè nằm ở 2 nơi khác nhau
    // phương thức ghi đè chỉ thay đổi logic code còn lại không thay đổi
    @Override
    public void setName(String name) {
        super.setName(name);
        Log.d("BBB", name);
    }
}
