/*Escreva um programa que receba, via teclado, o valor da loca��o e os dias de atraso de um determinado livro e mostre o valor total da multa a ser paga.

Se tiver atraso, � cobrado R$ 1,50 por dia de atraso.
 */ 
package Atividade_logica_Unit;

import java.io.IOException;
import java.util.Scanner;


public class Pratica_09_DevolucaoDeLivroLocado {

	public static void main(String[] args) throws IOException {
		
		double locacao, valoratraso,total;
		int diasatraso;
		char atraso;
		
		
		Scanner input = new Scanner(System.in);	
		System.out.printf("Qual foi o valor da loca��o?\n");	
		locacao = input.nextDouble();
		
		System.out.printf("Livro esta em atraso? (S/N)\n");
		atraso = (char)System.in.read();
		
		
		
		if ((atraso == 'S') || (atraso == 's')){
			
			System.out.printf("Quantos dias de atraso?\n");
			diasatraso = input.nextInt();
			valoratraso = diasatraso * 1.50;
			total = (valoratraso +locacao);
			
			System.out.printf("Este � o valor da sua multa: R$ %.2f" , valoratraso);
			System.out.printf("\nO seu valor total a pagar � de: R$ %.2f" , total);
			
		}
		else{
			System.out.printf("Voc� devolvel na data correta pagar apenas a loca��o.\n"
					+ "Valor da sua loca��o foi de: R$ %.2f",locacao);
		}
		
		
		
		input.close();
	}

}
