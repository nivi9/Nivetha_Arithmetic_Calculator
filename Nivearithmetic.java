import java.util.Scanner;
public class Nivearithmetic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		System.out.print("Enter two numbers: \n");
		Scanner sc = new Scanner(System.in);				// Take input from the user
		
		
		double num1 = sc.nextDouble();
		double num2 = sc.nextDouble();
		
		System.out.print("Enter an operator (+, -, *, /): \n");
		
		char oper = sc.next().charAt(0);
		double res;                                                
		switch(oper)
		{
		
		case '+':
		res = num1 + num2;                                          // Addition of two Numbers
		System.out.printf("Sum of two numbers : " + " %.1f %c %.1f =%.1f ", num1, oper, num2, res);
		break;
		
		case '-':
		res = num1 - num2;						// Difference of two Numbers			
		System.out.printf("Difference of two numbers : " + " %.1f %c %.1f =%.1f ", num1, oper, num2, res);
		break;
		
		case '*':			
		res = num1 * num2;						 // Product of two Numbers
		System.out.printf("Product of two numbers is  " + " %.1f %c %.1f =%.1f ", num1, oper, num2, res);
		break;
		
		case '/':
		res = num1 / num2;						 // Quotient of two Numbers		
		System.out.printf("Division of two numbers " + " %.1f %c %.1f =%.1f ", num1, oper, num2, res);
		break;

		default:
		System.out.printf("operator is  incorrect");
		return;
		}

		}
		}