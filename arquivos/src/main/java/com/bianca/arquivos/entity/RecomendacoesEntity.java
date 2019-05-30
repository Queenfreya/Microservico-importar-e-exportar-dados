package com.bianca.arquivos.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@Entity
@Table(name="recomendacoes")
public class RecomendacoesEntity {

    @Id
    @GeneratedValue
    UUID Id_recomencacoes;
    String Nome_funcao;
    String Quanto_tempo;
    String Descricao;
    String Nome_recomendado;
    String Telefone;
    UUID usuarioId;

  public RecomendacoesEntity(
      final String nome_funcao,
      final String quanto_tempo,
      final String descricao,
      final String nome_recomendado,
      final String telefone,
      final UUID usuarioId
  ) {
    Nome_funcao = nome_funcao;
    Quanto_tempo = quanto_tempo;
    Descricao = descricao;
    Nome_recomendado = nome_recomendado;
    Telefone = telefone;
    this.usuarioId = usuarioId;
  }


  public String getNome_funcao() {
    return Nome_funcao;
  }

  public void setNome_funcao(final String nome_funcao) {
    Nome_funcao = nome_funcao;
  }

  public String getQuanto_tempo() {
    return Quanto_tempo;
  }

  public void setQuanto_tempo(final String quanto_tempo) {
    Quanto_tempo = quanto_tempo;
  }

  public String getDescricao() {
    return Descricao;
  }

  public void setDescricao(final String descricao) {
    Descricao = descricao;
  }

  public String getNome_recomendado() {
    return Nome_recomendado;
  }

  public void setNome_recomendado(final String nome_recomendado) {
    Nome_recomendado = nome_recomendado;
  }

  public String getTelefone() {
    return Telefone;
  }

  public void setTelefone(final String telefone) {
    Telefone = telefone;
  }


}
