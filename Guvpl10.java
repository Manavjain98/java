import java.util.*;
import java.math.*;
class Guvpl10{
    public static void main(String asd[]){
        Scanner sc=new Scanner(System.in);
        String a=sc.next().toLowerCase();
        String b=sc.next().toLowerCase();
        int c=0;
        int c1=0;
        for(int i=0;i<a.length();i++){
            for(int j=i;j<b.length();j++){
                if(a.charAt(i)!=b.charAt(j)){
                    c++;
                }i++;

            }
        }
        if(c==1){
        
                    System.out.print(" yes");
}
else{
    System.out.print("no");
}
    }
}



