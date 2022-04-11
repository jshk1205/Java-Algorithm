import java.util.Scanner;
import java.lang.Math;

public class DistributedProcessing {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t,a, b,temp = 0;
        t= scan.nextInt();
        for (int i = 0; i<t; i++){
            a= scan.nextInt();
            b= scan.nextInt();
            a = a%10;
            if (a == 0){
                System.out.println(10);
            }
            else if(a==1||a==5||a==6){
                System.out.println(a);
            }
            else if(a == 4 || a == 9){
                b = b%2;
                if(b==0){
                    System.out.println((int)((Math.pow(a,2))%10));
                }
                else{
                    System.out.println(a);
                }
            }
            else{
                b = b%4;
                if (b == 0){
                    System.out.println((int)((Math.pow(a,4))%10));
                }
                else {
                    System.out.println((int)((Math.pow(a,b))%10));
                }
            }
        }
        scan.close();
    }
}
