import java.util.Scanner;

public class subtraction {
	Scanner ssub = new Scanner(System.in);
	
	public void subt(){	
		System.out.println("Enter Numbers");
		System.out.println("a= ");
		double a = ssub.nextDouble();
		System.out.println("b= ");
		double b = ssub.nextDouble();
		
		System.out.println("Result is= " + (a-b));
		System.out.println();
		Calculator.calcu();
	}

}