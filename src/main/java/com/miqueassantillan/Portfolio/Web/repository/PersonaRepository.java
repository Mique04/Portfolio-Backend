package com.miqueassantillan.Portfolio.Web.repository;
import com.miqueassantillan.Portfolio.Web.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PersonaRepository extends JpaRepository<Persona, Long>{
}