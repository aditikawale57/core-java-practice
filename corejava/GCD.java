package corejava;
import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Please enter the 2 numbers for finding GCD: ");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        System.out.println("GCD of 2 numbers is:"+gcd(n1,n2));
        sc.close();
    }
    public static int gcd(int num1,int  num2){
        int gcd=1;
        int least=Math.min(num1, num2);
        int i=2;
        while (i <= least) {
            if(num1%i==0 && num2%i==0){
                gcd=i;
            }
            i++;
        }
        return gcd;
    }

}
