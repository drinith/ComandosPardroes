package br.cefeftrj.comandos.model;

public abstract class Cliente {

	public String id;
	public String nome;
	
	public Cliente(String _id, String _nome) {
		id=_id;
		nome=_nome;
		
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public abstract int calculoDesconto();
		
		
	
}
