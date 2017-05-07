package com.avsystemgeo.treinamento.principal;

import com.avsystemgeo.treinamento.builder.PessoaBuilder;
import com.avsystemgeo.treinamento.entidade.Pessoa;

public class Principal {
	
	public static void main(String[] args) {
		Pessoa joseSilva = new PessoaBuilder().construirPessoaPadrao("Jose", "Silva");
		
		Pessoa maria = 
				new PessoaBuilder()
				.novaPessoa()
				.comNome("Maria")
				.comSobrenome("Silva")
				.construir();
		
	}

}
