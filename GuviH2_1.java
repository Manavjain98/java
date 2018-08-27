import java.util.*;
class GuviH2_1{
    public static void main(String asdf[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String s1="";
        String a[]=s.split(" ");
        String ss="";
        for(int i=0;i<a.length;i++){
            s1=a[i];
            StringBuffer sb=new StringBuffer(s1);
            sb=sb.reverse();
            ss=sb.toString();
                    System.out.print(ss+" ");

        }
    }
}
