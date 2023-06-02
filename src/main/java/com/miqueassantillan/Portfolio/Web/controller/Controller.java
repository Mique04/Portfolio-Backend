package com.miqueassantillan.Portfolio.Web.controller;

import com.miqueassantillan.Portfolio.Web.model.Persona;
import com.miqueassantillan.Portfolio.Web.servicio.IPersonaService;
import com.miqueassantillan.Portfolio.Web.validation.ExisteUsuario;
import com.miqueassantillan.Portfolio.Web.validation.ValidacionUsuario;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "https://portfolio-mique2704.web.app")
public class Controller {

    @Autowired
    private ValidacionUsuario validacionUsuario;
    @Autowired
    private ExisteUsuario ExisteUsuario;
    @Autowired
    private IPersonaService persoServ;

    @GetMapping("ver/personas")
    public List<Persona> VerPersonas() {
        return persoServ.verPersonas();
    }

    @GetMapping("buscar/persona/{id}")
    public Persona BuscarPersona(@PathVariable Long id) {
        return persoServ.buscarPersona(id);
    }

    @PostMapping("new/persona")
    public boolean CrearPersona(@RequestBody Persona per) {
        boolean existe = ExisteUsuario.existeUsuario(per.email);
        if (!existe) {
            persoServ.crearPersona(per);
            System.out.println("Usuario registrado con exito");
            return true;
        } else {
            System.out.println("El usuario ya existe");
            return false;
        }
    }
    
    @PostMapping("validar/persona")
    public boolean ValidarPersona(@RequestBody Persona per) {
        boolean fueValidado = validacionUsuario.validarUsuario(per.email, per.contraseña);
        if (fueValidado) {
            System.out.println("Has iniciado sesion exitosamente");
            return true;
        } else {
            System.out.println("El email o la contraseña ingresado es incorrecto");
            return false;
        }
    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity<?> BorrarPersona(@PathVariable Long id) {
        persoServ.borrarPersona(id);
        return ResponseEntity.ok("Usuario eliminado exitosamente");
    }

    @PutMapping("edit/{id}")
    public ResponseEntity<?> EditarPersona(@PathVariable Long id, @RequestBody Persona per) {
        Persona personaActual = persoServ.buscarPersona(id);
        if (personaActual != null) {
            personaActual.setNombre(per.getNombre());
            personaActual.setApellido(per.getApellido());
            personaActual.setUsuario(per.getUsuario());
            personaActual.setContraseña(per.getContraseña());
            persoServ.editarPersona(personaActual);
        }
        return ResponseEntity.ok("Usuario editado exitosamente");
    }
    
    
}
