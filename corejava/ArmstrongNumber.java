package corejava;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int n=sc.nextInt();
        if(isArmstrong(n)){
            System.out.println(n+ " is Armstrong number");
        }else{
            System.out.println(n+ " is not Armstrong number");
        }

    }
    public static boolean isArmstrong(int num){
       int original=num;
       int digits=noOfDigits(num);
       int sum=0;
       while(num!=0){
        int  digit=num %10;
        sum= (int) (sum + Math.pow(digit, digits));
        num /=10;
       } 

       return original==sum;

    }
    
    public static int noOfDigits(int num){
        int digits=0;
        if(num ==0){
            return 1;
        }
        while(num!=0){
            num /=10;
            digits++;
        }
        return digits;
    }

}
