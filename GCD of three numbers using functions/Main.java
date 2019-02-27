import java.util.Scanner;
public class Main{
	public static void main (String[] args)
	{
	    // Type your code here
       Scanner in=new Scanner(System.in);
      int a=in.nextInt();
      int b=in.nextInt();
      int c=in.nextInt();
      int d;
      if(a<b&&a<c)
        d=a;
      else if(b<c)
        d=b;
      else
        d=c;
      for(int i=d;i>=1;i--)
      {
        if(a%d==0&&b%d==0&&c%d==0)
        {
          System.out.print(i);
          break;
        }
      }
	}
}