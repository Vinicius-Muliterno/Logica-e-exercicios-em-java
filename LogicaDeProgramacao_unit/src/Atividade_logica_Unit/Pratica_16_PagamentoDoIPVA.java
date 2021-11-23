/*
 * Escreva um programa para receber o final da placa e o valor de 6 veículos.

Para cada veículo informar o mês de pagamento do IPVA, conforme a seguinte regra:
Final de 1 a 3: Janeiro
Final de 3 a 6: Fevereiro
Final de 6 a 9: Março
Final de 10 a 12: Dezembro
No final mostrar o valor arrecadado com IPVA por mês e o valor total arrecadado.

Obs.: O valor do IPVA é 10% do valor do veículo.
 */
package Atividade_logica_Unit;

import java.util.Scanner;

public class Pratica_16_PagamentoDoIPVA {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		 int finalplaca;
		 //double valorveiculo = 0;
		// double IPVA= (valorveiculo * 0.10);
		 
		 
				 
			for (int veiculos = 1; veiculos < 7;veiculos++ ) {
				
				do {
					System.out.println("Qual o final da placa do veiculo?");
					finalplaca = input.nextInt();
					if (finalplaca < 0 || finalplaca > 12) {
	                    System.out.println("Final de placa incorreta");
	                    continue;
	                }
	                break;
	            } while (true);
	      input.close();
			}
	}
}
				
				/*do{
					
					
				
					System.out.println("Qual o valor do veiculo?");
					valorveiculo = input.nextDouble(); 
				
						if (finalplaca > 0 || finalplaca < 13) {
							if ((finalplaca < 1) || (finalplaca <=3) ) {
							System.out.println("Janeiro");
							}
							
							if ((finalplaca < 3) || (finalplaca <=6) ) {
								System.out.println("Fevereiro");
							}
							
							if ((finalplaca < 6) || (finalplaca <=9) ) {
								System.out.println("Março");
							}
							
							if ((finalplaca <= 10) || (finalplaca <=12) ) {
								System.out.println("Dezembro");
							}
										
							
						}
						
						//input.close();	
				}while(true);
		*/
			






