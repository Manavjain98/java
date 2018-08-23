import java.util.*;
class Guvpl7{
    public static void main(String asd[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.next().toLowerCase();
        String s1="";
        for(int i=0;i<s.length();i++){
            if(i%2==0){
                s1+=String.valueOf(s.charAt(i+1));
            }
            else{
                s1+=String.valueOf(s.charAt(i-1));
            }
        }
        System.out.print(s1);
    }
}

