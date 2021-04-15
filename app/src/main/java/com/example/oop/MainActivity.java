package com.example.oop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // object, class
        // object : đại diện cho 1 thực thể
        // class đại diện cho 1 quần thể
        //class => kiểu dữ liệu
        Animal meo = new Animal("meowmeow","Xám");
        meo.setName("mimi");
        Log.d("BBB", meo.run(4));
        // Các tính chất của hướng đối tượng
        // 1. TÍnh bao đóng
        //2. TÍnh kế thừa
        //3. tính đa hình
        //4. tính trừu tượng

        // 1. bao đóng Access modifier
        Cat mew = new Cat("mimi", "Xám");
        meo.setName("milu");
        Log.d("BBB", meo.getName());
    }

}