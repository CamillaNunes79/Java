package Repeticao;
import java.util.Scanner;
public class Exercicio3While {

	public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
		
		int idade, menos21=0, mais50=0; 
	
		System.out.print("Digite sua idade: ");
		idade=ler.nextInt();
		
		while(idade!= -99)
		{
			System.out.print("Digite sua idade: ");
			idade=ler.nextInt();
			
			if(idade<21)
			{
				menos21++;
			}
			if(idade>50)
			{
				mais50++;
			}
												
		}
		System.out.println("O total de pessoas com menos de 21 anos ?: "+menos21);
		System.out.println("O total de pessoas com mais de 50 anos ?: "+mais50);

	}

}
