package br.cefetrj.comandos.view.command;

import br.cefetrj.comandos.control.ClienteService;

public class IncluirClienteIdCommand implements Command {

	@Override
	public void execute(String arg) {
		// TODO Auto-generated method stub
		
		String id="";
		String nome="";
		String tipo="";
		String string [];
		arg = arg.replaceAll("^\\s*", "");
		
		String elementos [] = arg.split("\\s");
		
		id=elementos[0];
		nome=elementos[1];
		tipo=elementos[2];
		
		//Usando o padrão Singleton
		ClienteService.getInstance().InserirCliente(tipo,id,nome);
		
		
		System.out.println("Inclusão:\nO usuário "+arg+" foi incluido");
		
	}

}
