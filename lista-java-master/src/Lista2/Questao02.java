package Lista2;

import java.util.Scanner;

public class Questao02 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite o 1° lado do triângulo: ");
		int lado1 = entrada.nextInt();
		System.out.print("Digite o 2° lado do triângulo: ");
		int lado2 = entrada.nextInt();
		System.out.print("Digite o 3° lado do triângulo: ");
		int lado3 = entrada.nextInt();
		
		/*Escaleno é o que tem 3 lados diferentes,
		equilatero os 3 lados iguais e 
		o isoceles tem 2 lados iguais e 1 diferente*/
		
		if(lado1 == lado2 && lado1 == lado3)
			System.out.println("Equilatero");
		else if(lado1 != lado2 && lado2 != lado3 && lado3 != lado1)
			System.out.println("Escaleno");
		else
			System.out.println("Isoceles");
		
		entrada.close();

	}

}
