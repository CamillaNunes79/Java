package Introducao;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int n1, n2, n3; 
		
		System.out.println("Digite o primeiro n�mero: ");
		n1 = leia.nextInt();
		
		System.out.println("Digite o segundo n�mero: ");
		n2 = leia.nextInt();
		
		System.out.println("Digite o terceiro n�mero: ");
		n3 = leia.nextInt();
		
		leia.nextLine();
		
		if (n1>n2 && n1>n3) {
			System.out.println(" O maior valor digitado foi: " + n1);
		}
		else if (n2>n1 && n2>n3) {
			System.out.println(" O maior valor digitado foi: " + n2);
		}
	
			else 
				System.out.println("O maior valor digitado foi: " + n3);
		

	}

}
