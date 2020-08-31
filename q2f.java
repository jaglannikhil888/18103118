import java.util.*;
import java.util.Scanner;

public class q2f{
    public static void main(String[] args) {
        int n;
        Scanner scan=new Scanner(System.in);
        n=scan.nextInt();

        if(n<1){
            System.out.println("Invalid Input");
        }
        else {
            while(n!=1) {
                System.out.print(n+" ");
                if(n%2==0){
                    n/=2;
                }
                else{
                    n=n*3+1;
                }
            }

            System.out.print(n+" ");
        }

    }
}
