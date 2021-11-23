/*
Escreva um programa para receber:
� Tipo do im�vel
Criticar para s� aceitar �R�, �C� ou �I�
� Valor anterior do medidor de energia
Criticar para s� aceitar valor positivo
� Valor atual do medidor de energia
Criticar para s� aceitar valor maior que o registro anterior

Mostrar:
� Tipo do im�vel por extenso
� Consumo
� Valor da conta de energia

Consumo = valor atual do medidor � valor anterior do medidor
Valor da conta de energia = Consumo * Valor do kWh do tipo de im�vel

Valor do kWh (Quilowatt-hora) de Energia
Residencial R$ 0,50
Comercial R$ 0,70
Industrial R$ 0,40
 */
package Atividade_logica_Unit;

import java.util.Scanner;

public class Pratica_14_MedidorDeEnergia {

	public static void main(String[] args) {
		char residencia;
		double valoranterior , valoratual,consumo, valorenergia;
		
		Scanner input = new Scanner(System.in);
		System.out.println("------- Consumo de energia --------");
		
		do{
			System.out.println("Qual o tipo de im�vel? \n Residencial= R "
				+ "\n Comercial= C \n industrial= I ");
			residencia = input.nextLine().charAt(0);
			residencia =Character.toUpperCase(residencia);
			if ((residencia != 'R') && (residencia != 'C') && (residencia != 'I')){
			System.out.println("Errado. Digiti \\n Residencial= R "
					+ "\\n Comercial= C \\n industrial= I");
			}
		
		}while((residencia != 'R') && (residencia != 'C') && (residencia != 'I'));
		
		do{System.out.println("Qual o valor anterior da energia?");
			valoranterior = input.nextDouble();
		}while(valoranterior < 0);
		
		do{System.out.println("Qual o valor atual da energia?");
		valoratual = input.nextDouble();
		}while(valoratual < 0);
		
		consumo = valoratual - valoranterior;  
		
		if (residencia == 'R' ) {
			valorenergia = consumo *  0.50;
			System.out.println("Seu tipo de imovel �: Residencia");
			System.out.println("Seu consumo foi de "+ consumo);
			System.out.printf("Valor da conta de energia:%.2f" , valorenergia );
		}
		else if (residencia == 'C') {
			valorenergia = consumo * 0.70;
			System.out.println("Seu tipo de imovel �: Comercial");
			System.out.println("Seu consumo foi de "+ consumo);
			System.out.printf("Valor da conta de energia:%.2f" , valorenergia );
		}
		else if (residencia == 'I') {
			valorenergia = consumo * 0.40;
			System.out.println("Seu tipo de imovel �: Industrial");
			System.out.println("Seu consumo foi de " + consumo);
			System.out.printf("Valor da conta de energia:%.2f" , valorenergia );
			
		}
		
		input.close();
	}

}
