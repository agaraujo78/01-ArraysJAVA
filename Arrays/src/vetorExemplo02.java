
public class vetorExemplo02 {

	public static void main(String[] args) {
	
		int vetor[] = new int[5];
		
		vetor[0] = 4;
		
		vetor[1] = 7;
		
		vetor[2] = 9;
		
		vetor[3] = 16;
		
		vetor[4] = 20;

		System.out.println(vetor[0]);
		System.out.println(vetor[1]);
		System.out.println(vetor[2]);
		System.out.println(vetor[3]);
		System.out.println(vetor[0]);

		System.out.printf("%d,%d,%d,%d,%d\n", vetor[0],vetor[1],vetor[2],vetor[3],vetor[4]);
		
		for (int i = 0; i < 5; i++) System.out.println(vetor[i]);
		
		System.out.printf("{%d,%d,%d,%d,%d}",vetor[0],vetor[1],vetor[2],vetor[3],vetor[4]);
		
	}

}
