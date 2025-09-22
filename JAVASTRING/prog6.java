
import java.util.*;
public class MostFrequentChar {
    public static void main(String[] args) {
        String str = "programming";
        int[] freq = new int[256]; 

       
        for (char c : str.toCharArray()) {
            freq[c]++;
        }

    
        char maxChar = str.charAt(0);
        int maxFreq = freq[maxChar];

        for (int i = 1; i < str.length(); i++) {
            char c = str.charAt(i);
            if (freq[c] > maxFreq) {
                maxFreq = freq[c];
                maxChar = c;
            }
        }

        System.out.println("Most frequent character: " + maxChar);
        System.out.println("Frequency: " + maxFreq);
    }
}
