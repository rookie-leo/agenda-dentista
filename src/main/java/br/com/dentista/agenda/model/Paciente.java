package br.com.dentista.agenda.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

@Entity
public class Paciente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NotNull
	private Pessoa pessoa;
	@OneToOne
	private Prontuario prontuario;
	

	/**
	 * @method metodo exclusivo para uso do Hibernate
	 * */
	@Deprecated
	public Paciente() {}
	
	public Paciente(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	
	public Prontuario getProntuario() {
		return prontuario;
	}

	public void setProntuario(Prontuario prontuario) {
		this.prontuario = prontuario;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((pessoa == null) ? 0 : pessoa.hashCode());
		result = prime * result + ((prontuario == null) ? 0 : prontuario.hashCode());
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
		Paciente other = (Paciente) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (pessoa == null) {
			if (other.pessoa != null)
				return false;
		} else if (!pessoa.equals(other.pessoa))
			return false;
		if (prontuario == null) {
			if (other.prontuario != null)
				return false;
		} else if (!prontuario.equals(other.prontuario))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Paciente [id=");
		builder.append(id);
		builder.append(", pessoa=");
		builder.append(pessoa);
		builder.append(", prontuario=");
		builder.append(prontuario);
		builder.append("]");
		return builder.toString();
	}
	
}
