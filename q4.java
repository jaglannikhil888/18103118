import java.io.*; 
import java.util.Arrays; 
import java.util.Collections; 
import java.util.Scanner;

public class q4{ 
 
    static boolean chk_anagram(String s1,String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        
        int cnt[] = new int[256];
        
        for(int i=0;i<s1.length();i++) {
            cnt[s1.charAt(i)]++;
            cnt[s2.charAt(i)]--;
        }
        
        for(int i =0;i<256;i++) {
            if (cnt[i]!= 0) {
                return false;
            }
        }
        
        return true;
    }


	public static void main(String args[]) 
	{ 
		Scanner myObj = new Scanner(System.in);
        System.out.println("Enter Strings");
    
        String s1= myObj.nextLine();
        String s2= myObj.nextLine();
        
		if (chk_anagram(s1,s2)) 
			System.out.println("The Two strings are Anagrams"); 
		else
			System.out.println("The Two strings are not Anagrams"); 
	} 
} 
