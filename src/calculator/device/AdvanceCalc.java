package calculator.device;
import java.util.Scanner;
public class AdvanceCalc {

	public static void main(String[] args)
	{
		Double num;

		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a number: ");
		System.out.println("\n");
		num = sc.nextDouble();
		Double squareroot = Math.pow(num, 0.5);
		
		
		System.out.println("\n");
		System.out.println("The Square root " + num + "  =  " + squareroot);
	}

	public void pow() {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your base number: ");
		int number = scanner.nextInt();
		System.out.println("Enter the exponet: ");
		int power = scanner.nextInt();
		scanner.close();

		int pow = (int) Math.pow(number, power);
		System.out.println("Power of a " + number + "^" + power + ": " + pow);
	}

}






