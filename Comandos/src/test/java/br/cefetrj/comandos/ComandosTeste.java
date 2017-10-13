package br.cefetrj.comandos;

import static org.junit.Assert.*;

import org.junit.Test;

import br.cefetrj.comandos.view.Invoker;

public class ComandosTeste {


	@Test
	public void IncluirTeste (){
		// incluir
		String nome=" Felipe vip";
		
		assertEquals("Entrou no incluir",Invoker.invoke("incluir"),"incluir");
		// incluir help
		assertEquals("Entrou no incluir",Invoker.invoke("incluir help"),"help");
		// incluir cliente 
		assertEquals("Entrou no incluir",Invoker.invoke("incluir cliente"),"cliente");
		// incluir cliente 
		assertEquals("Entrou no incluir",Invoker.invoke("incluir cliente id"),"id");
		assertEquals("Entrou no incluir",Invoker.invoke("incluir cliente id"+nome),nome);
	
	}

}
