package org.acme.repository;

import javax.enterprise.context.ApplicationScoped;
import javax.persistence.Entity;

import io.quarkus.hibernate.orm.panache.PanacheRepository;

@ApplicationScoped
public class TarefaRepository implements PanacheRepository<Entity>{

}
