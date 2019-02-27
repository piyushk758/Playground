import java.util.Scanner;
class Main{
  public static int sum(int n)
  {
    int sum=0;
    for(int i=0;i<=n;i++)
    {
      sum=sum+i;
    }
    return sum;
  }
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int x=sum(n);
      System.out.print(x);
	}
}