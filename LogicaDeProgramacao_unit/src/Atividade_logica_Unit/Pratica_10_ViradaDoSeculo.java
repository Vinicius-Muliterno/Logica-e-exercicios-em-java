/*Elabore um programa para ler o ano de nascimento de uma pessoa e mostrar:
		Se a pessoa nasceu no ano 2000: “Você nasceu no ano da virada do século”
		Se a pessoa não nasceu no ano 2000: “Você não nasceu no ano da virada do século”
 */

package Atividade_logica_Unit;

import java.util.Scanner;

public class Pratica_10_ViradaDoSeculo {

	public static void main(String[] args ) {
		
		int anodenascimento;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Qual seu ano de nascimento?");
		anodenascimento = input.nextInt();
		
		if (anodenascimento == 2000) {
			System.out.println("Você nasceu no ano da virada do século");	
		}
		else {
			System.out.println("Você não nasceu no ano da virada do século");
		}
		input.close();
		
		
		
		
		
	}
}
