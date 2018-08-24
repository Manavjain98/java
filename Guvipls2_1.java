import java.util.*;
class Guvipls2_1{
    public static void main(String asd[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int c=0;
        String s2[]={"monday","tuesday","wednesday","thursday","friday"};
        for(int i=0;i<s2.length;i++){
        if(s.equalsIgnoreCase(s2[i])){
            c++;
        }
        }
        if(c>0){
            System.out.print("no");
        }
        else{
            System.out.print("yes");
        }
    }
}



