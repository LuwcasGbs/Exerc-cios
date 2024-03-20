package lpa;
import java.util.Scanner;
public class WEEKS {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		int dia;
		
		System.out.println("Informe o dia da semana (1-7: ");
		dia = ler.nextInt();
		
		if (dia==1) {
			System.out.println("O dia selecionado é domingo!");
		}
		
		else if (dia==2) {
			System.out.println("O dia selecionado é segunda-feira!");
		}
		
		else if (dia==3) {
			System.out.println("O dia selecionado é terça-feira!");
		}
		
		else if (dia==4) {
			System.out.println("O dia selecionado é quarta-feira!");
		}
		
		else if (dia==5) {
			System.out.println("O dia selecionado é quinta-feira!");
		}
		
		else if (dia==6) {
			System.out.println("O dia selecionado é sexta-feira!");
		}
		
		else if (dia==7) {
			System.out.println("O dia seleciona é sábado!");
		}
		
		else {
			System.out.println("Dia inválido!!");
		}
		
		ler.close();
			
		}
		

		

	}

