package com.company;

import java.util.Scanner;

public class Main {

    public static int Primecheck(int primeCheckNumber) {

        if (primeCheckNumber <= 1){

            return 1;
        }
            return 0;
    }



    public static void main(String[] args) {

        System.out.println("Enter a range of prime numbers (MAX VALUE) :");
        Scanner scanner = new Scanner(System.in);
        int primeNumber = scanner.nextInt();
        System.out.println("Prime numbers:");

        for (int i = 0; i<primeNumber; i++ ){


            if (Primecheck(i) == 1) {
                System.out.printf("Number %d isn't prime",Primecheck(i) );
            }

            }

    }


}
