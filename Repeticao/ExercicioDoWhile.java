package Repeticao;
import java.util.Scanner;
public class ExercicioDoWhile {

	
	    public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);	
        int numero, soma=0;
		
		do 
		{
			System.out.print("Digite um número: ");
			numero = leia.nextInt();
			soma = soma+numero;
			
		}while(numero>0);
		System.out.printf("A soma dos numeros digitados é: ", soma);
	}

}
