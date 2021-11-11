/*
 * Escreva um programa para calcular a área do retângulo.
 */


package Atividade_logica_Unit;

import java.util.Scanner;

public class Pratica_06_AreaDeUmRetangulo {

	public static void main(String[] args) {
		
		
		double altura , base, area;
	
		System.out.println("Digite base e altura de um retangulo para saber sua área: ");

		Scanner ler = new Scanner (System.in);
		
		altura = ler.nextDouble();
				
		base = ler.nextDouble();
		
		area = base * altura;
		
		System.out.print("A área do seu retangulo é igual a: "+ area);
		
		
		
		ler.close();

	}

}
