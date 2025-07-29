import java.util.*;

public class Sum
{
public static void main(String[] args)
{
int n, sumE=0, sumO=0;
Scanner sc= new Scanner(System.in);
System.out.print("Enter the No of elements in array:");
n=sc.nextInt();
int[] a = new int[n];
System.out.print("Enter elements of array:");
for(int i=0; i< n; i++)
{
  a[i] = sc.nextInt();
}

for(int i=0; i< n; i++)
{
if(a[i] % 2 == 0){
    sumE = sumE + a[i];
       
}
else{
     sumO = sumO + a[i]; 
}
}
System.out.println(" sum of even no:" +sumE);
System.out.println(" sum of odd no:" +sumO);



}    
}