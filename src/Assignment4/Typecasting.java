package Assignment4;



import java.util.Scanner;

public class Typecasting {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in); //taking input from user
		
		System.out.println("Enter the first number "); // console window
		byte number1 = in.nextByte(); // out will come in byte
		
		System.out.println("Enter the second number ");// console window
		short number2 = in.nextShort(); // output will come in short
		
		
		byte x = number1;
		short y= number2;
		int i;
		long l;
		float f;
		double d;
		
		//byte & short variables and store their sum in the integer variable.
		i= x+y;
		System.out.println("Sum of byte and short: "+ i);//console window
		
		//short and integer and store their addition in a long variable.
		l= y+i;
		System.out.println("Sum of short and int: "+ l);//console window
		
		//integer and long and store their addition in a float variable.
		f= i+l;
		System.out.println("Sum of int and long: "+ f);//console window
		
		//long and float and store their addition in a double variable.
		d= l+f;
		System.out.println("Sum of long and float: "+ d);//console window
		

	}

	
	}


