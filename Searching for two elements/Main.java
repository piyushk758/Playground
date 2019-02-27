import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int k[]=new int[n];
      for(int i=0;i<n;i++)
      {
        k[i]=in.nextInt();
      }
      int a=in.nextInt();
      int b=in.nextInt();
      int m=-1,o=-1;
      for(int i=0;i<n;i++)
      {
        if(k[i]==a)
          m=i;
      }
      for(int i=0;i<n;i++)
      {
        if(k[i]==b)
          o=i;
      }
      System.out.println(m);
      System.out.println(o);

    }
}