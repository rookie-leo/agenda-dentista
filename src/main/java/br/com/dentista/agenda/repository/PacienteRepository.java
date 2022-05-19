package br.com.dentista.agenda.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.dentista.agenda.model.Paciente;

public interface PacienteRepository extends JpaRepository<Paciente, Long>{

}
