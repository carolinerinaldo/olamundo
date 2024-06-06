package olamundo;

import java.util.Scanner;

public class AtividadePratica3 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		float salarioBruto;
		float adicionalNoturno;
		float horasExtras;
		float descontos;
		float salarioLiquido;

		
		System.out.println("\nOlá, vamos mostrar seu salário líquido! Para começar, digite seu salário bruto: ");
		salarioBruto = leia.nextFloat();
		
		System.out.println("\nAgora, digite o valor de seu adicional noturno: ");
		adicionalNoturno = leia.nextFloat();
		
		System.out.println("\nAgora, digite o valor das suas horas extras: ");
		horasExtras = leia.nextFloat();
		
		System.out.println("\nAgora, digite o valor de seus descontos: ");
		descontos = leia.nextFloat();
		
		
		salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras * 5) - descontos;
		
		System.out.printf("\nBoa notícia! Seu salário líquido é de: R$%.2f", salarioLiquido);

	}
}