package dio.java;

public class ContaCorrente extends Conta {	
	
	public ContaCorrente(Cliente cliente) {
		super(cliente);
	}		

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Corrente Banco Vasco ===");
		super.imprimirInfosComuns();
	}

}
