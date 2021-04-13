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
        Log.d("BBB",meo.name);
    }
}