import java.util.*;
class Guvpl8{
    public static void main(String asd[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine().toLowerCase();
        String a[]=s.split(" ");
        String s1="";
        for(int i=0;i<a.length;i++){
                s1=a[i].substring(0,1).toUpperCase()+a[i].substring(1);
                        System.out.print(s1+" ");

            }
    }
}

