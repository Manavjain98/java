import java.io.*;
import java.util.*;
class Alpha
{
    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
        if(Character.isLetter(ch))
        {
                System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }  
    }
}

    


