package com.nathalia.aluguel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nathalia.aluguel.domain.Carro;

@Repository
public interface CarroRepository extends JpaRepository<Carro, Long>{

}
