package com.example.turismo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.example.turismo.model.PontoTuristico;

@Repository
public interface PontoTuristicoRepository  extends JpaRepository<PontoTuristico, Long>{
	
	@Query("SELECT p FROM PontoTuristico p WHERE p.nome LIKE %:filtro% "
			+ "or p.descricao LIKE %:filtro% or p.referencia LIKE %:filtro% "
			+ "order by p.data ASC")
	public List<PontoTuristico> findAllComFiltro(String filtro);
	
	
	
}
