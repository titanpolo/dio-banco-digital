
public class ContaCorrente extends Conta
{
	
	public ContaCorrente(Cliente cliente)
	{
		super(cliente);
	}
	
	@Override
	protected String imprimirTipo()
	{
		return "Corrente";
	}
}
