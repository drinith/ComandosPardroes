package br.cefetrj.comandos.view.command;

public class AlterarClienteIdCommand implements Command {

	@Override
	public void execute(String arg) {
		// TODO Auto-generated method stub
		System.out.println("Altração:\nO usuário "+arg+" foi alterado");
	}

}
