/*
O fatorial de um número n é n * (n-1) * (n-2) * ... * 1. Lembre-se de utilizar os parênteses.
O fatorial de 0 é 1
O fatorial de 1 é (0!) * 1 = 1
O fatorial de 2 é (1!) * 2 = 2
O fatorial de 3 é (2!) * 3 = 6
O fatorial de 4 é (3!) * 4 = 24

*/

public class Exercicio4{
	public static void main(String[] args) {
		int fatorial=1;

		for (int i=1;i<=10 ; i++ ){
			fatorial*=i;
			System.out.printf(" Fatorial de %d = %d \n",i,fatorial);
		}
		
	}
}