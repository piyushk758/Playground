import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    // your code here
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++)
    {
      a[i]=in.nextInt();
    }
    int count[]=new int[n];
    int x=0,y=1;
    for(int i=0;i<n-1;i++)
    {
      for(int j=i+1;j<n;j++)
      {
        if(a[i]==a[j])
          y++;
      }
        count[i]=y;
        y=1;
      }
    for(int i=0;i<n;i++)
    {
      if(count[i]>count[x])
        x=i;
    }
    System.out.print(a[x]);
    
  }
}