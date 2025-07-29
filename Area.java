import java.util.*;
public class Area
{
  double b,h,a;
  public double Area()
 {
 a=(0.5)*b*h;
 return a;
 }
 
 double r,c;
 public double circle()
 {
  c= 3.14*r*r;
  return c;
 }

 public static void main(String[] args)
 {
  Area a1=new Area();
  Scanner s =new Scanner(System.in);
  System.out.println("Enter base and height of traingle:");
  a1.b=s.nextDouble();
  a1.h=s.nextDouble();
 System.out.println("Area of triangle:"+a1.Area());

 
 System.out.println("enter radius of circle:");
 a1.r= s.nextDouble();
  System.out.println("Area of Circle:"+a1.circle());



 }  
}