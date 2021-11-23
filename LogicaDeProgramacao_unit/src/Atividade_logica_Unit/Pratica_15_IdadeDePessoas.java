package Atividade_logica_Unit;

import java.util.Scanner;

public class Pratica_15_IdadeDePessoas {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		    int idade;
		    int cont18ouMais = 0;
		    double media = 0;
		    int maiorIdade = -1;
		    int menorIdade = 131;
		    
	      for (int pessoas = 1; pessoas<=7 ; pessoas++) {
	           
	          do {
	                System.out.printf("%dª Idade: ", pessoas);
	                idade = input.nextInt();
	                if (idade<0 || idade>130) {
	                    System.out.println("Idade incorreta");
	                    continue;
	                }
	                break;
	            } while (true);
	            
	            if (idade>=18) {
	                cont18ouMais++;
	            }
	            
	            media = media + idade;
	            
	            if (idade > maiorIdade ) {   
	    	        maiorIdade = idade;
	            }
	            
	            if (idade < menorIdade) {
	                menorIdade = idade;
	            }
	            
	        } 
	      input.close();
	        System.out.println("Quant. de pessoas com 18 anos ou mais: " + cont18ouMais);
	        
	        media = media / 7;

	        System.out.printf("Média de idades: %.2f\n" , media);
	        
	        System.out.println("Maior idade: " + maiorIdade);
	        System.out.println("Menor idade: " + menorIdade);
		
		}
	}


