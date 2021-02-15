package br.com.andersongni.hackerrank.strings;

import java.util.Scanner;

public class JavaStringsIntroduction {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        
        System.out.println(A.length() + B.length());
        
        if (0 < A.compareTo(B)) {
        	System.out.println("Yes");        	
        } else {
        	System.out.println("No");
        }
        
        A = A.substring(0, 1).toUpperCase() + A.substring(1);
        B = B.substring(0, 1).toUpperCase() + B.substring(1);
        
        System.out.println(A + " " + B);
        
        sc.close();
    }
}

