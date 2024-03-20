package org.darlonsantos.restapispring.controller;

import org.darlonsantos.restapispring.entity.Finalidade;
import org.darlonsantos.restapispring.repository.FinalidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FinalidadeController {



  private final FinalidadeRepository finalidadeRepository;


  @Autowired
  public FinalidadeController(FinalidadeRepository repository){
    this.finalidadeRepository =  repository;

  }

  @GetMapping("/finalidade")
  public List<Finalidade> getAllFinalidades(){
   return  finalidadeRepository.findAllFinalidade();
  }

  //ainda em desenvolvimento
  @PostMapping("/finalidades")
  public Finalidade createFinalidades(@RequestBody Finalidade finalidade){
    return  finalidadeRepository.save(finalidade);
  }

}
