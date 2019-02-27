import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    int a=in.nextInt();
    int b=in.nextInt();
    int c=1;
    while(b>0)
    {
      c=c*a;
      b--;
    }
    System.out.print(c);
  }}
