import java.util.Scanner;

public class Calculator {
	static Scanner scr = new Scanner(System.in);
	static addition add = new addition();
	static subtraction sub = new subtraction();
	static multiplication mul = new multiplication();
	static division div = new division();
	
	public static void calcu(){
		System.out.println("Enter Your Choice:");
		System.out.println("1. ADDITION");
		System.out.println("2. SUBTRACTION");
		System.out.println("3. MULTIPLICATION");
		System.out.println("4. DIVISION");
		System.out.println("5. Exit");
		
		int choice = scr.nextInt();
		
		switch(choice){
			case 1:
				add.addi();
				break;
			case 2:
				sub.subt();
				break;
			case 3:
				mul.mult();
				break;
			case 4:
				div.divi();
				break;
			case 5:
				System.out.println("						Copyright@ Angkur Mondal");
				break;
			default:
				System.out.println("Error!");
				break;
		}
	}

	public static void main(String[] args) {
		System.out.println("		WELCOME!");
		calcu();
		
	}

}
