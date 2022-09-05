//02-02)	Dado um vetor V = {5, 10, 8, 4, 9, 16, 28, 40, 80, 10} 
//criar um programa que efetua a soma dos valores e
// imprima o resultado.

public class arrayLista02 {

	public static void main(String[] args) {
		
	int[] vetorV  = new int [10];
	int somatoriaValor = 0;	
	
	   vetorV[0] = 5;
	   vetorV[1] = 10;
	   vetorV[2] = 8;
	   vetorV[3] = 4;
	   vetorV[4] = 9;
	   vetorV[5] = 16;
	   vetorV[6] = 28;
	   vetorV[7] = 40;
	   vetorV[8] = 80;
	   vetorV[9] = 10;
			
			for (int i = 0; i < 10; i++) {
				somatoriaValor = somatoriaValor + vetorV[i];
			}
			System.out.printf("A soma dos valores é: %s", somatoriaValor );
	}

}
