
public class ContaPoupanca extends Conta
{
	
	public ContaPoupanca(Cliente cliente)
	{
		super(cliente);
	}
	
	@Override
	protected String imprimirTipo()
	{
		// TODO Auto-generated method stub
		return "Poupança";
	}
}
