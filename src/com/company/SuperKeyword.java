package com.company;

public class SuperKeyword {
}


class group {
    String groupName ;

    public  void  method(){
        System.out.println("i'm inherited by super keyword" );
    }

}

class Member extends  group {
    int ID ;

    // constructor
    public Member (String groupName , int ID ){
        super();
        // variable refereing
        super.groupName = null ;
        this.groupName = groupName ;
        this.ID = ID ;
    }

// const
    public void printMemberInfo (){
        System.out.println("groupe Name  : " + groupName);
        System.out.println("ID : " + ID);
    }

    // method
    public void workthemethod ()
    {
        super.method();
    }


}