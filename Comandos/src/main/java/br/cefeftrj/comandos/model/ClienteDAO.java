package br.cefeftrj.comandos.model;

import java.util.ArrayList;
import java.util.List;

public class ClienteDAO {

	private static List<Cliente> clienteLista = new ArrayList<Cliente>(); 
	
	public static void inserir (Cliente _cliente){
		
		clienteLista.add(_cliente);
		
	}

	public static List<Cliente> listarCliente() {
		// TODO Auto-generated method stub
		return clienteLista;
	}
	
}
