package com.example.selfstudy.basic;
import java.util.Scanner;

public class code2 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String a = sc.next();
            int n = a.length();
            char d;
            for(int i = 0; i<n; i++){

                d = a.charAt(i);

                if(Character.isUpperCase(d)==true)
                    System.out.print(Character.toLowerCase(d));
                else
                    System.out.print(Character.toUpperCase(d));
            }

        }
    }
