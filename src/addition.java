import java.util.Scanner;

public class addition {
	Scanner sadd = new Scanner(System.in);
	
	public void addi(){	
		System.out.println("Enter Numbers");
		System.out.println("a= ");
		double a = sadd.nextDouble();
		System.out.println("b= ");
		double b = sadd.nextDouble();
		
		System.out.println("Result is= " + (a+b));
		System.out.println();
		Calculator.calcu();
	}

}
