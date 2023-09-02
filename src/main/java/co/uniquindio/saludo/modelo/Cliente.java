package co.uniquindio.saludo.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Cliente {

    @Id private String cedula;

    
    private String nombre;
    private String email;
    private String telefono;

    public Cliente() {
    }

    public String getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefono() {
        return telefono;
    }


}
