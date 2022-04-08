package calculator.device;

public class Calculator {

	protected double currentValue;

	public void clear() {

	}

	public void add(double x, double y) {
		System.out.printf("%.2f + %.2f = %.2f", x, y,(x + y));

	}

	public void subtract(double x, double y) {
		System.out.printf("%.2f - %.2f = %.2f", x, y,(x - y));
	}

	public void multiply(double x, double y) {
		System.out.printf("%.2f * %.2f = %.2f", x, y,(x * y));

	}

	public void divide(double x, double y) {
		if(y != 0)
			System.out.printf("%.2f / %.2f = %.2f", x, y,(x / y));
		else
			System.out.println("Error, you cannot devide by 0");

	}



}

