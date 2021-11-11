package Lista1;
import java.util.Scanner;

public class Questao11 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite um valor: ");
		int numero1 = entrada.nextInt();
		System.out.print("Digite um valor: ");
		int numero2 = entrada.nextInt();
		int divisao = numero1/numero2;
		
		System.out.printf("A divisão de %d com %d é %d", numero1, numero2, divisao);
		entrada.close();
	}
}