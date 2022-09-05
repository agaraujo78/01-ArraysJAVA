//03)Dado um vetor V = {85.0, 105.0, 40.0, 90.0, 35.0, 65.0, 
//33.0, 22.0, 19.0, 50.0}, criar um programa que efetua a média 
//dos valores e imprima o resultado.

public class arrayLista03 {

		public static void main(String[] args) {
				
			double[] vetorV  = new double [10];
			double somatoriaValor = 0;	
			double mediaValores;
			
			   vetorV[0] = 85.0;
			   vetorV[1] = 105.0;
			   vetorV[2] = 40.0;
			   vetorV[3] = 90.0;
			   vetorV[4] = 35.0;
			   vetorV[5] = 65.0;
			   vetorV[6] = 33.0;
			   vetorV[7] = 22.0;
			   vetorV[8] = 19.0;
			   vetorV[9] = 50.0;
					
					for (int i = 0; i < 10; i++) {
						somatoriaValor = somatoriaValor + vetorV[i];
					}
					
					mediaValores = (somatoriaValor) / 10;
					
					System.out.printf("MÉDIA DOS VALORES DO VETOR V: %.1f", mediaValores );
				
    		}

		}

	