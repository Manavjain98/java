import java.io.*;
import java.util.*;
class Odd
{
    public static void main (String args[])
    {
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        if(a>=1&&a<=10000)
        {
            if(a % 2==0)
            System.out.println("even");
            else
            System.out.println("odd");
            
        }
        else
        {
            System.out.println("invalid");
        }
        
    }
}

    

