package corejava;

import java.util.Scanner;

public class ReverseDigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int n=sc.nextInt();
        System.out.println("reverse digit of "+n+" is: "+reverseDigit(n));
    }
    public static int reverseDigit(int num){
        int rev=0;
        while(num != 0){
            int digit=num%10;
            rev=rev * 10 +digit ;
            num=num/10;
        }
        return rev;
    }

}
