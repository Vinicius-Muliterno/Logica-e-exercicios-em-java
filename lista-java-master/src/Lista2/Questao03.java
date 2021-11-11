package Lista2;

import java.util.Scanner;

public class Questao03 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite a altura: ");
		double altura = entrada.nextDouble();
		System.out.print("Digite o peso: ");
		double peso = entrada.nextDouble();
		
		double imc = peso/(altura*altura);
		
		//System.out.println(imc);
		
		if(imc <= 18.5)
			System.out.println("Abaixo do peso");
		else if(imc <= 25)
			System.out.println("Peso normal");
		else if(imc <= 30)
			System.out.println("Acima do peso");
		else 
			System.out.println("Obeso");
		
		entrada.close();

	}

}
