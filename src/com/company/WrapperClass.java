package com.company;

public class WrapperClass {

    // 1
    int num = 10 ;
    Integer num2 = Integer.valueOf(num);
    Integer num3 = num ;

    // 2
    Integer number = 10 ;
    int number1 = number.intValue();
    int number2 = number1 ;

}


