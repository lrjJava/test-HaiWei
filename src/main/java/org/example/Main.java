package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.*;

public class Main {
    static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer Tokenizer = new StringTokenizer(" ");
    static  String next() throws IOException {
        while (! Tokenizer.hasMoreTokens()) {
            Tokenizer = new StringTokenizer(bufferedReader.readLine());
        }
        return Tokenizer.nextToken();
    }
    static int nextInt() throws IOException {
        return Integer.parseInt(next());
    }
    public static void main(String[] args) throws IOException {
        int start = Main.nextInt();
        int end = Main.nextInt();
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
        for (int i = start; i <=end ; i++) {
            map.put(i, 1);
        }
        int nextInt = Main.nextInt();

        for (int i = 0; i < nextInt; i++) {
            int op=Main.nextInt();
            int id=Main.nextInt();
            if(op==1){
                int k=0;
                while (k<id&&!map.isEmpty()){
                    Set<Integer> set = map.keySet();
                    Integer first = set.iterator().next();
                    map.remove(first);
                    k++;
                }
            }else if(op==2){
                if(map.containsKey(id)) {
                    map.remove(id);
                }
            }else {
                if(!map.containsKey(id)&&id<start&&id>end) {
                    map.put(id, 1);
                }
            }
        }
        Set<Integer> integers = map.keySet();
        Integer next = integers.iterator().next();
        System.out.println(next);
    }

}