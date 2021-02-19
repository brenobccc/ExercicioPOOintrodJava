
public class Exercicio5{
	public static void main(String[] args) {
		long fatorial=1;

		for (int i=1;i<=20 ; i++ ){
			fatorial*=i;
			System.out.printf(" Fatorial de %d = %d \n",i,fatorial);
		}
		/*Respota da pergunta da questão*/
		/*
		 Eu acredito que seja por conta da quantidade de bytes que o inteiro aguenta na memoria, comparado com o tipo long(que é superior).
		 mas admito que isso gera dúvida, pois em outras linguagens, eu não havia percebido este problema ao usar int.
		*/
	}
}