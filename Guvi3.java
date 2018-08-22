import java.util.*;
import java.math.*;
class Guvi3{
    public static void main(String asd[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        String l="";
        BigInteger b1;
        if(a<=1000){
            l=String.valueOf(a);
            b1=new BigInteger(l);
            if(b1.isProbablePrime(5)){
                System.out.print("yes ");
            }
            else{
                System.out.print("no");
        }
        
        }
        else{
            System.out.print("no");
        }
    }
}
