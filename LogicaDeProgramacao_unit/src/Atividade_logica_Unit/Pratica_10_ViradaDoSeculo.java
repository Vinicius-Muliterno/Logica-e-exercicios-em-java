/*Elabore um programa para ler o ano de nascimento de uma pessoa e mostrar:
		Se a pessoa nasceu no ano 2000: �Voc� nasceu no ano da virada do s�culo�
		Se a pessoa n�o nasceu no ano 2000: �Voc� n�o nasceu no ano da virada do s�culo�
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
			System.out.println("Voc� nasceu no ano da virada do s�culo");	
		}
		else {
			System.out.println("Voc� n�o nasceu no ano da virada do s�culo");
		}
		input.close();
		
		
		
		
		
	}
}
