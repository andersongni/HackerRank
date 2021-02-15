package br.com.andersongni.hackerrank.strings;

import java.util.Scanner;

public class JavaRegex {
	
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }
        
        in.close();

    }
}

//Write your code here
class MyRegex {
	
	String pattern;
	
	MyRegex () {
		String from0To255 = "(25[0-5]|2[0-4][0-9]|[01]?[0-9]?[0-9])";
	    this.pattern = String.format("%s.%s.%s.%s", from0To255, from0To255, from0To255, from0To255);
	    
	}
	
}