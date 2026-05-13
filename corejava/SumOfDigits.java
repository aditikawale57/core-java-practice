package corejava;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Sum of Digits is: "+sumOfDigit(n));
        sc.close();
    }

    public static int sumOfDigit(int num){
        int sum=0;
        int i=1;
        while (i<=num) {
            sum+=i;
            i++;
        }
        return sum;
    }

}
