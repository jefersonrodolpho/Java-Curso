package unidade2;

import java.util.Scanner;

public class NumeroECompleto {

	public static void main(String[] args) {
		
		double ex = 0;
		double x;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o Valor de X");
		
		x = scanner.nextDouble();
		
		for(int i =1; i <=30; i++)
			ex = ex + (Math.pow(x, i))/fatorialModificado(i);
		
		System.out.println("O valor de e("+x+") é ="+ex);
		
		scanner.close();
	}
	
	public static int fatorial(int i)
	{
		int resultado = 1;

        for (int j = 1; j <= i; i++) {
            resultado *= j;
        }
        return resultado;
	}
	
	public static double fatorialModificado(int i)
	{
		return(switch(i) {
			case 0,1 -> 1;
			default -> {
				double fatorial = i * fatorialModificado(i-1);
				yield fatorial;
			}
		});	
	}
}
