/*Os ingressos para um evento foram classificados em 3 grupos: Normal R$ 100,00, estudante R$ 50,00 e acessível R$ 30,00).

Elabore um programa para ler a quantidade de ingressos vendidos para cada um dos grupos e mostre o público total.
 * 
 */

package Atividade_logica_Unit;

import java.util.Scanner;

public class Pratica_03_IngressosParaEventos {

	public static void main(String[] args) {
		int normal, estudante, acessivel,publico;
		double arrecadado,valornormal,valorestudante,valoracessivel;
		
		
		Scanner ler = new Scanner (System.in);
		
		System.out.println("Digite a quantidade de ingressos vendidos:");
		System.out.println("Normal?");
		normal = ler.nextInt();
		System.out.println("Estudante?");
		estudante = ler.nextInt();
		System.out.println("Acessível?");
		acessivel = ler.nextInt();
		
		publico = (normal + estudante + acessivel);
		valornormal = (100.00 * normal );
		valorestudante = (50.00 * estudante );
		valoracessivel = (30.00 * acessivel );
		
		arrecadado = valornormal + valorestudante + valoracessivel; 
		ler.close();
		System.out.println("O publico total foi de:"+ publico );
		System.out.println("Total arrecadado: " + arrecadado);
		
		
	}

}
