package com.example.oop;

public class Animal {
    // thuộc tính
    private String name;
    private String color;
    // phương thức khởi tạo
    public Animal(String name, String color){
        this.name = name;
        this.color = color;
    }
    // getter and setter
    public String getName(){return name;}
    public void setName(String name){
        if (name.isEmpty()){
            throw new NullPointerException("Giá trị rỗng");
        }
        this.name = name;
    }
    // alt + insert
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    //phương thức
    public String run(int countLeg){
        switch (countLeg){
            case 2:
                return "con " + name + "chạy bằng 2 chân";
            case 4:
                return "con " + name + "chạy bằng 4 chân";
            default:
                return "chưa xác định cách chạy";
        }
    }
}
