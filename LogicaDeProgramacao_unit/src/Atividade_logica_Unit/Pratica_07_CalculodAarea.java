package Atividade_logica_Unit;

import java.util.Scanner;

public class Pratica_07_CalculodAarea {

public static void main(String[] args) {
		
	double base , altura, quadrado, circulo;
	double PI = 3.14, r, semicirculo, objeto;
	
	
	Scanner ler = new Scanner(System.in);
				
	System.out.println("Digite base: ");
	base = ler.nextDouble();
	
	System.out.println("Digite altura: ");
	altura = ler.nextDouble();
	if (base == altura)
	{
		quadrado= base * altura;
		r = base/2;
		
		circulo = PI * (r*r);
		semicirculo = circulo / 2;
		objeto = quadrado + semicirculo;
		
		
		System.out.printf("Área do objeto é igual a: %.2f " , objeto);		
		
	}
	else {
		System.out.println("objeto não é um quadrado.");
	}

	
	ler.close();
	}

}
