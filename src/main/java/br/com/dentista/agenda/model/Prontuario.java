package br.com.dentista.agenda.model;

import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

public class Prontuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotNull
	@OneToOne
	private Paciente paciente;
	private List<Consulta> consultas;
	private boolean primeiraConsulta = true;

	@Deprecated
	public Prontuario() {}
	
	public Prontuario(Long id, List<Consulta> consultas, Paciente paciente) {
		this.id = id;
		this.consultas = consultas;
		this.paciente = paciente;
	}

	public List<Consulta> getConsultas() {
		return consultas;
	}

	public void setConsultas(List<Consulta> consultas) {
		this.consultas = consultas;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public boolean isPrimeiraConsulta() {
		return primeiraConsulta;
	}

	public void setPrimeiraConsulta(boolean primeiraConsulta) {
		this.primeiraConsulta = primeiraConsulta;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((consultas == null) ? 0 : consultas.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((paciente == null) ? 0 : paciente.hashCode());
		result = prime * result + (primeiraConsulta ? 1231 : 1237);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Prontuario other = (Prontuario) obj;
		if (consultas == null) {
			if (other.consultas != null)
				return false;
		} else if (!consultas.equals(other.consultas))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (paciente == null) {
			if (other.paciente != null)
				return false;
		} else if (!paciente.equals(other.paciente))
			return false;
		if (primeiraConsulta != other.primeiraConsulta)
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Prontuario [id=");
		builder.append(id);
		builder.append(", consultas=");
		builder.append(consultas);
		builder.append(", paciente=");
		builder.append(paciente);
		builder.append(", primeiraConsulta=");
		builder.append(primeiraConsulta);
		builder.append("]");
		return builder.toString();
	}

}
