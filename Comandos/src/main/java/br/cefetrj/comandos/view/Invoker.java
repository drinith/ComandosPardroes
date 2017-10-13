package br.cefetrj.comandos.view;

import java.util.HashMap;
import java.util.Map;

import br.cefetrj.comandos.view.command.AlterarClienteIdCommand;
import br.cefetrj.comandos.view.command.Command;
import br.cefetrj.comandos.view.command.ExcluirClienteIdCommand;
import br.cefetrj.comandos.view.command.IncluirClienteIdCommand;
import br.cefetrj.comandos.view.command.ListarClienteCommand;

public class Invoker {

	public static Map<String, Command> comando = new HashMap<String, Command>();

	static {
		comando.put("incluir cliente id nome tipo", new IncluirClienteIdCommand());
		comando.put("alterar cliente id nome", new AlterarClienteIdCommand());
		comando.put("excluir cliente id", new ExcluirClienteIdCommand());
		comando.put("listar clientes", new ListarClienteCommand());

	}

	// Incluir Cliente id nome
	// Alterar Cliente id novo_id novo_nome
	// Excluir Cliente id
	// Listar Clientes

	public static String invoke(String command) {

	
		command = command.toLowerCase();
		String retorno = "";
		// IF para o comando incluir
		if (command.matches("^incluir.*")) {
			retorno = "incluir";
			if (command.matches(".*help.*")) {
				retorno = "help";
			}
			// Caso fosse retornado tudo .*cliente\\s+id\\s+nome
			if (command.matches(".*cliente.*")) {
				retorno = "cliente";
				if (command.matches(".*id$")) {
					retorno = "id";

				}
				if (command.matches(".*id.+")) {
					retorno = command.replaceAll("^incluir\\s+cliente\\s+id", "");
					comando.get("incluir cliente id nome tipo").execute(retorno);
				}
			}
		} // END if incluir

		// IF para o comando alterar Alterar Cliente id novo_id novo_nome
		if (command.matches("^alterar.*")) {
			retorno = "alterar";
			if (command.matches(".*help.*")) {
				retorno = "help";
			}
			// Caso fosse retornado tudo .*cliente\\s+id\\s+nome
			if (command.matches(".*cliente.*")) {
				retorno = "cliente";
				if (command.matches(".*id$")) {
					retorno = "id";

				}
				if (command.matches(".*id.+")) {
					retorno = command.replaceAll("^alterar\\s+cliente\\s+id", "");
					comando.get("alterar cliente id nome").execute(retorno);
				}
			}
		} // END if alterar
		
		// IF para o comando alterar Alterar Cliente id novo_id novo_nome
				if (command.matches("^alterar.*")) {
					retorno = "alterar";
					if (command.matches(".*help.*")) {
						retorno = "help";
					}
					// Caso fosse retornado tudo .*cliente\\s+id\\s+nome
					if (command.matches(".*cliente.*")) {
						retorno = "cliente";
						if (command.matches(".*id$")) {
							retorno = "id";

						}
						if (command.matches(".*id.+")) {
							retorno = command.replaceAll("^alterar\\s+cliente\\s+id", "");
							comando.get("alterar cliente id nome").execute(retorno);
						}
					}
				} // END if alterar
				
				// IF para o comando alterar Excluir Cliente id
				if (command.matches("^excluir.*")) {
					retorno = "alterar";
					if (command.matches(".*help.*")) {
						retorno = "help";
					}
					// Caso fosse retornado tudo .*cliente\\s+id\\s+nome
					if (command.matches(".*cliente.*")) {
						retorno = "cliente";
						if (command.matches(".*id$")) {
							retorno = "id";

						}
						if (command.matches(".*id.+")) {
							retorno = command.replaceAll("^excluir\\s+cliente\\s+id", "");
							comando.get("excluir cliente id").execute(retorno);
						}
					}
				} // END if alterar
				// IF para o comando alterar Alterar Cliente id novo_id novo_nome
				if (command.matches("^listar.*")) {
					retorno = "alterar";
					if (command.matches(".*help.*")) {
						retorno = "help";
					}
					// Caso fosse retornado tudo .*cliente\\s+id\\s+nome
					if (command.matches(".*clientes$")) {
						retorno = "cliente";
					
							comando.get("listar clientes").execute(retorno);
							
						}
					}
				// END if Listar
		return retorno;
	}
}
