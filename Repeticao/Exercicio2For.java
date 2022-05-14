package Repeticao;

import java.util.Scanner;

public class Exercicio2For {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
int num, contPar = 0, contImpar = 0;
        
        for(int i = 1; i <= 10; i++){
            System.out.println("Digite um número: ");
            num = leia.nextInt();
            
            if(num % 2 == 0){
                contPar++;
                System.out.println("Foram digitados " + contPar + " números pares \n");
                System.out.println("Foram digitados " + contImpar + " números impares \n");
               
            }

	}

	}
}
