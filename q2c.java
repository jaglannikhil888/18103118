import java.util.*;
import java.util.Scanner;

public class q2c {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        String s=scan.next();
        char[] chars =s.toCharArray();

        for (int i=0;i<chars.length-1;i++) {
            int index=i;

            for (int j=i+1;j<chars.length;j++) {
                if(chars[j]<chars[index]){
                    index=j;
                }
            }

            char temp=chars[index];
            chars[index]=chars[i];
            chars[i]=temp;
        }

        for(int k=0;k<chars.length;k++){
            System.out.print(chars[k]);
        }

    }
}
