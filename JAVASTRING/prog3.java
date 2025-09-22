package CORE;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class prog3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        HashSet<Character> set = new HashSet<>();
        for(char c:str.toCharArray()){
            set.add(c);
        }
        StringBuilder sb = new StringBuilder();
        for(char c:set){
            sb.append(c);
        }
        System.out.println(sb);

    }
    
}
