package br.com.andersongni.hackerrank.strings;

import java.util.Scanner;

public class JavaStringTokens {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		// Write your code here.
		s = s.trim();

		if (s.length() == 0 ) {
			System.out.println(0);
		} else {
			String split[] = s.split("[ !,?._'@]+");

			System.out.println(split.length);
			for (String string : split) {
				System.out.println(string);
			}
		}

		scan.close();
	}
}
