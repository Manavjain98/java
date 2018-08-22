import java.util.*;
import java.math.*;
class Guvi7{
    public static void main(String asd[]){
        Scanner sc=new Scanner(System.in);
       String s=sc.next();
       int l=Integer.valueOf(s);
       int n=0;int n1=0;
       for(int i=0;i<s.length();i++){
           n=Character.getNumericValue(s.charAt(i));
           n1+=(int)Math.pow(n,3);
       }
       if(n1==l){
           System.out.print("yes");
       }
       else{
           System.out.print("no") ;
       }
    }
}
