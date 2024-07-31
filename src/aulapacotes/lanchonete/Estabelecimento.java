package aulapacotes.lanchonete;

import aulapacotes.lanchonete.area.cliente.Cliente;
import aulapacotes.lanchonete.atendimento.Atendente;
import aulapacotes.lanchonete.atendimento.cozinha.Almoxarife;
import aulapacotes.lanchonete.atendimento.cozinha.Cozinheiro;

public class Estabelecimento {
	public static void main(String[] args) {
		Cozinheiro cozinheiro = new Cozinheiro();
		//ações que estabelecimento precisa ter ciência
		cozinheiro.adicionarSucoNoBalcao();;
		cozinheiro.adicionarLancheNoBalcao();
		cozinheiro.adicionarComboNoBalcao();

		Atendente atendente = new Atendente();
		atendente.servindoMesa();
		
		atendente.receberPagamento();
		
		Cliente cliente = new Cliente();
		cliente.escolherLanche();
		cliente.fazerPedido();
		cliente.pagarConta();
		
	}
}
