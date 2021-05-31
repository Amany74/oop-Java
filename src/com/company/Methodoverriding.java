package com.company;

public class Methodoverriding {
}
class Animal {
    public void eat(){
        System.out.println("the animal is Eating ");

    }

    public void Sleeping(){
        System.out.println("the animal is sleeping ");

    }

    public void playing(){
        System.out.println("the animal is playing ");

    }

    public void inheritedcmethod (){
        System.out.println("i'm inherited method ");
    }
}


class Cat extends Animal {


    public void eat(){
        System.out.println("the cat is Eating ");

    }

    public void Sleeping(){
        System.out.println("the cat is sleeping ");

    }

    public void playing(){
        System.out.println("the cat is playing ");

    }
}


class Dog extends  Animal {


    public void eat(){
        System.out.println("the Dog is Eating ");

    }

    public void Sleeping(){
        System.out.println("the Dog is sleeping ");

    }

    public void playing(){
        System.out.println("the Dog is playing ");

    }
}

class lion extends  Animal {


    public void eat(){
        System.out.println("the lion is Eating ");

    }

    public void Sleeping(){
        System.out.println("the lion is sleeping ");

    }

    public void playing(){
        System.out.println("the lion   is playing ");

    }
}