package com.company;

public class CallByValueReference {
    String name = "Amany" ;

    public void changeName (String name) {
  name = name + "10";
  // in this case its used once  as a copy or value

    }

    //BY Reference
int data = 10 ;
    void change(CallByValueReference op){
        op.data =op.data + 100;//changes will be in the instance variable
    }







}
