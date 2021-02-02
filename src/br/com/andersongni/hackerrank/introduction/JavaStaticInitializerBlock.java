package br.com.andersongni.hackerrank.introduction;

import java.util.Scanner;

/*
 * https://www.hackerrank.com/challenges/java-static-initializer-block/problem
 */
public class JavaStaticInitializerBlock {

	private static Scanner scanner = new Scanner(System.in);
	private static Integer B = scanner.nextInt();
	private static Integer H = scanner.nextInt();
	private static Boolean flag = false;

	static {
		try {
			if (JavaStaticInitializerBlock.B>0 && JavaStaticInitializerBlock.H > 0) {
				JavaStaticInitializerBlock.flag = true;
			} else {
				throw new Exception("Breadth and height must be positive");
			}
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

	public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}

	}//end of main

}//end of class
