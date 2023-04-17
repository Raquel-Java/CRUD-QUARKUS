package org.acme.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.enterprise.context.ApplicationScoped;

import com.oracle.svm.core.annotate.Inject;

import org.acme.entity.Tarefa;
import org.acme.repository.TarefaRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@ApplicationScoped
public class TarefaService {
	
	private Boolean deletado = false;
	
	private static Logger LOG = LoggerFactory.getLogger(TarefaService.class);
	
	@Inject
	TarefaRepository repositorio;
	
	public List<Tarefa>findAll(){
		List<Tarefa> tarefas = new ArrayList<>();
		try {
			tarefas =  repositorio.findAll().list();
		} catch (Exception e) {
			LOG.info("*** Erro exception " + e.getMessage());
		}
		return tarefas;
	}
	
	
	public void add(Tarefa tarefa){
		try {
			repositorio.persist(tarefa);
		} catch (Exception e) {	
			LOG.info("*** Erro exception " + e.getMessage());

		}
		
	}
	
	public Boolean deleteWhitId(Long id){
		try {
			deletado = repositorio.deleteById(id)?true:false ;
		} catch (Exception e) {
			LOG.info("*** Erro exception " + e.getMessage());
		}
		return deletado;
	}
	
	public List<Tarefa> tasksStatus(String status){
		List<Tarefa> tarefas = new ArrayList<>();
		Map<String, Object> params = new HashMap<>();
		params.put("status", status);
		
		try {
			tarefas =  repositorio.find("status = :status", params).list();
		} catch (Exception e) {
			LOG.info("*** Erro exception " + e.getMessage());
		}
		
		return tarefas;
		
	}
		

}
