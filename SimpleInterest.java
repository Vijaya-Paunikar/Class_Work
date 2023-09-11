import java.util.Scanner;

class SimpleInterest
{
  // program to calculate simple interest
  
  public static void main(String args[])
  {
    int principle,rateofinterest,simpleinterest,time;
	
    Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter principle:");
    principle=sc.nextInt();
	
	System.out.println("Enter rate of interst:");
    rateofinterest=sc.nextInt();
	
	System.out.println("Enter time period:");
    time=sc.nextInt();
	
	simpleinterest = (principle * rateofinterest * time)/100;
	System.out.println("Simple Interest is "+simpleinterest);
  }
  
}