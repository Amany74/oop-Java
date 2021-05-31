package com.company;
import java.io.File;
import java.util.*;
import java.lang.*;


import java.util.Formatter;

public class fileio {


    // Writing to files


  private   Formatter bb = null;
    public void openFile() {

        try {
            bb = new Formatter("newone.txt"); // this creates a file n your computer
            System.out.println("file created successful ");
        } catch (Exception e) {
            System.out.println("you got an error while creating  --> " + e.getMessage());
        }
    }
/*
    public void addRecords () {
        bb.format("%s%S%s","amany", "ahmed ");
    }

 */

    public void closeFile () {
        bb.close();
    }


    // write to a file

    private Scanner xx ;
    public void openfile() {
        try {
            xx = new Scanner(new File("azzz.txt"));
        } catch (Exception e) {
            System.out.println("couldn't find file " + e.getMessage());
        }
    }

        public void readfile () {
            while (xx.hasNext()){
                String a = xx.next();
                String b = xx.next();
                String c = xx.next();
                System.out.printf("s%s%s%\n",a,b,c);
            }
        }

public void close(){
            xx.close();
        }







}

