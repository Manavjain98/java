import java.util.*;
class Guvipls2_5{
    public static void main(String asd[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String a[]=s.split(" ");
        String h="";
        ArrayList<Character> al=new ArrayList<Character>();
        for(int i=0;i<a.length;i++){
            h=a[i];
            for(int j=0;j<h.length();j++){
            al.add(a[i].charAt(j));
        }
        }
        int max=0;String sa="";char ch=' ';
        Set<Character> ts=new LinkedHashSet<Character>(al);
        for(Character k:ts){
            if(Collections.frequency(al,k)>max){
                max=Collections.frequency(al,k);
            }
        }
        Set<Character>hs1=new LinkedHashSet<Character>(al);
        for(Character l:hs1){
            if(Collections.frequency(al,l)==max){
                System.out.print(l);
            }
        }
    }
}



