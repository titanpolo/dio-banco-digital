
public class Main
{

	public static void main(String[] args)
	{
		double selic = 10.75;

		Banco nubank = new Banco("Nubank");
		nubank.setTaxaJuros(selic * 0.99);

		System.out.println("CDI: "+nubank.getTaxaJuros() + "%");

		Cliente sergio = new Cliente("Sérgio");
		
		Conta contaCorrente1 = new ContaCorrente(sergio);
		
		nubank.abrirConta(contaCorrente1);
		
		Conta contaPoupanca1 = new ContaPoupanca(sergio);
		
		nubank.abrirConta(contaPoupanca1);

		contaCorrente1.depositar(100);

		contaCorrente1.trasnferir(50, contaPoupanca1);

		contaCorrente1.imprimirExtrato();
		contaPoupanca1.imprimirExtrato();

		nubank.calcularCredito(contaPoupanca1);
		
		System.out.println("Crédito da conta poupança: " + contaPoupanca1.getCredito());
	}

}
