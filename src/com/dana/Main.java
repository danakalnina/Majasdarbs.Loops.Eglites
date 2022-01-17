package com.dana;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        // write your code here

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");

        int n=5;

        for (int i= 1; i<= n; i++) {

        for (int j= 1; j<= n; j++) {

             System.out.print( "*  ");
         }
            System.out.println();
     }



        for (int i= 1; i<= n; i++) {

        for (int j= 1; j<=i; j++) {

            System.out.print("*  ");
        }
            System.out.println();
        }


        for (int i = 1; i <= n; i++) {

        for (int j = i; j <= n; j++ ) {
            System.out.print("*  ");
        }
            System.out.println();
        }

// EGLĪTE

        for (int i = 1; i <= n; i++) {

        for (int j = i; j< n; j++) {

            System.out.print( "  ");
            }

        for (int k = 1; k < ( i * 2); k ++) {

            System.out.print("* ");
        }
            System.out.print("\n ");
        }



        }

    }


