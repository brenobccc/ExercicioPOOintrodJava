/*6. (opcional) Imprima os primeiros números da série de Fibonacci até passar de 100. A série de
Fibonacci é a seguinte: 0, 1, 1, 2, 3, 5, 8, 13, 21, etc... Para calculá-la, o primeiro elemento vale 0, o
segundo vale 1, daí por diante, o n-ésimo elemento vale o (n-1)-ésimo elemento somado ao (n-2)-
ésimo elemento (ex: 8 = 5 + 3).*/

class Exercicio6{
	public static void main(String[] args) {
		int n=0,m=1,o;

		while(n<=100){
			o=m;
			System.out.printf("%d ",n);
			m+=n;
			n=o;
		}
	}
}