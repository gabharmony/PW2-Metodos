
public class Exercicio {
	
	public static int somar(int numUm, int numDois) {
		
		return numUm + numDois;
		
	}
	
	public static int proximo(int num) {
		
		return somar(num, 1);
		
	}
	
	public static int dobro(int numDobro) {
		
		return numDobro * 2;
		
	}
	
	public static void main(String[] args) {
		int soma = somar(55, 45);
		int proximoNum = proximo(16);
		int dobro = dobro(5);
		
		System.out.println("Soma: " + soma );
		System.out.println("Próximo Número: " + proximoNum);
		System.out.println("Dobro: " + dobro);
		
		
	}
	
}
