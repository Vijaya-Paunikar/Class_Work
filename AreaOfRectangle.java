import java.util.Scanner;

class AreaOfRectangle
{
  // program to calculate area of rectangle
  
  public static void main(String args[])
  {
    int length,breadth,area; 
    Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter length of an rectangle:");
    length=sc.nextInt();
	
	System.out.println("Enter breadth of an rectangle:");
    breadth=sc.nextInt();
	
	area = length * breadth;
	System.out.println("Area of an rectangle is "+area);
  }
}