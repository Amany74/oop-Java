package com.company;

public class Aggregation {



}


 class Student {
    String id ;
    StudentInfo studentInfo;  // kda hena 3mlna aggregation 3mlna inherit mn8er extends
    public Student(String id , StudentInfo stud) {
        this.id = id ;
        this.studentInfo = stud;
    }

// hn3ml method show  34an ntb3 al data

    public void show (){
        System.out.println("id : " + id );
        System.out.println("name : " + studentInfo.name); // al name asln m3mlnalo4 mot8er gowa Student
        System.out.println("address : " + studentInfo.address );
        System.out.println("number : " + studentInfo.number);
        System.out.println("departement : " + studentInfo.departement);

    }




}


 class StudentInfo {
    String name;
    String address;
    String number;
    String departement;

    public StudentInfo(String name, String address , String number , String departement ){
        this.name = name ;
        this.address = address;
        this.number = number ;
        this.departement = departement;
    }
}