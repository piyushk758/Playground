
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
    match(k,n);
  }
  public static void match(int k[],int n)
  {
    int a=0;
    int b=k[0]+k[1]+k[2];
    for(int i=3;i<n;i+=3)
    {
      int c=k[i]+k[i+1]+k[i+2];
      if(b==c)
        a=1;
    }
    if(a==1)
      System.out.print("Perfect Batch");
    else
      System.out.print("Not a Perfect Batch");
  }
}
  