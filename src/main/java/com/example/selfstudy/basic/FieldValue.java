package com.example.selfstudy.basic;


//필드에 선언만 하고 자동으로 초기값이 설정되는지 알아보겠다.
//그렇다면 아래와 같이 출력될 것이다.

public class FieldValue {
    byte byteF;
    char CharF;
    short shortF;
    int intF;
    long longF;
    float floatF;
    double doubleF;
    boolean booleanF;
    int[] intArray;
    String stringF;

    public void value() {
        System.out.println( "byte : " + byteF );
        System.out.println( "char : " + CharF );
        System.out.println( "short : " + shortF );
        System.out.println( "int : " + intF );
        System.out.println( "long: " + longF );
        System.out.println( "float : " + floatF );
        System.out.println( "double : " + doubleF );
        System.out.println( "boolean" + booleanF );
        System.out.println( "intArray" + intArray );
        System.out.println( "String" + stringF );
    }
}

