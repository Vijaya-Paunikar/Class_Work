/* Note: When we are using conditional statements 
we make use of comparison or relational operators
<,>,<=,>=,==,!=  */

import java.util.Scanner;

class IfDemo
{
   public static void main(String args[])
   {
     int num;
     Scanner sc=new Scanner(System.in);
	 
	 System.out.println("Enter an number:");
	 num=sc.nextInt();
     
     if(num>0) //this returns boolean expression True or False
	 {
	   System.out.println("Welcome to Java Programming");
	 }
	 
	 System.out.println("You Enjoy");
	 sc.close();
   }
}