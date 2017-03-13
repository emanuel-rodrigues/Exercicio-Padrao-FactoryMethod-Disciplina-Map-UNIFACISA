
public class Principal {

	public static void main(String[] args) {

		
		PoupancaIF poupanca = new Poupanca().criarPoupanca(1);
		
		System.out.println(poupanca.calculaJuros());	
		
	}
	
	
	
}
