
public class vetorExemplo02A {

	public static void main(String[] args) {
	
		int matriz[][] = new int[2][2];
		
		matriz[0][0] = 1;
		
		matriz[0][1] = 3;
		
		matriz[1][0] = 5;
		
		matriz[1][1] = 7;
		
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.printf("matriz[%d][%d] = %d\n", i, j, matriz[i][j]);
			}
		}
		
 	}

}
