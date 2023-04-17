package org.acme.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.*;


@Entity
public class Tarefa{
	
	@Id
	@GeneratedValue
	private Long id;
	
	@NotBlank(message="Titulo não pode ser vazio")
	private String titulo;
	@NotBlank(message="Descrição não pode ser vazio")
	private String descrição;
	@NotBlank(message="Status não pode ser vazio")
	private String dtInicio;
	private String prazo;
	@NotBlank(message="Status não pode ser vazio")
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
