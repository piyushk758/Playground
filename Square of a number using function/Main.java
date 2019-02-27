import java.util.Scanner;
class Main
{
  public static int square(int n)
  {
    int a=n*n;
    return a;
  }
	public static void main (String[] args)
    {
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int b=square( n);
      System.out.print(b);
	 
	} 
}