package org.acme.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import io.quarkus.hibernate.orm.panache.PanacheEntity;


@Entity
public class Tarefa{
	
	@Id
	@GeneratedValue
	private Long id;
	private String titulo;
	private String descrição;
	private String dtInicio;
	private String prazo;
	private String status;
	
	public Tarefa(String titulo, String descrição, String dtInicio, String prazo, String status) {
		this.titulo = titulo;
		this.descrição = descrição;
		this.dtInicio = dtInicio;
		this.prazo = prazo;
		this.status = status;
	}

	public Tarefa() {
		super();
		//TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescrição() {
		return descrição;
	}

	public void setDescrição(String descrição) {
		this.descrição = descrição;
	}

	public String getDtInicio() {
		return dtInicio;
	}

	public void setDtInicio(String dtInicio) {
		this.dtInicio = dtInicio;
	}

	public String getPrazo() {
		return prazo;
	}

	public void setPrazo(String prazo) {
		this.prazo = prazo;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	

}
