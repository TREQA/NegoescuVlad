package com.company;

//Class definition
class MyPersonalClass{
    public int myVariable;
}

public class VariabileInstanta {

    public static void main (String[] args){
        // object instantiation

        MyPersonalClass mClass= new MyPersonalClass();
        mClass.myVariable=10;

        System.out.println(mClass.myVariable);

    }
}
