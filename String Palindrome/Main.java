import java.util.Scanner;
class Main{
    public static void main(String args[]) {
        // Type your code here
      Scanner in=new Scanner(System.in);
      String str=in.nextLine();
      int a=str.length();
      StringBuilder sb=new StringBuilder(str);
      StringBuilder temp=new StringBuilder("");
      for(int i=a-1;i>=0;i--)
      {
        char ch=sb.charAt(i);
        temp.append(ch);
      }
      int count=0;
      for(int i=0;i<a;i++)
      {
        if(sb.charAt(i)==temp.charAt(i))
          count++;
      }
      if(count==a)
        System.out.print("Yes");
      else
        System.out.print("No");
      
      
    } 
}