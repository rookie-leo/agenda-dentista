package br.com.dentista.agenda.service;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.dentista.agenda.model.Paciente;
import br.com.dentista.agenda.repository.PacienteRepository;

public class PacienteService {

	@Autowired
	private PacienteRepository repository;
	
	public void save(Paciente paciente) {
		repository.save(paciente);
	}
	
}
