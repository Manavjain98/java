import java.io.*;
import java.util.*;
class Vovels
{
    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
        if(Character.isLetter(ch))
        {
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'&&
            ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
            {
                System.out.println("Vovels");
                
            }
            else
            {
                System.out.println("consonant");
                
            }
        }
        else
        {
            System.out.println("Invalid");
        }

        
    }
}

    

