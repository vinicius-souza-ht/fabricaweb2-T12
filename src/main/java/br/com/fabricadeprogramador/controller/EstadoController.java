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

	private Estado estado = new Estado();

	private boolean modoEdicao = false;

	@PostConstruct
	public void init() {
		estados = estadoRepository.findAll();
	}

	public void salvar() {

		estadoRepository.save(estado);
		if (!isModoEdicao())
			estados.add(estado);
		estado = new Estado();
		setModoEdicao(false);
		
	}

	public void excluir(Estado estado) {
		estadoRepository.delete(estado);
		estados.remove(estado);
	}

	public void editar(Estado estado) {
		setEstado(estado);
		setModoEdicao(true);
	}

	public void cancelar() {
		estado = new Estado();
		setModoEdicao(false);
	}

	// GETTER AND SETTER

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

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public boolean isModoEdicao() {
		return modoEdicao;
	}

	public void setModoEdicao(boolean modoEdicao) {
		this.modoEdicao = modoEdicao;
	}

	@Override
	public String toString() {
		return "EstadoController [estadoRepository=" + estadoRepository + ", estados=" + estados + ", estado=" + estado
				+ ", modoEdicao=" + modoEdicao + "]";
	}
	
	

}