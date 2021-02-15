package br.com.andersongni.hackerrank.datastructures;

import java.util.Scanner;

public class JavaAnagrams {

    static boolean isAnagram(String a, String b) {
        // Complete the function
    	char charA[] = a.toLowerCase().toCharArray();
    	char charB[] = b.toLowerCase().toCharArray();

    	java.util.Arrays.sort(charA);
    	java.util.Arrays.sort(charB);
    	
    	if (java.util.Arrays.equals(charA,charB)) {
    		return true;
    	} else {    	
    		return false;
    	}
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}