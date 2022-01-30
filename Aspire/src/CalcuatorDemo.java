import java.util.Scanner;

public class CalcuatorDemo {

	public static void main(String[] args) {

	Scanner scan = new Scanner (System.in);
	System.out.println("Please enter a number");
	int num1=scan.nextInt();
	
	
	System.out.println("Please enter another number");
	int num2=scan.nextInt();
	
	int sum = num1+num2;
	System.out.println("Sum of two numbers: " +sum);
		
				
	}

}
