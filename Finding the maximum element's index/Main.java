import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
     Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int k[]=new int[n];
    for(int i=0;i<n;i++)
    {
      k[i]=in.nextInt();
    }
    int a;
    if(k[0]>k[1])
      a=0;
    else
      a=1;
    for(int i=2;i<n;i++)
    {
      if(k[i]>k[a])
        a=i;
    }
    System.out.print(a);
  }
}