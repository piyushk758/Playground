import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       // Type your code here
         Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int k[]=new int[n];
      for(int i=0;i<n;i++)
      {
        k[i]=in.nextInt();
      }
      int non_zero[]=new int[n];
      int a=0;
      int zero[]=new int[n];
      int b=0;
      for(int i=0;i<n;i++)
      {
        if(k[i]!=0)
        {
          non_zero[a]=k[i];
          a++;
        }
        else
        {
          zero[b]=k[i];
          b++;
        }
      }
      int c=0;
      for(int i=0;i<a;i++)
      {
        k[c]=non_zero[i];
        c++;
      }
      for(int i=0;i<b;i++)
      {
        k[c]=zero[i];
        c++;
      }
      for(int i=0;i<n;i++)
      {
        System.out.print(k[i]+" ");
      }
        
    }
}