// calculate total salary of Employee
import java.util.Scanner;

class CalGross
{
  public static void main(String args[])
  {
	  //variable declaration
	  int basicSal;
	  float da;
	  double hra,gross;
	  
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter your Basic Salary:");
	  basicSal = sc.nextInt();
	  
	  System.out.println("Enter your Daily Allowance:");
	  da = sc.nextFloat();
	  
	  System.out.println("Enter your Housing Rent Allowance:");
	  hra = sc.nextDouble();
	  
	  gross=basicSal+da+hra;
	  System.out.println("The Gross Salary is "+gross);
	  sc.close();
  }
}
	  
     