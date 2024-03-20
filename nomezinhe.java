package lpa;
import java.util.Scanner; 
public class nomezinhe {

	public static void main(String[] args) {
	String frase;
	Scanner ler = new Scanner (System.in);
	
	System.out.println("Informe o texto: ");
	frase = ler.nextLine();
	

	int tamanho = frase.length();
	System.out.println("Tamanho da frase: " +tamanho);
	
	
	int posicao;
	System.out.println("Informe a posição do caractere desejada: ");
	posicao = ler.nextInt();
	
	char letra = frase.charAt(posicao) ;
	System.out.println("a posição escolhida contém a letra: "+letra);
	
	
	String texto3 = ("Ola mundo");
	if (frase.equals(texto3)) 
		System.out.println("Ambos textos dizem Olá mundo!" );
		else 
			System.out.println("As frases são diferentes.. Melhore né");
	}
}
//hi-hi-hii its me again, im back. Lets talk asap! Do you have the time? Lets talk A-S-A-P baby..
