import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<n;i++)
      {
        arr[i]=in.nextInt();
      }
      int temp[]=new int[n];
      int j=0;
      for(int i=n-1;i>=0;i--)
      {
        temp[j]=arr[i];
        j++;
      }
      int count=0;
      for(int i=0;i<n;i++)
      {
        if(arr[i]==temp[i])
          count++;
      }
      if(count==n)
        System.out.print("Yes");
      else
        System.out.print("No");
      
           
    }
}