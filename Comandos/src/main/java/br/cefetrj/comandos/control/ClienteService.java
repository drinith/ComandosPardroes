package br.cefetrj.comandos.control;

import java.util.HashMap;
import java.util.List;

import br.cefeftrj.comandos.model.Cliente;
import br.cefeftrj.comandos.model.ClienteDAO;
import br.cefeftrj.comandos.model.VipAplicantion;


//Implementado o padrão singleton
public class ClienteService {
	
	private ClienteService(){
		
	}
	
	
	static HashMap<String, VipAplicantion> aplicationMap = new HashMap<String,  VipAplicantion>();
	
	
	static {
		aplicationMap.put("vip", new VipAplicantion());
		
	}
	
	private static ClienteService clienteService;
	
	public static ClienteService getInstance(){
		if(clienteService == null)
			clienteService = new ClienteService();
	
		return clienteService;
	}
	
	

	public void InserirCliente(String _tipo,String _id,String _nome ){
		
		ClienteDAO.inserir(aplicationMap.get(_tipo).criaCliente(_id, _nome));
	}

	public  List<Cliente> listarCliente() {
		
		return ClienteDAO.listarCliente();
		
	}
	
	
}
