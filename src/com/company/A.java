package com.company;

public class A {

    A(){
        System.out.println("A");
    }

    public static void main(String[] args) {
        new B();
    }
}

class B extends C{
    B(){
        System.out.println("B");
    }
}

class C extends A{
    C(){
        System.out.println("C");
    }
}