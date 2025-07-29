import java.util.*;
public class FactRecur{

    int fact(int n){
    int fact1=1;
    if(n>=1)
    fact1=n*fact(n-1);
    return fact1;

}


public static void main(String args[]){
int num;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Number:");
 num = sc.nextInt();
FactRecur f=new FactRecur();

System.out.println("Factorial:"+f.fact(num));

}

}