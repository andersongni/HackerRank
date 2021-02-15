package br.com.andersongni.hackerrank.strings;

import java.util.Scanner;

public class JavaSubstringComparisons {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        
        for (int i=0 ; i <= s.length()-k ; i++) {
        	String substring = s.substring(i, i+k);
        	
        	if (0 > substring.compareTo(smallest)) {
        		smallest = substring;
        	} else if (i==0) {
        		smallest = substring;
            }
        	
        	if (0 < substring.compareTo(largest)) {
        		largest = substring;
        	}
        }
        
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}

