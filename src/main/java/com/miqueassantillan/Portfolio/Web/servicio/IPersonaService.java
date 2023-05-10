package com.miqueassantillan.Portfolio.Web.servicio;
import com.miqueassantillan.Portfolio.Web.model.Persona;
import java.util.List;

public interface IPersonaService {
    
    public List<Persona> verPersonas ();
    public void crearPersona(Persona per);
    public void borrarPersona(Long id);
    public void editarPersona(Persona per);
    public Persona buscarPersona(Long id);
    
    
}
