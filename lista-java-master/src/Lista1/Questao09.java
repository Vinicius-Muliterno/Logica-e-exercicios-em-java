package Lista1;
import java.util.Scanner;

public class Questao09 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite um valor: ");
		int numero1 = entrada.nextInt();
		System.out.print("Digite um valor: ");
		int numero2 = entrada.nextInt();
		int subtracao = numero1-numero2;
		
		System.out.printf("A subtra??o de %d com %d ? %d", numero1, numero2, subtracao);
		entrada.close();
	}
}