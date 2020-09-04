import java.util.*;
public class A2_q4{
    public static void main(String[] args){
        int n=1;
        long sum= 1;
        while(n<Integer.MAX_VALUE){
            if(sum==n*n){
                System.out.println("Result: "+n);
            }
            n+=1;
            sum+=n;
        }
        System.out.println("Last value\n n = " +n+" sum= "+sum );
    }
}