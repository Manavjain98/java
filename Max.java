import java.io.*;
import java.util.*;
class Maxcount
{
public static void main(String args[]) 
{
    int max,i;
Scanner sc= new Scanner(System.in);
int arr[]=new int[3];
for(i=0;i<arr.length;i++)
{
    arr[i]=sc.nextInt();
}
max=arr[0];
for(i=0;i<3;i++)
    {
        if(max<arr[i])
        {
            max=arr[i];
        }
    }
    System.out.println(""+max);
}
}

