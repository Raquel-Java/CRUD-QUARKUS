package org.acme.controller;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.validation.Valid;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.acme.entity.Tarefa;
import org.acme.service.TarefaService;

@Path("/api/v1/Tarefa")
public class TarefaControl {
	
	@Inject
	TarefaService service;
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Tarefa>all(){
		List<Tarefa> tarefas = new ArrayList<>();	
		try {
			tarefas = service.findAll();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return tarefas;
	}
	
	@GET
	@Path("/status")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Tarefa>getStatus(String status){
		List<Tarefa> tarefas = new ArrayList<>();	
		try {
			tarefas = service.tasksStatus(status);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return tarefas;
	}
	
	@POST
	@Transactional
	@Produces(MediaType.APPLICATION_JSON)
	public void add(@Valid Tarefa tarefa){
		service.add(tarefa);
	}
	
	@DELETE
	public void deleteById(Long id){
		service.deleteWhitId(id);
		
	}
}
