package controle;

import java.util.Scanner;

public class DesafioWhile {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int quantasNotas = 0;
		double nota = 0;
		double total = 0;
		
		while(nota != -1) {
			if(nota < 0 || nota > 10) {
				System.out.println("Nota inválida");
			}
			System.out.println("Informe a nota: ");
			nota = entrada.nextDouble();
			
			if(nota <= 10 && nota >=0) {
					total += nota;
			quantasNotas++;
		}
		}
			
		double media = total / quantasNotas;
		System.out.println("Média: " + media);
		System.out.println("Total de notas: " + quantasNotas);
		
	
		entrada.close();
		
	}
}
