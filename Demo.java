import java.io.*;
import java.util.*;
class Demo
{
    public static void main(String s[])
    {
      int a[]={5,7,8,9,55,53};
      System.out.println("List of Even numbers from array");
      
      for (int i=0; i<a.length;i++)
      {
         if(a[i]%2==0)
         {
          System.out.println("Even numbers"+a[i]);
         }
         else
         {
          System.out.println("Odd numbers"+a[i]);
         }
      }
    }

}
