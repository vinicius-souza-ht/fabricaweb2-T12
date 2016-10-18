package br.com.fabricadeprogramador.controller;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ViewScoped;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.fabricadeprogramador.model.TipoContato;
import br.com.fabricadeprogramador.repository.TipoContatoRepository;

@Named
@ViewScoped
public class TipoContatoController {

	@Autowired
	private TipoContatoRepository tipoContatoRepository;
	
	private List<TipoContato> tipoContatos;
	
	@PostConstruct
	public void init() {
		tipoContatos = tipoContatoRepository.findAll();
	}

	public TipoContatoRepository getTipoContatoRepository() {
		return tipoContatoRepository;
	}

	public void setTipoContatoRepository(TipoContatoRepository tipoContatoRepository) {
		this.tipoContatoRepository = tipoContatoRepository;
	}

	public List<TipoContato> getTipoContatos() {
		return tipoContatos;
	}

	public void setTipoContatos(List<TipoContato> tipoContatos) {
		this.tipoContatos = tipoContatos;
	}

	@Override
	public String toString() {
		return "TipoContatoController [tipoContatos=" + tipoContatos + "]";
	}
	
	
}