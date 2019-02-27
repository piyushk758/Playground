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
      int value=in.nextInt();
      for(int i=0;i<n-1;i++)
      {
        for(int j=i+1;j<n;j++)
        {
          if(k[i]+k[j]==value)
            System.out.println(k[i]+", "+k[j]);
        }
      }
    }
}