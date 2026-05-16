package corejava;

import java.util.Scanner;

public class PallindromeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        if(isPalindrome(n)){
            System.out.println(n+" is pallindrome");
        }else{
            System.out.println(n+" is not pallindrome");
        }
    }
    public static boolean isPalindrome(int num){
        int original=num;
        int reverse=0;
        while(num!=0){
            int digit=num%10;
            reverse=reverse *10 + digit;
            num /=10;
        }
        return original==reverse;
    }

}
