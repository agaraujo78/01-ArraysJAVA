//01)	Dado um vetor V = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 
//criar um programa que imprima estes valores na tela.


public class arrayLista01 {

	public static void main(String[] args) {
		
		int V[] = new int [10];
		
		V[0] = 1;
		V[1] = 2;
		V[2] = 3;
		V[3] = 4;
		V[4] = 5;
		V[5] = 6;
		V[6] = 7;
		V[7] = 8;
		V[8] = 9;
		V[9] = 10;

		System.out.printf("V = { %d, %d, %d, %d, %d, %d, %d, %d, %d, %d}\n\n", V[0],V[1],V[2],V[3],V[4],V[5],V[6],V[7],V[8],V[9]);
	
		System.out.println("OU\n");
		
		for (int i = 0; i < 10; i++) {
			System.out.println(V[i]);
		}
	}

}
