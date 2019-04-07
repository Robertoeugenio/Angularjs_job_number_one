package com.example.demo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Desenho implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer codigo;
	private String nomeDesenho;
	private String categoria;
	private String exibido;
	private String episodio;
	private String notas;
	private String PiorDesenho;

	public Desenho() {
		super();
	}

	public Desenho(Integer codigo, String nomeDesenho, String categoria, String exibido, String episodio, String notas,
			String piorDesenho) {
		super();
		this.codigo = codigo;
		this.nomeDesenho = nomeDesenho;
		this.categoria = categoria;
		this.exibido = exibido;
		this.episodio = episodio;
		this.notas = notas;
		PiorDesenho = piorDesenho;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNomeDesenho() {
		return nomeDesenho;
	}

	public void setNomeDesenho(String nomeDesenho) {
		this.nomeDesenho = nomeDesenho;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getExibido() {
		return exibido;
	}

	public void setExibido(String exibido) {
		this.exibido = exibido;
	}

	public String getEpisodio() {
		return episodio;
	}

	public void setEpisodio(String episodio) {
		this.episodio = episodio;
	}

	public String getNotas() {
		return notas;
	}

	public void setNotas(String notas) {
		this.notas = notas;
	}

	public String getPiorDesenho() {
		return PiorDesenho;
	}

	public void setPiorDesenho(String piorDesenho) {
		PiorDesenho = piorDesenho;
	}

}