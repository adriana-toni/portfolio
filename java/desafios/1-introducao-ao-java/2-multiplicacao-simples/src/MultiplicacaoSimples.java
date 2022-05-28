package desafio.introducao;

import java.util.Scanner;

public class MultiplicacaoSimples {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A, B, PROD;

		System.out.print("Informe um inteiro: ");
		A = sc.nextInt();
		System.out.print("Informe outro inteiro: ");
		B = sc.nextInt();
		
		PROD =  A * B;

		// A multiplicação dos inteiros informados é PRDO
		System.out.println("PROD = " +  PROD);
		
		sc.close();
		
	}
}