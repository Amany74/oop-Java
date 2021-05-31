package com.company;

public class Abstraction extends  Amany{

    public   void  see () {
        System.out.println("i see eith my eyes" );
    }



}



// hn3ml method abstract lazm class abstract
abstract class Amany  {

    // this abstract class we can take object(instantiated) by one of his subclasses only

    public abstract  void see ();


}

// creating interface with 4 methods

interface A {
    void a ();
    void b ();
    void c ();
    void  d ();
}

// creating abstract class with semi implenmentation
abstract  class B implements A  {
    public void c (){
        System.out.println("i'm  c ");
    }
}

// subclass of the abstract class
 class C extends B{ // w b asln extends A al interface {
    @Override
    public void a() {

    }

    public void b (){
        System.out.println("i'm b ");
    }

    public void d (){
        System.out.println("i'm d");
    }

}