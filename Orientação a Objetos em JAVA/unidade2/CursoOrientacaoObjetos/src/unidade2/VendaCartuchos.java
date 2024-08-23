package unidade2;

import java.util.Scanner;

public class VendaCartuchos {

	public static void main(String[] args) {
		
		final int VALOR_CARTUCHO = 50; //Constante em Java
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o Número de Cartuchos");
		int numeroCartuchos = scanner.nextInt();
		double valorVenda = 0;

		if(numeroCartuchos <= 500)
			valorVenda = numeroCartuchos * VALOR_CARTUCHO * 0.95;
		else if(numeroCartuchos <= 1000)
			valorVenda = numeroCartuchos * VALOR_CARTUCHO * 0.93;
		else if(numeroCartuchos <= 1500)
			valorVenda = numeroCartuchos * VALOR_CARTUCHO * 0.91;
		else
			valorVenda = numeroCartuchos * VALOR_CARTUCHO * 0.9;
		
		System.out.println("O valor da venda é "+valorVenda);
		scanner.close();
	}

}
