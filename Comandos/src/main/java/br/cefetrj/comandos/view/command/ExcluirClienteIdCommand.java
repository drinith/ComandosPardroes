package br.cefetrj.comandos.view.command;

public class ExcluirClienteIdCommand implements Command {

	@Override
	public void execute(String arg) {
		// TODO Auto-generated method stub
		System.out.println("Exclusão:\nO cliente de "+arg+" foi excluído");
	}

}
