package com.example.turismo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.turismo.exception.ResourceNotFoundException;
import com.example.turismo.model.PontoTuristico;
import com.example.turismo.service.PontoTuristicoService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping(value = "/api/v1/")
public class PontoTuristicoController {
	
	@Autowired
	private PontoTuristicoService pontoTuristicoService;
	
	@GetMapping("/pontos/id/{id}")
	public ResponseEntity<PontoTuristico> listarPontoId(@PathVariable long id){
		PontoTuristico ponto = pontoTuristicoService.findBYId(id)
				.orElseThrow(() -> new ResourceNotFoundException("Nenhum Ponto foi Lozalizado"));
		return ResponseEntity.ok(ponto);
	}

	@GetMapping("/pontos")
	public List<PontoTuristico> listarTodosPontos(){
		return pontoTuristicoService.findAll();
	}
	
	@PostMapping("/pontos")
	public PontoTuristico cadastrarPonto(@RequestBody PontoTuristico ponto) {
		return pontoTuristicoService.save(ponto);
	}
	
	@GetMapping("/pontos/{filtro}")
	public List<PontoTuristico> listarTodos(@PathVariable String filtro){
		return pontoTuristicoService.findAllComFiltro(filtro);
	}
}
