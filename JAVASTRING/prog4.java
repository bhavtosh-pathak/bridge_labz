package CORE;

import java.util.Scanner;

public class prog4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    int max=0;
    int cnt=0;
    for(int i=0;i<str.length();i++){
        char ch = str.charAt(i);
        if(ch!=' '){
            cnt+=1;
        }
        else{
            max = Math.max(max,cnt);
            cnt=0;
        }
        
    }
    System.out.println(max);
    }
    
}
