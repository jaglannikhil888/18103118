import java.util.*;
import java.util.Scanner;

public class q2a
    {
        public static void main(String args[])
        {
            String s1,s2;
            Scanner scan=new Scanner(System.in);
            s1=scan.next();
            s2=scan.next();

            int l1=s1.length();
            int l2=s2.length();
            int l= Math.min(l1, l2);
            int flg=0;

            for(int i=0;i<l;i++)
            {
                if(s1.charAt(i)<s2.charAt(i)){
                    flg=1;
                    break;
                }
                else if(s1.charAt(i)>s2.charAt(i)) {
                    flg=2;
                    break;
                }
            }

            if(flg==0){
                if(l1==l2){
                    System.out.println("Equal");
                }
                else if(l1<l2){
                    System.out.println("First String is smaller");
                }
                else{
                    System.out.println("Second String is smaller");
                }
            }
            else if(flg==1){
                System.out.println("First String is smaller");
            }
            else{
                System.out.println("Second String is smaller");
            }

        }

    }
