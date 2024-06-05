package olamundo;

import java.util.Scanner;

public class AtividadePratica2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		float salario;
		float abono;
		float novoSalario;

		
		System.out.println("\nOlá, vamos mostrar seu novo salário! Para começar, digite seu salário atual: ");
		salario = leia.nextFloat();
		
		System.out.println("\nAgora, digite seu abono: ");
		abono = leia.nextFloat();
		
		novoSalario = salario + abono;
		
		System.out.printf("\nBoa notícia! Seu novo salário é de: R$%.2f", novoSalario);

	}
}