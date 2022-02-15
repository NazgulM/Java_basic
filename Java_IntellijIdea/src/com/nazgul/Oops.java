package com.nazgul;
class Student {
    String name;
    int age;

    public void getInfo() {
        System.out.println("The name of student is: " +this.name);
        System.out.println("The age of this student is: "+ this.age);
    }
}
public class Oops {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Naza";
        s1.age = 36;
        s1.getInfo();

        Student s2 = new Student();
        s2.name = "Chika";
        s2.age = 38;
        s2.getInfo();
    }
}