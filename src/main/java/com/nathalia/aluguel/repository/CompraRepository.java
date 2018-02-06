package com.nathalia.aluguel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nathalia.aluguel.domain.Compra;

@Repository
public interface CompraRepository extends JpaRepository<Compra, Long>{

}
