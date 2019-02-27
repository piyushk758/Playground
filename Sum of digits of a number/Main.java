import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int a=0;
      while(n>0)
      {
        int b=n%10;
        a=a+b;
        n=n/10;
      }
      System.out.print(a);
	}
}