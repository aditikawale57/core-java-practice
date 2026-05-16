package coreJava;

import java.util.Scanner;

public class SumOfDigitsOfSpecific {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Sum of Digits is: "+sumOfDigit(n));
        sc.close();
    }

    public static int sumOfDigit(int num){
        int sum=0;
        while (num!=0) {
            int digit = num%10;
            sum+=digit;
            num=num/10;
        }
        return sum;
    }

}
