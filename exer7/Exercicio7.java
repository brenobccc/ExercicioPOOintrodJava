/*
(opcional) Escreva um programa que, dada uma variável x com algum valor inteiro, temos um
novo x de acordo com a seguinte regra:
se x é par, x = x / 2
se x é impar, x = 3 * x + 1
imprime x
O programa deve parar quando x tiver o valor final de 1. Por exemplo, para x = 13 , a saída
será:
40 -> 20 -> 10 -> 5 -> 16 -> 8 -> 4 -> 2 -> 1

*/
import java.util.Scanner;

class Exercicio7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x;
		x = sc.nextInt();
		int i = x;
		boolean stop=true;
		while (stop) {
			System.out.print(i + " ");
			if(i==1)
				stop = false;

			if (i % 2 == 0) 
				i = i / 2;
			else 
				i = 3 * i + 1;	
		}

		sc.close();

	}
}