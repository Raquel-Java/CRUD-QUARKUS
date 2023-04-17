package org.acme.service;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;

import com.oracle.svm.core.annotate.Inject;

import org.acme.entity.Tarefa;
import org.acme.repository.TarefaRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@ApplicationScoped
public class TarefaService {
	
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
	
	
	

}
