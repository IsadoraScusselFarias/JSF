package br.com.db1.controller;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class AlfredoController {
	private String nome;
	private Integer idade;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getIdade() {
		return idade;
	}
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	
	public void exibirDadosAlfredo(){
		setNome("Alfredo Frederico Pereira da Silva Junior");
		setIdade(19);
	}
	
}
