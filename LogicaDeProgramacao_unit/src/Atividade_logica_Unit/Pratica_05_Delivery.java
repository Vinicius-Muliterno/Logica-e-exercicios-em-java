/*Problema: Um delivery oferece dois tipos de prato (R$ 10,00 e R$ 13,00) e cobra R$ 7,00 de taxa de entrega, independente da quantidade de pratos.

Requisito: Mostrar o valor da conta, considerando que o cliente pode pedir quantidades diferentes para cada tipo de prato.
 * 
 * 
 * */

package Atividade_logica_Unit;

import java.util.Scanner;

public class Pratica_05_Delivery {

	public static void main(String[] args) {
		double prato1, prato2, conta;
		
		
	Scanner ler = new Scanner(System.in);
	System.out.println("Quantidade de pratos 1?");
	prato1 = ler.nextDouble();
	
	System.out.println("Quantidade de pratos 2?");
	prato2 = ler.nextDouble();
	
	prato1 = (prato1 * 10.00);
	prato2 = (prato2 * 13.00);
	
	conta = ((prato1 + prato2) + 7.00);
	
	System.out.println("Conta do cliente: R$" + conta);
	
	
	
	
	ler.close();
	
		
		

	}

}
