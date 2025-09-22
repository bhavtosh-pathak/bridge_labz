package CORE;

import java.util.Arrays;
import java.util.Scanner;

public class prog9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        char[] arr = a.toCharArray();
        char[] brr= b.toCharArray();
        Arrays.sort(arr);
        Arrays.sort(brr);
        System.out.println(Arrays.equals(arr,brr));
    }
    
}
