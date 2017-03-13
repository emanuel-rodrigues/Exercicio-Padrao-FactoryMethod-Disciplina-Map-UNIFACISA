
public class Poupanca implements PoupancaFactory{

	@Override
	public PoupancaIF criarPoupanca(int tipo) {
		if(tipo == 1){
			return new Poupanca1();
		}else if(tipo == 2){
			return new Poupanca2();
		}
		return null;
	}
	
	

}
