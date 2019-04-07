package com.example.demo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SerieAntiga implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer codigo;
	private String nomeSerie;
	private String categoria;
	private String Exibido;
	private String Gostava;
	private String Notas;
	private String PiorSerie;

	public SerieAntiga() {
		super();
	}

	public SerieAntiga(Integer codigo, String nomeSerie, String categoria, String exibido, String gostava, String notas,
			String piorSerie) {
		super();
		this.codigo = codigo;
		this.nomeSerie = nomeSerie;
		this.categoria = categoria;
		Exibido = exibido;
		Gostava = gostava;
		Notas = notas;
		PiorSerie = piorSerie;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNomeSerie() {
		return nomeSerie;
	}

	public void setNomeSerie(String nomeSerie) {
		this.nomeSerie = nomeSerie;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getExibido() {
		return Exibido;
	}

	public void setExibido(String exibido) {
		Exibido = exibido;
	}

	public String getGostava() {
		return Gostava;
	}

	public void setGostava(String gostava) {
		Gostava = gostava;
	}

	public String getNotas() {
		return Notas;
	}

	public void setNotas(String notas) {
		Notas = notas;
	}

	public String getPiorSerie() {
		return PiorSerie;
	}

	public void setPiorSerie(String piorSerie) {
		PiorSerie = piorSerie;
	}

}