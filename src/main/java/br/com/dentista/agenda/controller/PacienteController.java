package br.com.dentista.agenda.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.dentista.agenda.controller.dto.request.PacienteRequest;
import br.com.dentista.agenda.model.Paciente;
import br.com.dentista.agenda.service.PacienteService;

@RestController
@RequestMapping("/paciente")
public class PacienteController {

	private PacienteService service;
	
	@PostMapping("/cadastrar")
	public ResponseEntity<?> cadastrar(@RequestBody PacienteRequest request) {
		Paciente novoPaciente = request.toModel();
		
//		service.save(novoPaciente);
		
		return ResponseEntity.status(200).build();
	}
	
}
