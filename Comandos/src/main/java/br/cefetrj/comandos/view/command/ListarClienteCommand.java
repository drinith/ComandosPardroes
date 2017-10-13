package br.cefetrj.comandos.view.command;

import br.cefeftrj.comandos.model.Cliente;
import br.cefetrj.comandos.control.ClienteService;

public class ListarClienteCommand implements Command {

	@Override
	public void execute(String arg) {
		
		for (Cliente cliente : ClienteService.getInstance().listarCliente()) {
			System.out.print(cliente.id);
			System.out.println(cliente.nome);
			
		}
		
		

	}

}
