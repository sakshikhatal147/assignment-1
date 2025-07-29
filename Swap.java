import java.util.*;
public class Swap
{
public static void main(String args[])
{
int a,b,c;
Scanner sc = new Scanner(System.in);
System.out.println("enter a:");
a = sc.nextInt();
System.out.println("enter b:");
b = sc.nextInt();
    c= a;
    a=b;
    b=c;
System.out.println("after swapping a:"+a);
System.out.println("after swapping b:"+b);
}
}