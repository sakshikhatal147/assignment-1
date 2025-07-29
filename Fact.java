import java.util.*;

public class Fact{
    public static void main(String args[]){
      int num;
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the number:");
     num = sc.nextInt();
     int fact =1;
     for (int i =num;i>0;i--)
     {    
        fact*=i;
      }
     System.out.println("factorial of"+num+": "+ fact);

   }

}