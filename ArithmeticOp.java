import java.util.Scanner; //import scanner class from util package

class ArithmeticOp
{
   /* program to demonstrate use of arithmetic
   operators. */
   
   public static void main(String args[])
   {
	 int num1,num2,res; //declaration of variables  
	 Scanner sc=new Scanner(System.in);
	 
	 System.out.println("Enter two numbers");
	 num1=sc.nextInt(); // Reading the value from screen and storing in num1
	 num2=sc.nextInt();
	 
	 res=num1+num2;
	 System.out.println("The addition is "+res);
	 
	 res=num1-num2;
	 System.out.println("The subtraction is "+res);
	 
	 res=num1*num2;
	 System.out.println("The multiplication is "+res);
	 
	 res=num1/num2;
	 System.out.println("The division is "+res);
	 
	 res=num1%num2;
	 System.out.println("The modulus is "+res); //modulus is used to find remainder
   }
}