import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
      // Type your code here
      Scanner in = new Scanner(System.in);
        int n = in.nextInt();
       int a[] = new int[n];
      for(int i=0;i<n;i++)
      {
        a[i]=in.nextInt();
      }
        int k = in.nextInt();
      int temp;
      for(int i=0;i<n-1;i++)
      {
        for(int j=i+1;j<n;j++)
        {
          if(a[i]>a[j])
          {
            temp=a[i];
            a[i]=a[j];
            a[j]=temp;
          }
        }
      }
      System.out.print(a[n-k]);
        
       
    }   
}