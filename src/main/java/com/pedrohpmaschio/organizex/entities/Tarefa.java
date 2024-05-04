package com.pedrohpmaschio.organizex.entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "tarefas")
public class Tarefa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long tarefaId;
    private String descricao;
    @Column(name ="data_inicio")
    private Date dataInicio;
    private Date prazo;
    @Column(name = "usuario_id")
    private Long usuarioId;

    public Tarefa(){}
    public Long getTarefaId(){
        return tarefaId;
    }
    public void setTarefaId(Long tarefaId){
        this.tarefaId = tarefaId;
    }
    public String getDescricao(){
        return descricao;
    }
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    public Date getDataInicio(){
        return dataInicio;
    }
    public void setDataInicio(Date dataInicio){
        this.dataInicio = dataInicio;
    }
    public Date getPrazo(){
        return prazo;
    }
    public void setPrazo(Date prazo){
        this.prazo = prazo;
    }
    public Long getUsuarioId(){
        return usuarioId;
    }
    public void setUsuarioId(Long usuarioId){
        this.usuarioId = usuarioId;
    }
}
