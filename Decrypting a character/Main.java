import java.util.Scanner;
public class Main{
    public static void main(String args[]) {
        // Type your code here
      Scanner in =new Scanner(System.in);
      char ch=in.next().charAt(0);
      int n=in.nextInt();
      if(ch>='a'&&ch<='z')
      {
        ch=(char)(ch-n);
        if(ch<'a')
          ch=(char)(ch+26);
      }
       else if(ch>='A'&&ch<='Z')
      {
        ch=(char)(ch-n);
        if(ch<'A')
          ch=(char)(ch+26);
      }
      System.out.print(ch);
    }
}