import java.util.Scanner;

public class division {
	Scanner sdiv = new Scanner(System.in);
	
	public void divi(){	
		System.out.println("Enter Numbers");
		System.out.println("a= ");
		double a = sdiv.nextDouble();
		System.out.println("b= ");
		double b = sdiv.nextDouble();
		
		System.out.println("Result is= " + (a/b));
		System.out.println();
		Calculator.calcu();
	}

}