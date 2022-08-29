
public class Main {

	public static void main(String[] args) {
		Cliente luke = new Cliente();
		luke.setNome("luke");
		
		Cliente lady = new Cliente();
		lady.setNome("lady");
		
		Conta cc = new ContaCorrente(luke);
		Conta poupanca = new ContaPoupanca(lady);
		
		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
