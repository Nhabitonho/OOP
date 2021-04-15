package com.example.oop;

import com.example.oop.BaseActivity;

//package com.example.oop;
//
//import androidx.appcompat.app.AppCompatActivity;
//
//import android.os.Bundle;
//import android.util.Log;
//
//public class MainActivity extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//        // object, class
//        // object : đại diện cho 1 thực thể
//        // class đại diện cho 1 quần thể
//        //class => kiểu dữ liệu
//        Animal meo = new Animal("meowmeow","Xám");
//        meo.setName("mimi");
//        Log.d("BBB", meo.run(4));
//        // Các tính chất của hướng đối tượng
//        // 1. TÍnh bao đóng
//        //2. TÍnh kế thừa
//        //3. tính đa hình : mô hình MVP
//        //4. tính trừu tượng
//
//        // 1. bao đóng Access modifier
//        Cat mew = new Cat("mimi", "Xám");
//        meo.setName("milu");
//        Log.d("BBB", meo.getName());
//        //2. TÍnh kế thừa
//        // overload : phương thức nạp chồng
//        // 1 : các phương thức nạp chồng cùng năm trên cùng 1 vị trí
//        // 2 : các phương thức nạp chồng phải khác với nhau về tham số truyền vào
////        printMessage("Xin Chào");
////        printMessage(android.R.id.message);
//        //3 : tính đa hình.
//
//    }
////    private void printMessage(String message){
////        Log.d("BBB", message);
////    }
////    private void printMessage(Integer resID){
////        Log.d("BBB", String.valueOf(resID));
////    }
//
//}
public class MainActivity extends BaseActivity{

    @Override
    protected int getLayout() {
        return 0;
    }

    @Override
    protected void onCreate() {

    }
}