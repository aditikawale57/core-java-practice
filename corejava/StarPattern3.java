package coreJava;
//left half pyramid
import java.util.Scanner;

public class StarPattern3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int n=sc.nextInt();
        int i=0;
        while (i<n) {
            int j=0;
            while(j<n-i-1){
                System.out.print("  ");
                j++;
            }
            
            int k=0;
            while(k<=i){
                System.out.print("* ");
                k++;
            }
            System.out.println();
            i++;
        }
        
    }

}
