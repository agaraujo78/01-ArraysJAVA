import java.util.Scanner;

public class mediaGeral01 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		double[] medias = new double [5];
		double mediaGeral;
		
		System.out.print("Digite a 1° média: ");
		medias[0] = leitor.nextDouble(); //5,00
		
		System.out.print("Digite a 2° média: ");
		medias[1] = leitor.nextDouble(); //7,25
		
		System.out.print("Digite a 3° média: ");
		medias[2] = leitor.nextDouble(); //6,32
		
		System.out.print("Digite a 4° média: ");
		medias[3] = leitor.nextDouble(); //4,75
		
		System.out.print("Digite a 5° média: ");
		medias[4] = leitor.nextDouble(); //8,62
		
		mediaGeral = (medias[0] + medias[1] + medias[2] + medias[3] + medias[4]) / 5;
		
		System.out.printf("MÉDIA GERAL DA CLASSE: %.2f", mediaGeral );
				
		leitor.close();
	}

}
