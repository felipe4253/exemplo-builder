package com.avsystemgeo.treinamento.builder;

import java.util.Date;

import com.avsystemgeo.treinamento.entidade.Pessoa;

/**
 * Classe que implementa o design patter Builder para a entidade Pessoa.
 * 
 * Esta classe implementa um outro padrão também que é o Fluent Style.
 * 
 * @author felipe
 *
 */
public class PessoaBuilder {
	
	private Pessoa pessoa;
	
	public PessoaBuilder novaPessoa() {
		this.pessoa = new Pessoa();
		return this;
	}
	
	public PessoaBuilder comNome(String nome) {
		this.pessoa.setNome(nome);
		return this;
	}
	
	public PessoaBuilder comSobrenome(String sobrenome) {
		this.pessoa.setSobrenome(sobrenome);
		return this;
	}
	
	public PessoaBuilder comCpf(String cpf) {
		this.pessoa.setCpf(cpf);
		return this;
	}
	
	public PessoaBuilder comTelefone(String telefone) {
		this.pessoa.setTelefone(telefone);
		return this;
	}
	
	public PessoaBuilder comIdade(Integer idade) {
		this.pessoa.setIdade(idade);
		return this;
	}
	
	public PessoaBuilder comEndereco(String endereco) {
		this.pessoa.setEndereco(endereco);
		return this;
	}
	
	public PessoaBuilder comNascimento(Date nascimento) {
		this.pessoa.setNascimento(nascimento);
		return this;
	}
	
	public Pessoa construir() {
		return this.pessoa;
	}
	
	public Pessoa construirPessoaPadrao(String nome, String sobrenome) {
		return this.novaPessoa()
			.comNome(nome)
			.comSobrenome(sobrenome)
			.comCpf("111.111.111-11")
			.comEndereco("Rua de teste")
			.comIdade(20)
			.comNascimento(new Date())
			.comTelefone("3333-3333")
			.construir();
	}

}
