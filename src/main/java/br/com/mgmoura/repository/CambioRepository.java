package br.com.mgmoura.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.mgmoura.model.Cambio;

public interface CambioRepository extends JpaRepository<Cambio, Long>{
	
	Cambio findByFromAndTo(String from, String to);

}
