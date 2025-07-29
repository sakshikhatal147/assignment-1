import java.util.*;
public class Add
{
	public static void main(String[] args)
        {
	int a,b,c;
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter a,b and c:");
	a= sc.nextInt();
	b= sc.nextInt();
	c= sc.nextInt();
	
	int a1=a+b+c;
	int a2=(a+b+c)/3;
	System.out.println("Addition is :"+a1);
	System.out.println("Average is :"+a2);
	
	}
}