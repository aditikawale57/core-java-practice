package coreJava;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the no to check whether it is prime or not:");
        int n=sc.nextInt();
        if(isPrime(n))
            System.out.println("Number is prime");
        else
            System.out.println("Number is not prime");
        sc.close();
    }
    public static boolean isPrime(int num){
        if(num <= 1)
            return false;

        if(num==2)
            return true;

        // Eliminate even numbers
        if (num % 2 == 0)
            return false;

        // Check only odd divisors
        for (int i = 3; i * i <= num; i += 2) {
            if (num % i == 0)
                return false;
        }

       return true;
    }

}
