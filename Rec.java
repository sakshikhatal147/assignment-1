import java.util.*;
public class Rec
{
  public int fact(int n)
{
 int total=1;
 if(n>=1)
 total= n*fact(n-1);
 return total;
}
  public static void main(String[] args)
  {
  int n;
  System.out.print("enter no:");
  Scanner sc= new Scanner(System.in);
  n=sc.nextInt();
  Rec f = new Rec();
  System.out.print("factorial is:"+f.fact(n));
  }
}