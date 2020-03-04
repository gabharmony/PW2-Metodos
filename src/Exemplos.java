
public class Exemplos {

	public static void main(String[] args) {

		ehMaiorIdade(17);
		
		classificar(14);

	}
	
	public static void ehMaiorIdade(int idade) {
		
		if (idade >= 18) {
			System.out.println("Maior de Idade");
		} else {
			System.out.println("Menor de Idade");
		}
		
	}
	
	public static void classificar(int num) {
		
		if (num < 0) {
			
			System.out.println("Negativo");
			
		} else {
			if (num == 0) {
				
				System.out.println("Zero");
				
			} else {

				System.out.println("Positivo");
				
			}
		}
		
	}

}
