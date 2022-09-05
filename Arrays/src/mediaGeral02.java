import java.util.Scanner;

public class mediaGeral02 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		double[] medias = new double [5];
		double somatoriaMedia = 0;
		double mediaGeral;
		
		//Preenchendo o vetor medias
		for (int i = 0;  i < 5; i++) {
			System.out.printf("Digite a %s° média: ",(i+1));
			medias[i] = leitor.nextDouble();
		}
		
		for (int i = 0; i < 5; i++) {
			somatoriaMedia = somatoriaMedia + medias[i];
		}
		
		mediaGeral = (somatoriaMedia) / 5;
		
		System.out.printf("MÉDIA GERAL DA CLASSE: %.2f", mediaGeral );
				
		leitor.close();
	}

}
