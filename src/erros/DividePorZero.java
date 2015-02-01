package erros;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DividePorZero {
	
	public static void dividir (Scanner s ){
		
		
		
		System.out.println("Nome :");
		int a = s.nextInt();
		System.out.println("divisor");
		int b = s.nextInt();

		System.out.println(a / b);
		
		}
	
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		boolean continua = true;
		
		do {
			try {

				System.out.println("Nome :");
				int a = s.nextInt();
				System.out.println("divisor");
				int b = s.nextInt();

				System.out.println(a / b);
				continua = false;
				
			} catch (InputMismatchException|ArithmeticException e1) {
				System.err.println("Numeros devem ser Inteiros");
				e1.getMessage();
				s.nextLine();
				
			} 
			finally {
				System.out.println("finally Execultado");
			}
		} while (continua);
	}
}
