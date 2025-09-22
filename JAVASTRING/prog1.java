package CORE;

import java.util.Scanner;

public class prog1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vow=0;
        int cons=0;
        String a = sc.next();
        for(int i=0;i<a.length();i++){
            char ch = a.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                vow++;

            }
            else{
                cons++;
            }
        }
        System.out.println("total vowels are "+vow+" and total cons are "+cons);
    }
    
}
