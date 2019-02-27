import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
        Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int k[]=new int[n];
      for(int i=0;i<n;i++)
      {
        k[i]=in.nextInt();
      }
      int a=k[0];
      int b;
      for(int i=1;i<n;i++)
      {
        if(a<k[i])
        {
          b=k[i];
          k[i]=a;
          a=b;
        }
      }
      System.out.print(a);
        
    }
}