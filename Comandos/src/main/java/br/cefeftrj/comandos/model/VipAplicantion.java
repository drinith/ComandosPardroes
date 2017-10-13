package br.cefeftrj.comandos.model;

public class VipAplicantion extends Aplication {

	@Override
	public Cliente criaCliente(String id, String name) {
		
		return new ClienteVip(id,name);
	}

}
