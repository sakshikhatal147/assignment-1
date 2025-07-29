import java.util.*;
public class Swapwithouttemp
{
public static void main(String args[])
{
int a,b,c;
Scanner sc = new Scanner(System.in);
System.out.println("enter a:");
a = sc.nextInt();
System.out.println("enter b:");
b = sc.nextInt();
System.out.println("b4 swapping a and b is :"+a +b);

    
a = a + b;
a = a - b;
b = a - b;
System.out.println("after swapping a:"+a);
System.out.println("after swapping b:"+b);
}
}