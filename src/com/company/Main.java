package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        cut(n);
    }
    public static void cut(int n){
        if(360%n==0){
            System.out.println(1);
        }
        else {
            System.out.println(0);
        }
        if(n<=360){
            System.out.println(1);
        }
        else{
            System.out.println(0);
        }
        if((n*(n+1))/2<=360){
            System.out.println(1);
        }
        else{
            System.out.println(0);
        }
    }
}
