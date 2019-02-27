import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
       Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int b=n%10;
      while(n>0)
      {
        n=n/10;
        if(n<10)
          break;
      }
      int a=n;
      int c=a+b;
      System.out.print(c);
	}
}