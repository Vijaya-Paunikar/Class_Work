import java.util.Scanner;

class SimpleInterestUsingDouble
{
  // program to calculate simple interest
  
  public static void main(String args[])
  {
    double principle,rateofinterest,time,simpleinterest;
	
    Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter principle:");
    principle=sc.nextDouble();
	
	System.out.println("Enter rate of interst:");
    rateofinterest=sc.nextDouble();
	
	System.out.println("Enter time period:");
    time=sc.nextDouble();
	
	simpleinterest = (principle * rateofinterest * time)/100;
	System.out.println("Simple Interest is "+simpleinterest);
  }
  
}