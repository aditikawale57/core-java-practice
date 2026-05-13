package corejava;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int n=sc.nextInt();
        System.out.println("Factorial of "+n+" is: "+ factorial(n));
        sc.close();
    }

    //using recursion
   /*  public static int factorial(int num){
        if(num == 0 || num ==1)
            return 1;
        else{
            return num*factorial(num-1);
        }
    }*/

    //without recursion
    public static long factorial(int num){
        long fact=1;
        int i=1;
        while (i<=num) {
           fact*=i; 
           i++;
        }
        return fact;
    }

}
