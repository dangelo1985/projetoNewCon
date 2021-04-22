package com.example.turismo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.turismo.exception.ResourceNotFoundException;
import com.example.turismo.model.PontoTuristico;
import com.example.turismo.repository.PontoTuristicoRepository;

@Service
public class PontoTuristicoService {

	@Autowired
	PontoTuristicoRepository pontoTuristicoRepository;

	public List<PontoTuristico> findAll() {

		return pontoTuristicoRepository.findAll();
	}

	public PontoTuristico save(PontoTuristico ponto) {

		return pontoTuristicoRepository.save(ponto);
	}

	public List<PontoTuristico> findAllComFiltro(String filtro) {
		
		List<PontoTuristico> findAllComFiltro = pontoTuristicoRepository.findAllComFiltro(filtro);
		
		if(findAllComFiltro.isEmpty()) {
			throw new ResourceNotFoundException("Nenhum Ponto Turistico Encontrado!");
		}
		return findAllComFiltro;
	}
	public Optional<PontoTuristico> findBYId(long id){
		return pontoTuristicoRepository.findById(id);
	}
}
