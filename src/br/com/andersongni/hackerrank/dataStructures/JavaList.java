package br.com.andersongni.hackerrank.dataStructures;

import java.io.*;
import java.util.*;

public class JavaList {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Integer N = scan.nextInt();
        
        List<Integer> L = new ArrayList<Integer>();
        for (int i=0; i<N; i++) {
            L.add(scan.nextInt());
        }

        Integer Q = scan.nextInt();
        for (int i=0; i<Q; i++) {
            String query = scan.next();
            int index = scan.nextInt();
            if (query.equals("Insert")) {
                Integer value = scan.nextInt();
                L.add(index, value);
            } else {
                // System.out.println("Removing "+ index+ "-"+ L.get(index));
                L.remove(index);
            }
        }

        for (Integer element : L) {
            System.out.print(element + " ");
        }

        scan.close();
    }
}