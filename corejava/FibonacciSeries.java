package coreJava;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int n=sc.nextInt();
        // fibonacci(n);
        for(int i = 0; i < n; i++){
    System.out.print(fibonacci(i) + " ");
}
        sc.close();
    }

    // public static void fibonacci(int num){
    //     if(num <= 0) return;
    //     int first=0,second=1;
    //     for(int i=1; i<= num; i++){
    //         System.out.print(first+" ");
    //         int next=first+second;
    //         first=second;
    //         second=next;
    //     }
    // }

    public static int fibonacci(int num){
        
        if(num ==0)
            return 0;
        if(num==1)
            return 1;
        else{
            return fibonacci(num-1) + fibonacci(num - 2);
        }

    }


}
