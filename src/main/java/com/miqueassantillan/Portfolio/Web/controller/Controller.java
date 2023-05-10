package com.miqueassantillan.Portfolio.Web.controller;
import com.miqueassantillan.Portfolio.Web.model.Persona;
import com.miqueassantillan.Portfolio.Web.servicio.IPersonaService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Controller {
    
    @Autowired
    private IPersonaService persoServ;
    
    @GetMapping ("ver/personas")
    public List<Persona> VerPersonas(){
        return persoServ.verPersonas();
    }
    
    @GetMapping ("buscar/persona/{id}")
    public Persona BuscarPersona(@PathVariable Long id){
        return persoServ.buscarPersona(id);
    }
    
    @PostMapping ("new/persona")
    public void CrearPersona(@RequestBody Persona per){
        persoServ.crearPersona(per);
    }
    
    @DeleteMapping ("delete/{id}")
    public void BorrarPersona(@PathVariable Long id){
        persoServ.borrarPersona(id);
    }
    
    @PutMapping ("edit/{id}")
    public void EditarPersona(@PathVariable Long id, @RequestBody Persona per){
    Persona personaActual = persoServ.buscarPersona(id);
    if(personaActual != null){
        personaActual.setNombre(per.getNombre());
        personaActual.setApellido(per.getApellido());
        personaActual.setUsuario(per.getUsuario());
        personaActual.setContraseña(per.getContraseña());
        persoServ.editarPersona(personaActual);
    }
}

}
