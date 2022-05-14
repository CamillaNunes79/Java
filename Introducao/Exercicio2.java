package Introducao;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int n1, n2, n3;
		
		System.out.println("Digite o pimeiro número: ");
		n1 = leia.nextInt();
		
		System.out.println("Digite o segundo número: ");
		n2 = leia.nextInt();
		
		System.out.println("Digite o terceiro número: ");
		n3 = leia.nextInt();
		
		leia.nextLine();
		if (n1>n2 && n2>n3)
		{
			System.out.println("A ordem crescente é "+ n3 + ", "+ n2 + ", "+ n1);
		}
		
		else if (n1<n2 && n2<n3) 
		{
			System.out.println("A ordem crescente é " + n1 + ", " + n2 + ", " + n3);
		}
		
		else if (n2<n3 && n3<n1)
		{
			System.out.println("A ordem crescente é " + n2 + ", " + n3 + ", " + n1);	
		}
		
		else if (n2>n3 && n3<1);
		}
		
		
		
		
				
		
		

	}


