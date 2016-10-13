package br.com.fabricadeprogramador.controller;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ViewScoped;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.fabricadeprogramador.model.Estado;
import br.com.fabricadeprogramador.repository.EstadoRepository;

@Named
@ViewScoped
public class EstadoController {

	@Autowired
	private EstadoRepository estadoRepository;
	
	private List<Estado> estados;
	
	@PostConstruct
	public void init() {
		estados = estadoRepository.findAll();
	}

	public EstadoRepository getEstadoRepository() {
		return estadoRepository;
	}

	public void setEstadoRepository(EstadoRepository estadoRepository) {
		this.estadoRepository = estadoRepository;
	}

	public List<Estado> getEstados() {
		return estados;
	}

	public void setEstados(List<Estado> estados) {
		this.estados = estados;
	}
	
	
}