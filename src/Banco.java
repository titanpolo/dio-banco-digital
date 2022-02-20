import java.util.ArrayList;
import java.util.List;

import lombok.Data;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
// Lombok tutorial -> https://www.youtube.com/watch?v=DMBvVfeSg4o
// Em próximas versões usarei @Builder
import lombok.Setter;

@Getter
public final class Banco {
	private String nome;
	private List<Conta> contas;
	@Setter
	private double taxaJuros;

	public Banco(String nome)
	{
		this.nome=nome;
		this.contas = new ArrayList<Conta>();
	}
	
	public void abrirConta(Conta conta)
	{
		contas.add(conta);
	}
	
	public void calcularCredito(Conta conta)
	{
		conta.credito = conta.saldo * this.taxaJuros/100;
	}

}
