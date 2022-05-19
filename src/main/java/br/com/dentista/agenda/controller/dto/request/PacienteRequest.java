package br.com.dentista.agenda.controller.dto.request;

import br.com.dentista.agenda.model.Paciente;
import br.com.dentista.agenda.model.Pessoa;

public class PacienteRequest {

	private Pessoa pessoa;

	public PacienteRequest(Pessoa pessoa) {
		super();
		this.pessoa = pessoa;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	
	public Paciente toModel() {
		return new Paciente(pessoa);
	}
	
}
