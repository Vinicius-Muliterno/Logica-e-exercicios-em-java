package Atividade_logica_Unit;

import java.util.Scanner;

/*Seu Dodô divide as despesas com energia, água e internet entre seus filhos.

Escreva um algoritmo para receber os valores das contas de cada despesa e a quantidade
 de filho que seu Dôdo tem. Mostre o total das despesas e quanto cada filho vai pagar.
 * 
 */
public class Pratica_02_DivisaoDeDespesas {

	public static void main(String[] args) 
	{

		double energia, agua, internet, divisao, despesas;
		int filhos;
		System.out.println("Divisão de despesas.\n");
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite os Valores da energia, água e internet.");
			
			System.out.println("Qual o valor da energia?");
			energia = ler.nextDouble();
	
			System.out.println("Qual o valor da água?");
			agua = ler.nextDouble();
			
			System.out.println("Qual o valor da internet?");
			internet = ler.nextDouble();
		System.out.println("Qual a quantidade de filhos?");
		filhos = ler.nextInt();
		ler.close();
		despesas = (energia + agua + internet);
		divisao = ((energia + agua + internet) / filhos);
		System.out.println("Suas despesas são: R$"+ despesas);
		System.out.printf("Esse é o valor que cada filho deve pagar: %.2f " , divisao);
			

	}

}
