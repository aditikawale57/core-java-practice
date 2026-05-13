package corejava;

import java.util.Scanner;

public class MultiplicationTable{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        printMultiplicationTable(n);
        sc.close();
    }

    public static void printMultiplicationTable(int num){
        for(int i=1;i<=10;i++){
            System.out.println(num+ " * "+i+" = "+ (num*i));
        }
    }
}