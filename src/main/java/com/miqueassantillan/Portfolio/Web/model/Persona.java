package com.miqueassantillan.Portfolio.Web.model;
import com.sun.istack.NotNull;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int id;
    @NotNull
    public String nombre;
    @NotNull
    public String apellido;
    @NotNull
    public String email;
    @NotNull
    public String usuario;
    @NotNull
    public String contraseña;
    
    
    public Persona() {
    }

    public Persona(String nombre, String apellido,String email, String usuario, String contraseña) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.usuario = usuario;
        this.contraseña = contraseña;
    }
    
}
