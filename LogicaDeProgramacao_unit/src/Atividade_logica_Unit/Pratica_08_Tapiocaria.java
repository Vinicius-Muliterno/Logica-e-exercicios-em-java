/*
 *Um tapiocaria comercializa tapioca simples por R$ 5,00 e tapioca gourmet por R$ 8,00.

Elabore um programa que leia a quantidade de tapiocas vendidas de cada tipo e quanto gastou para comprar os ingredientes. Mostre:
Quantidade total de tapiocas vendidas
O valor apurado com as vendas de tapiocas simples
O valor apurado com as vendas de tapiocas gourmet
O valor total bruto apurado com as vendas
O valor total líquido* apurado com as vendas
* Valor total líquido, descontar o valor gasto com ingredientes 
 */


package Atividade_logica_Unit;

import java.util.Scanner;

public class Pratica_08_Tapiocaria {

	public static void main(String[] args) {
		
		double vendasimples , vendagourmet , totalvendas , vendasliquidas, liquido;
		int simples , gourmet , quantidade ; 
		
	System.out.println("Saiba quantas tapiocas vendeu.");
	System.out.println("\n Digite quantas tapiocas vendeu simples e gourmet. ");
	
	Scanner ler = new Scanner(System.in);
	
	System.out.println("Tapioca simples: ");
	simples = ler.nextInt(); 
	
	System.out.println("Tapioca gourmet: ");
	gourmet = ler.nextInt();
	
	quantidade = simples+gourmet;
	vendasimples = simples * 5.00;
	vendagourmet = gourmet * 8.00;
	totalvendas = vendasimples + vendagourmet;
	vendasliquidas = totalvendas * 0.30;
	liquido = totalvendas - vendasliquidas;
	
	
	System.out.println("Quantidade total de tapiocas vendidas: " + quantidade );
	System.out.println("O valor apurado com as vendas de tapiocas simples: R$" + vendasimples );
	System.out.println("O valor apurado com as vendas de tapiocas gourmet: R$" + vendagourmet);
	System.out.println("O valor total bruto apurado com as vendas: R$" + totalvendas );
	System.out.println("O valor total líquido apurado com as vendas: R$" + liquido);
	
	
	ler.close();
	
			

	}

}
