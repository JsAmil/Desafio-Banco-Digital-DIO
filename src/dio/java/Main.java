package dio.java;

public class Main {
	
	public static void main(String[] args) {
		Cliente amil = new Cliente();
		amil.setNome("Amil");
		
		
		IConta cc = new ContaCorrente(amil);		
		IConta poupanca = new ContaPoupanca(amil);
		
		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}
}
