package Lista1;
import java.util.Scanner;

public class Questao16 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.printf("Digite a média do aluno: ");
		double media = entrada.nextDouble();
		
		System.out.printf("O aluno foi %s", media >= 7 ? "APROVADO" : "REPROVADO");
		entrada.close();
	}
}
