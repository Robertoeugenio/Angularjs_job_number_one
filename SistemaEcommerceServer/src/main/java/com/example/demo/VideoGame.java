package com.example.demo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class VideoGame implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer codigo;
	private String nomeVideogame;
	private String nomeJogo;
	private String categoria;
	private String anoLancamento;
	private String jogabilidade;
	private String notas;
	private String piorJogo;

	public VideoGame() {
		super();
	}

	public VideoGame(Integer codigo, String nomeVideogame, String nomeJogo, String categoria, String anoLancamento,
			String jogabilidade, String notas, String piorJogo) {
		super();
		this.codigo = codigo;
		this.nomeVideogame = nomeVideogame;
		this.nomeJogo = nomeJogo;
		this.categoria = categoria;
		this.anoLancamento = anoLancamento;
		this.jogabilidade = jogabilidade;
		this.notas = notas;
		this.piorJogo = piorJogo;

	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNomeVideogame() {
		return nomeVideogame;
	}

	public void setNomeVideogame(String nomeVideogame) {
		this.nomeVideogame = nomeVideogame;
	}

	public String getNomeJogo() {
		return nomeJogo;
	}

	public void setNomeJogo(String nomeJogo) {
		this.nomeJogo = nomeJogo;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getAnoLancamento() {
		return anoLancamento;
	}

	public void setAnoLancamento(String anoLancamento) {
		this.anoLancamento = anoLancamento;
	}

	public String getJogabilidade() {
		return jogabilidade;
	}

	public void setJogabilidade(String jogabilidade) {
		this.jogabilidade = jogabilidade;
	}

	public String getNotas() {
		return notas;
	}

	public void setNotas(String notas) {
		this.notas = notas;
	}

	public String getPiorJogo() {
		return piorJogo;
	}

	public void setPiorJogo(String piorJogo) {
		this.piorJogo = piorJogo;
	}

	// getset

}
