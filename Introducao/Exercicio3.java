package Introducao;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int idade;
		
		System.out.print("Digite sua idade: ");
		idade=leia.nextInt();
		
		
		if(idade>=10 && idade<=14)
			System.out.print("Infantil");
		
		else if(idade>14 && idade<=17)
			System.out.print("Juvenil");
		
		else if(idade>17 && idade<=25)
			System.out.print("Adulto");
		
		else
			System.out.print("Idade não aceita");
		
		

	}

}
