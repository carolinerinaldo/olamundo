package olamundo;

import java.util.Scanner;

public class AtividadePratica4 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		float n1;
		float n2;
		float n3;
		float n4;
	
		
		System.out.println("\nDigite o primeiro número: ");
		n1 = leia.nextFloat();
		
		System.out.println("\nDigite o segundo número: ");
		n2 = leia.nextFloat();
		
		System.out.println("\nDigite o terceiro número: ");
		n3 = leia.nextFloat();
		
		System.out.println("\nDigite o quarto número: ");
		n4 = leia.nextFloat();
		
		System.out.println("\nO resultado da diferença entre o produto do seu 1º e 2º número com o 3º e 4º número é: " + ((n1 * n2) - (n3 * n4)));

	}
}