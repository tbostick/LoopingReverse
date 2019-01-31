package com.company;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        //  The following code prints the odd numbers from 1 to 20
        for (int i = 1; i < 21; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
        //  That was the end of the code


    }
}