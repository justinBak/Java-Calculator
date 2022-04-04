package calculator;

public class Calculator {
	
	public static int add(int num1, int num2) 
	{
		return num1 + num2;
	}
	
	public static int subtraction(int num1, int num2) 
	{
		return num1 - num2;
	}
	
	public static int multiplication(int num1, int num2) 
	{
		return num1 * num2;
	}
	
	public static int division(int num1, int num2) 
	{
		return num1 / num2;
	}
	
	public static int square(int num1) 
	{
		return num1 * num1;
	}
	
	public class MagicCalculator extends Calculator{
		public static double sqRoot(double num) 
		{
			return Math.sqrt(num);
		}
		
		public static double sin(double num) 
		{
			return Math.sin(num);
		}
		
		public static double cosine(double num) 
		{
			return Math.cos(num);
		}
		
		public static double tangent(double num) 
		{
			return Math.tan(num);
		}
		
		public static int factorial(int num) 
		{
			int fact = 1;
			for(int i = 1; i <= num; i++) {
				fact *= i;
			}
			return fact;
		}
	}

	public static void main(String[] args) 
	{
		System.out.println("Addition:" + " " + Calculator.add(4, 2));
		System.out.println("Subtraction:" + " " + Calculator.subtraction(4, 2));
		System.out.println("Multiplication:" + " " + Calculator.multiplication(4, 2));
		System.out.println("Division:" + " " + Calculator.division(4, 2));
		System.out.println("Squared:" + " " + Calculator.square(2));
		System.out.println("Square Root is:" + " " + MagicCalculator.sqRoot(5));
		System.out.println("Sine is:" + " " + MagicCalculator.sin(5));
		System.out.println("Cosine is:" + " " + MagicCalculator.cosine(5));
		System.out.println("Tangent is:" + " " + MagicCalculator.tangent(5));
		System.out.println("Factorial is:" + " " + MagicCalculator.factorial(5));
	}

}
