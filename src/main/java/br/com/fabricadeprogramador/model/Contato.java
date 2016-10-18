package br.com.fabricadeprogramador.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;

@Entity
@Data
public class Contato {

	@Id
	@GeneratedValue
	private Long id;
	
	private String descricao;
	
	@JoinColumn
	@ManyToOne
	private Cliente cliente;
	
	
	@JoinColumn
	@ManyToOne
	private TipoContato tipoContato = new TipoContato();

	public Cliente getCliente() {
		return cliente;
	}

	@Override
	public String toString() {
		return "Contato [id=" + id + ", descricao=" + descricao + ", cliente=" + cliente + ", tipoContato="
				+ tipoContato + "]";
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public TipoContato getTipoContato() {
		return tipoContato;
	}

	public void setTipoContato(TipoContato tipoContato) {
		this.tipoContato = tipoContato;
	}
	
	
	
}
