import java.util.*;
import java.math.*;
class Guvpl9{
    public static void main(String asd[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=0;
        String l="";
        BigInteger b1;
        for(int i=a;i<b;i++){
            l=String.valueOf(i);
            b1=new BigInteger(l);
            if(b1.isProbablePrime(5)){
             c++;   
            }
        }
                    System.out.print(c+" ");

    }
}



