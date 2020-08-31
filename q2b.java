import java.util.*;
import java.util.Scanner;

public class q2b {
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();

        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=scan.nextInt();
        }

        int count[]=new int[100005];
        for(int i=0;i<21;i++){
            count[i]=0;
        }

        for(int i=0;i<n;i++) {
            count[a[i]]++;
        }

        int i=0;
        int index=0;
        while(i<n && index<21) {
            while(index<21 && count[index]<=0){
                index++;
            }
            if(index==21){
                break;
            }

            a[i++]=index;
            count[index]--;
        }

        for(i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }

    }
}
