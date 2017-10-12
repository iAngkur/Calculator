import java.util.Scanner;

public class multiplication {
	Scanner smul = new Scanner(System.in);
	
	public void mult(){	
		System.out.println("Enter Numbers");
		System.out.println("a= ");
		double a = smul.nextDouble();
		System.out.println("b= ");
		double b = smul.nextDouble();
		
		System.out.println("Result is= " + (a*b));
		System.out.println();
		Calculator.calcu();
	}

}