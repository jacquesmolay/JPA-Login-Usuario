/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;
import java.util.Date;
import javax.persistence.Entity;

/**
 *
 * @author Manuel
 */
@Entity
public class Responsable extends Persona{
    
    private String tipo_resp;

    public Responsable() {
    }

    public Responsable(String tipo_resp, int id, int dni, String nombre, String apellido, String telefono, String direccion, Date fecha_nac) {
        super(id, dni, nombre, apellido, telefono, direccion, fecha_nac);
        this.tipo_resp = tipo_resp;
    }

   
    

    

    

    public String getTipo_resp() {
        return tipo_resp;
    }

    public void setTipo_resp(String tipo_resp) {
        this.tipo_resp = tipo_resp;
    }
    
    
    
    
}
