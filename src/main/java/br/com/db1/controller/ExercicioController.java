package br.com.db1.controller;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class ExercicioController {
	private Double resultado;
	private Double valor1;
	private Double valor2;
	private String texto;
	private String sulPais;
	private String valor;
	private String valorBasico;
	private String valores;
	public String getValores() {
		return valores;
	}

	public void setValores(String valores) {
		this.valores = valores;
	}

	private Integer escolha;
	private List<String> lista = new ArrayList<String>();

	public List<String> getLista() {
		return lista;
	}

	public void setLista(List<String> lista) {
		this.lista = lista;
	}

	public String getValorBasico() {
		return valorBasico;
	}

	public void setValorBasico(String valorBasico) {
		this.valorBasico = valorBasico;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public Integer getEscolha() {
		return escolha;
	}

	public void setEscolha(Integer escolha) {
		this.escolha = escolha;
	}

	public String getSulPais() {
		return sulPais;
	}

	public void setSulPais(String sulPais) {
		this.sulPais = sulPais;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public Double getValor1() {
		return valor1;
	}

	public void setValor1(Double valor1) {
		this.valor1 = valor1;
	}

	public Double getValor2() {
		return valor2;
	}

	public void setValor2(Double valor2) {
		this.valor2 = valor2;
	}

	public Double getResultado() {
		return resultado;
	}

	public void setResultado(Double resultado) {
		this.resultado = resultado;
	}

	public void somar() {
		setResultado(valor1 + valor2);
	}

	public void subtrair() {
		setResultado(valor1 - valor2);
	}

	public void multiplicar() {
		setResultado(valor1 * valor2);
	}

	public void dividir() {
		setResultado(valor1 / valor2);
	}

	public void grande() {
		setTexto(texto.toUpperCase());
	}

	public void pequeno() {
		setTexto(texto.toLowerCase());
	}

	public void retornar(){
		getLista();
	}

	public void formatar() {
		this.valor= "R$ "+valorBasico+".00";
	}

}
