import java.util.*;

public class OddEven
{
public static void main(String[] args)
{
int n;
Scanner sc= new Scanner(System.in);
System.out.print("Enter the No:");
n=sc.nextInt();
if(n % 2 == 0){
    System.out.println("even");
}
else{
    System.out.println("odd");
}
}    
}