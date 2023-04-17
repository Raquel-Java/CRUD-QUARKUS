package org.acme.repository;

import javax.enterprise.context.ApplicationScoped;

import org.acme.entity.Tarefa;
import io.quarkus.hibernate.orm.panache.PanacheRepository;


@ApplicationScoped
public class TarefaRepository implements PanacheRepository<Tarefa>{

}
