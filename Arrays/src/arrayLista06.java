//06)	Dado um vetor V = {56, 48, 9, 48, 60, 13, 24, 27, 13, 56, 85, 
//9, 48, 55, 9}, criar um programa que leia um número e informe na tela 
//quantas vezes este número foi encontrado no vetor.

public class arrayLista06 {

	public static void main(String[] args) {
		
	
		int V[] = new int [15];
		int cont = 0;
		int cont1 = 0;
		
		V[0] = 56;
		V[1] = 48;
		V[2] = 9;
		V[3] = 48;
		V[4] = 60;
		V[5] = 13;
		V[6] = 24;
		V[7] = 27;
		V[8] = 13;
		V[9] = 56;
		V[10] = 85;
		V[11] = 9;
		V[12] = 48;
		V[13] = 55;
		V[14] = 9;
		
		
		
		
		
		
		
		   for(int i = 0; i < 14; i++) {
		     
			   if (V[0] == V[i] ) {
		    	  cont = cont + 1;  
			   } 
			   if (V[1] == V[i] ) {
				   																																																																																																																																																																																																																																																																																																																																																																																																																																																												cont1 = cont1 + 1;
		     }
		   }	   
			   System.out.printf("O número ‘%d’ repetiu-se '%d' vezes.", V[0], cont-1 );
			   System.out.printf("\n");
			   System.out.printf("O número ‘%d’ repetiu-se '%d' vezes.", V[1], cont1 -1 );
			   System.out.printf("\n")  ;
		  	   
		   
		      
   }
		   	
}

		
		
		
		