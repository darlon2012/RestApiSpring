package org.darlonsantos.restapispring.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "IMW_TP_FINALIDADE")
public class Finalidade {

  @Id
  @Column(name = "ID_TP_FINALIDADE", length = 20)
  private Long id;

  @Column(name = "CD_TP_FINALIDADE", length = 10)
  private String codigo;

  @Column(name = "DS_TP_FINALIDADE", length = 80)
  private String descricao;

  public void setId(Long id) {
    this.id = id;
  }

  public Long getId() {
    return id;
  }

  public String getCodigo() {
    return codigo;
  }

  public void setCodigo(String codigo) {
    this.codigo = codigo;
  }

  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }
}
