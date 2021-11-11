/*Escreva um programa para receber quantos dias e quantas horas durou uma viagem e mostrar a duração da viagem em horas.

Simulação

Quantos Dias : 2
Quantas Horas: 8


2 * 24 + 8 = 56


Total de horas: 56
 * 
 */

package Atividade_logica_Unit;

import java.util.Scanner;

public class Pratica_04_DuracaoDaViagem {

	public static void main(String[] args) {
	
		int dias ;
		double tempo, horas;
		
		Scanner ler = new Scanner (System.in);
		
		System.out.println("Dias de viagem?");
		dias  = ler.nextInt();
		System.out.println("Horas de viagem?");
		horas = ler.nextDouble();
		
		
		tempo = dias * 24 + horas;
		ler.close();
		System.out.printf("Total de horas: " + tempo);
			
	}
}
