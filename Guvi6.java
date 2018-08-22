import java.util.*;
import java.math.*;
class Guvi6{
    public static void main(String asd[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        String l="";
        BigInteger b1;
        for(int i=a;i<b;i++){
            l=String.valueOf(i);
            b1=new BigInteger(l);
            if(b1.isProbablePrime(5)){
                System.out.print(l+" ");
            }
        }
    }
}
