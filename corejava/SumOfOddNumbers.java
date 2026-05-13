package corejava;

import java.util.Scanner;

public class SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no upto which you want to add the odd numbers:");
        int n=sc.nextInt();
        System.out.println(sumOfOdd(n));
        sc.close();
    }

    public static int sumOfOdd(int num){
        int sum=0;
        int i=1;
        while (i<=num){
            if(i %2 !=0){
                sum += i;
            }
            i++;
        }
        return sum;
    }

}
