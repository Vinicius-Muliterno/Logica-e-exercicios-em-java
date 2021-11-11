package Lista1;
import java.util.Scanner;

public class Questao13 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite o nome: ");
		String nome = entrada.nextLine();
		System.out.print("Digite a 1° nota: ");
		double nota1 = entrada.nextDouble();
		System.out.print("Digite a 2° nota: ");
		double nota2 = entrada.nextDouble();
		double media = (nota1+nota2)/2;
		
		System.out.printf("O aluno %s obteve a média %.2f", nome, media);
		entrada.close();
	}
}
