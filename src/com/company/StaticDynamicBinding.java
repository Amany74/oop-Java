package com.company;

public class StaticDynamicBinding{

    //1- Static Binding
    //typeof object is known at Compile time (Early Binding)

    class Animal {
        public void eat (){
            System.out.println("Animal is eating");
        }
    }
    class Dog extends Animal {

        @Override
        public void eat() {
            System.out.println("the dog is eating");
        }
    }


// if we say
    Dog d1 = new Dog(); // da static type is known by compiler

    // BUT

    Animal d2 = new Dog(); //type is not known until Runtime






}
