import lombok.Getter;

@Getter
public abstract class Conta implements InterfaceConta
{
	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;
	
	protected int agencia;
	protected int numero;
	protected double saldo;
	protected double credito;
	protected Cliente cliente;

	public Conta(Cliente cliente)
	{
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente=cliente;
	}

	@Override
	public void sacar(double valor)
	{
		// TODO Auto-generated method stub
		this.saldo -= valor;
	}

	@Override
	public void depositar(double valor)
	{
		// TODO Auto-generated method stub
		this.saldo += valor;
	}

	@Override
	public void trasnferir(double valor, Conta contaDestino)
	{
		// TODO Auto-generated method stub
		this.sacar(valor);
		contaDestino.depositar(valor);
	}

	@Override
	public void imprimirExtrato()
	{
		System.out.println("--- Extrato da Conta " + imprimirTipo() + " ---");
		System.out.println("Titular: "+this.cliente.getNome());
		System.out.println("Agencia: " + this.agencia);
		System.out.println("Numero: " + this.numero);
		System.out.printf("Saldo: %.2f\n", this.saldo);
	}

	protected abstract String imprimirTipo();
}
