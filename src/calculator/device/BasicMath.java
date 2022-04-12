package calculator.device;
import java.util.Scanner;
public interface BasicMath{

	public static void main(String a[])
	{

		int num1 = 0, num2 = 0, option,ex;
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("1. Addition");
			System.out.println("2. Subtraction");
			System.out.println("3. Multiplication");
			System.out.println("4. Division");
			System.out.println("5. Exit");
			System.out.println("==============================================================================");
			System.out.println("Please Enter the Number that corresponds with your choice: ");
			System.out.println("==============================================================================");
			option = sc.nextInt();
			System.out.println("==============================================================================");

			if(option!=5){
				System.out.println("Enter the first number");
				num1=sc.nextInt();
				System.out.println("Enter the second number");
				num2=sc.nextInt();
				System.out.println("==============================================================================");
			}
			else
				break;
			switch(option)
			{
			case 1:System.out.println("If you Add " + num1 + " and " + num2 + " it will = " +(num1 + num2));
				System.out.println("==============================================================================");
			break;

			case 2:System.out.println("If you Subtract "+ num1 +" and "+ num2 +" it will = " +(num1 - num2));
				System.out.println("==============================================================================");
			break;
			
			case 3:System.out.println("If you Multiply "+ num1 +" and "+ num2 +" it will = " +(num1 * num2));
				System.out.println("==============================================================================");
			break;

			case 4: if(num2==0)
				System.out.println("Error... You cannot devide by zero");	
			else{
				System.out.println("If you Divide"+ num1 +" and "+ num2 + "it will = " +(num1 / num2));
				System.out.println("==============================================================================");
			} 

			break;

			case 5: 
				break;

			default: System.out.println("Invalid choice");
			}

			System.out.println("Do you want to continue?");
			System.out.println("==============================================================================");
			System.out.println("Enter 1 For Yes");
			System.out.println("Enter 2 For No");
			System.out.println("==============================================================================");
			ex=sc.nextInt();
			
		} while(ex==1);
	}
}