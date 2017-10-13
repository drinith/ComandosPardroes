package br.cefeftrj.comandos.model;

public class ClienteVip extends Cliente {

	public ClienteVip(String _id, String _nome) {
		super(_id, _nome);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int calculoDesconto() {
		// TODO Auto-generated method stub
		return 0;
	}

}
