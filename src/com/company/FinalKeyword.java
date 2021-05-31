package com.company;

public class FinalKeyword {
    // if we make sth final user can't change it like variable value

    //******for variables {

    final int variable = 100;

    // we can't make setter for variable cause it's final can't be changed
    public void change() {
        //variable = 99;
//error it can't be assigned
    }

// ******}

    //a method to try to override in finalwithmethods

    public final void name(){
        String name = "amany";
        System.out.println("my name is :"+ name );
    }

    // setting a blank final variable and intialize it
    final String name ;
    public FinalKeyword(){
        name = "amany";
        System.out.println("value is inside the final var");
    }



}

class finalwithmethods extends FinalKeyword {


    //******for Methods {
    /*
    @Override
    public final void name(){
        String name = "amany";
        System.out.println("my name is :"+ name );
    }

     */
    //*****}
}

