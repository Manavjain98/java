import java.util.*;
class Guvpl6{
    public static void main(String asd[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.next().toLowerCase();
        String s1=sc.next().toLowerCase();
        ArrayList<Character> al=new ArrayList<Character>();
        for(int i=0;i<s.length();i++){
            al.add(s.charAt(i));
        }
        ArrayList<Character> al1=new ArrayList<Character>();
        for(int i=0;i<s1.length();i++){
            al1.add(s1.charAt(i));
        }
        String s2="",s3="";
        Set<Character> ts=new LinkedHashSet<Character>(al);
        for(Character ts1:ts){
            s2+=Collections.frequency(al,ts1);
        }
        Set<Character> ts2=new LinkedHashSet<Character>(al1);
        for(Character ts4:ts2){
            s3+=Collections.frequency(al1,ts4);
        }
        if(s2.equals(s3)){
            System.out.print("yes");
        }
        else{
            System.out.print("no");
        }
        
        
    }
}


