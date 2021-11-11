package Atividade_logica_Unit;

import java.util.Scanner;

public class Pratica_01_Precoitem2 {

	public static void main(String[] args) 
	{
		String Nomeproduto;
		int Quantidade;
		double Precoproduto, Valoritem;
		
		
		Scanner scanner = new Scanner (	System.in);
		
		
		System.out.println("Qual o nome do produto?");
		Nomeproduto = scanner.nextLine(); 
		
		System.out.println("Qual o preço do produto? ");
		Precoproduto = scanner.nextDouble();
		
		System.out.println("Qual a Quantidade de produtos?");
		Quantidade = scanner.nextInt();
		
		Valoritem = Precoproduto * Quantidade;
		System.out.println("Esse é o valor do item:\n" + Nomeproduto + " R$" + Valoritem);
		

	
		scanner.close();
	}	

}
