import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Type your code here
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int b=0,a;
    while(n>0)
    {
      a=n%10;
      b=b*10+a;
      n=n/10;
    }
    System.out.print(b);
    
  }
}