package br.com.dentista.agenda.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
public class Dentista {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NotNull
	private Pessoa pessoa;
	@NotBlank
	private String cro;
	
	/**
	 * @method metodo exclusivo para uso do Hibernate
	 * */
	@Deprecated
	public Dentista() {}
	
	public Dentista(Long id, Pessoa pessoa, String cro) {
		super();
		this.id = id;
		this.pessoa = pessoa;
		this.cro = cro;
	}

	public Long getId() {
		return id;
	}
	
	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public String getCro() {
		return cro;
	}

	public void setCro(String cro) {
		this.cro = cro;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cro == null) ? 0 : cro.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((pessoa == null) ? 0 : pessoa.hashCode());
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
		Dentista other = (Dentista) obj;
		if (cro == null) {
			if (other.cro != null)
				return false;
		} else if (!cro.equals(other.cro))
			return false;
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
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Dentista [id=");
		builder.append(id);
		builder.append(", pessoa=");
		builder.append(pessoa);
		builder.append(", cro=");
		builder.append(cro);
		builder.append("]");
		return builder.toString();
	}	
	
}
