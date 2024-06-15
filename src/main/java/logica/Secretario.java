/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

/**
 *
 * @author Manuel
 */
@Entity
public class Secretario extends Persona{
    
    private String sector;
    
    @OneToOne
    private Usuario usUsuario;

    public Secretario() {
    }

    public Secretario(String sector, Usuario usUsuario, int id, int dni, String nombre, String apellido, String telefono, String direccion, Date fecha_nac) {
        super(id, dni, nombre, apellido, telefono, direccion, fecha_nac);
        this.sector = sector;
        this.usUsuario = usUsuario;
    }

   

    

   

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public Usuario getUsUsuario() {
        return usUsuario;
    }

    public void setUsUsuario(Usuario usUsuario) {
        this.usUsuario = usUsuario;
    }   
    
}
