package com.company;
import java.io.*;
import java.util.*;
import java.lang.*;


public class Main {



    public static void main(String[] args) {

        //******Agreggation

        // 34an n3wd 3n al studentinfo class variable ale f student
        //hn3ml object n3wd beeh f student constructor

        StudentInfo student1  = new StudentInfo("nora","alex","65668","healthcare");
        StudentInfo student2  = new StudentInfo("rana","alex","209445","healthcare ");

        Student s1 = new Student("2019",student1);
        Student s2 = new Student("2019",student2);

        s1.show();
        s2.show();

        System.out.println( " ---------------------------------------------------" );


        //******Methodoverriding

        Cat cat= new Cat();
        Dog dog = new Dog ();
        lion lion = new lion();

        cat.eat();  dog.Sleeping(); lion.playing();

        // we didn't implemrnt inheritedmethod in th subclasses put they still inherit it
        cat.inheritedcmethod();

        System.out.println( " ---------------------------------------------------" );

        //******SuperKeyword
        Member m = new Member("eagle" ,2019);
        m.printMemberInfo();
        m.workthemethod();
        System.out.println( " ---------------------------------------------------" );

        //******Final Keyword

        FinalKeyword f = new FinalKeyword();
         // f.change();    it gives an error
        // for methods
        finalwithmethods a = new finalwithmethods();
        a.name(); // because final method inherited but not overriden
        System.out.println( " ---------------------------------------------------" );


        //it print 2 sentences because we have 2 object
        //one main and the other is inherited


        //*******POLYMORPHISM
        // DONE

        // *******Static and Dynamic Binding
        // DONE

        //****** ABstraction

         Amany amany = new Abstraction();
        amany.see();

        //******tostring

        tostring ss = new tostring();

        System.out.println(ss);
        System.out.println( " ---------------------------------------------------" );


        //*********Object Clone
        /*
        try{
            Student18 s1=new Student18("amit" ,101,);

            Student18 s2=(Student18)s1.clone();

            System.out.println(s1.rollno+" "+s1.name);
            System.out.println(s2.rollno+" "+s2.name);

        }catch(CloneNotSupportedException c){}


         */
        //*********CALL by vale
        System.out.println("BY VALUE");
        CallByValueReference call = new CallByValueReference() ;
        System.out.println("original: " + call.name );
        call.changeName("rana");
        System.out.println("changed : " + call.name );

        //*********CALL by reference
        System.out.println("\n by REFERENCE \n ");
        CallByValueReference op=new CallByValueReference();

        System.out.println("before change "+op.data);
        op.change(op); //passing object
        System.out.println("after change "+op.data);
        System.out.println( " ------------------------------------------");


        //********* FILE I/O
// check if a file exxist you should provisde a full path
                File  x = new File("C:\\Users\\Amany\\Desktop\\wnew.txt");
                        if(x.exists())
            System.out.println(x.getName() + " file exists");
                        else System.out.println("not exixt");

//creating a file
        final Formatter aa ;
        try{
            aa = new Formatter("azzz.txt"); // this creates a file n your computer
            System.out.println("file created successful ");
        }
        catch(Exception e ){
            System.out.println("you got an error while creating  --> " + e.getMessage());
        }

        // try writing to files

        fileio ff = new fileio();

        ff.openFile();
      //  ff.addRecords();
        ff.closeFile();

// READ File
        fileio r = new fileio ();
        r.openFile();
        r.readfile();
        r.close();

        }

        // mn al  mo7adra
        BufferedReader bufferIn = new BufferedReader(new FileReader("amanyahmed.txt);
    String nextLine ;
    BufferedWriter bufferOut = new BufferedWriter(new FileWriter("amanyahmed.txt"));
            while (((nextLine = bufferIn.readLine()) != null)) {
        System.out.println(nextLine) ;
        bufferOut.write(nextLine);
        bufferOut.write("\n");
    }
            bufferIn.close();
            bufferOut.close();
}
