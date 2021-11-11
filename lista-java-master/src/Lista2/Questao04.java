package Lista2;

import java.util.Scanner;

public class Questao04 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int n = 0;
		while(n == 0) {
			
			System.out.print("Digite um numero de 1 a 7: ");
			n = entrada.nextInt();
			
			if(n > 7)
				n = 0;
		}
		
		switch(n) {
	
			case 1:
				System.out.println("Segunda-Feira");
				break;
			case 2:
				System.out.println("Terça-Feira");
				break;
			case 3:
				System.out.println("Quarta-Feira");
				break;
			case 4:
				System.out.println("Quinta-Feira");
				break;
			case 5:
				System.out.println("Sexta-Feira");
				break;
			default:
				System.out.println("Final de semana");
				break;
		}
		
		entrada.close();
	}

}
