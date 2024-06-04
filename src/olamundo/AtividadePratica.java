package olamundo;

import java.util.Scanner;

public class AtividadePratica {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		float nota1;
		float nota2;
		float nota3;
		float nota4;
		
		System.out.println("\nDigite a sua primeira nota: ");
		nota1 = leia.nextFloat();
		
		System.out.println("\nDigite a sua segunda nota: ");
		nota2 = leia.nextFloat();
		
		System.out.println("\nDigite a sua terceira nota: ");
		nota3 = leia.nextFloat();
		
		System.out.println("\nDigite a sua quarta nota: ");
		nota4 = leia.nextFloat();
		
		System.out.println("\nA sua média final é: " + ((nota1 + nota2 + nota3 + nota4)/4));

	}
}
