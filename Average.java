import java.util.Scanner;

class Average
{ 
  // program to calculate average of three numbers
  
  public static void main(String args[])
  {
    double num1,num2,num3;
	double avg;
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter three numbers:");
	num1=sc.nextDouble();
	num2=sc.nextDouble();
	num3=sc.nextDouble();
	
	avg=(num1+num2+num3)/3;
	System.out.println("Average of three numbers is "+avg);
  }
  
}