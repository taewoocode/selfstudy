package com.example.selfstudy.basic;
import java.util.Scanner;
public class code4 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String a = sc.next();
            int l = a.length();
            for(int i = 0; i<l; i++){
                System.out.println(a.charAt(i)); //문자열 a의 i번째를 반환해준다.
            }

        }
    }

