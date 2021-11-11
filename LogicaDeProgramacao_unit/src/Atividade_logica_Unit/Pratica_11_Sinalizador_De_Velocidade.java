/*Escreva um programa para ler a velocidade de um veículo e mostrar:
“Verde”, se a velocidade estiver até 75 km/h.
“Amarelo”, se a velocidade estiver entre 76 e 80 km/h.
“Vermelho”, se a velocidade estiver acima de 80 km/h.
*/


package Atividade_logica_Unit;

import java.util.Scanner;

public class Pratica_11_Sinalizador_De_Velocidade {

	public static void main(String[] args) {
		int velocidade;
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("Qual a velocidade atual do veiculo?");
		velocidade = input.nextInt();
		
		if(velocidade <= 75) {
			System.out.println("Verde");
		}
		
		else if ((velocidade >= 76) && (velocidade <= 80)) {
			System.out.println("Amarelo");
		}
		else 
			{
			System.out.println("Vermelho");
		}		
		
		input.close();
	}
	
	
}


