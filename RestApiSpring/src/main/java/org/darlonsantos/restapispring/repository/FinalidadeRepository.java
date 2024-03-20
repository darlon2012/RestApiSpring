package org.darlonsantos.restapispring.repository;

import org.darlonsantos.restapispring.entity.Finalidade;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public  interface FinalidadeRepository extends JpaRepository<Finalidade, Long> {

  @Query("SELECT f FROM Finalidade f")
  List<Finalidade>findAllFinalidade();

}
