package br.cefetrj.comandos;

import br.cefetrj.comandos.view.Invoker;

public class ComandosMainTeste {
	public static void main(String[] args) {
		
		Invoker.invoke("incluir cliente id 12 Felipe vip");
		Invoker.invoke("listar clientes");
	}
}
