import java.util.Scanner;
class Main{
	public static void main (String[] args){
        // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int fact=1;
      while(n>0)
      {
        fact=fact*n;
        n--;
      }
      System.out.print(fact);
	}
}