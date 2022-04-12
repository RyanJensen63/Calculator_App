package calculator.device;
import java.util.Scanner;
public interface AdvanceMath {

	public static void main(String a[])
	{

		int num = 0, option,ex;
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("1. Square Root");
			System.out.println("2. Power of a Number");
			System.out.println("3. Exit");
			System.out.println("==============================================================================");
			System.out.println("Please Enter the Number that corresponds with your choice: ");
			System.out.println("==============================================================================");
			option = sc.nextInt();
			System.out.println("==============================================================================");


			if(option!=3){
				System.out.println("Enter the Base Number");
				num=sc.nextInt();
			}
			else
				break;
			switch(option)
			{
			case 1:

				Double squareroot = Math.pow(num, 0.5);


				System.out.println("\n");
				System.out.println("The Square root of " + num + "  =  " + squareroot);
				System.out.println("==============================================================================");

				break;

			case 2:Scanner sc2 = new Scanner(System.in);


			System.out.println("Enter the exponet: ");
			int power = sc2.nextInt();

			int pow = (int) Math.pow(num, power);
			System.out.println("Power of a " + num + "^" + power + ": " + pow);
			sc2.close();
			System.out.println("==============================================================================");
			break;

			case 3: 
				break;

			default: System.out.println("Invalid choice");
			}

			System.out.println("Do you want to continue?");
			System.out.println("==============================================================================");
			System.out.println("Enter 1 For Yes");
			System.out.println("Enter 2 For No");
			System.out.println("==============================================================================");
			ex=sc.nextInt();
			sc.close();
		} while(ex==1);

	}
}