package coreJava;

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Please enter the 2 numbers for finding the LCM:");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        System.out.println("LCM of given numbers is:"+ LCM(n1, n2));
        sc.close();
    }

    public static int LCM(int n1,int n2){
        int lcm=1;
        int i=Math.max(n1,n2);
        while(true){
            if(i%n1==0 && i%n2==0){
                lcm=i;
                break;
            }
            i++;

        }
        return lcm;
    }

}
 