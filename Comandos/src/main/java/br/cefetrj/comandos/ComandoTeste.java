package br.cefetrj.comandos;

import java.io.InputStream;
import java.util.Scanner;

import br.cefetrj.comandos.view.Invoker;

public class ComandoTeste {

	public static void main (String [] args){
		
		Invoker.invoke("incluir cliente id 20 felipe");
		
		Invoker.invoke("Listar Clientes");
		
		
		
	}
}
