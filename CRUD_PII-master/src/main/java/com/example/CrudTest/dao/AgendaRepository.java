package com.example.CrudTest.dao;



import com.example.CrudTest.entities.Agenda;
import org.springframework.data.repository.CrudRepository;

//                                                           v tipo de Id q identifica Product
public interface AgendaRepository extends CrudRepository<Agenda, Long> {
}
