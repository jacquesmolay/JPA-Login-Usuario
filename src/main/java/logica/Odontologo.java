/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
/*mapeo relacion uno a uno*/
import javax.persistence.OneToOne;

/**
 *
 * @author Manuel
 */
@Entity
public class Odontologo extends Persona implements Serializable{
    
    private String especialidad;
    /*creo relacion uno a muchos odonto en la variable de clase que creo para relacionar el mucho*/
    @OneToMany(mappedBy="odonto") 
    private List<Turno>listaTurnos;
     //relacion 1 a muchos
    @OneToOne
    private Usuario unUsuario;
    @OneToOne
    private Horario unHorario;

    public Odontologo() {
        
    }

    public Odontologo(String especialidad, List<Turno> listaTurnos, Usuario unUsuario, Horario unHorario, int id, int dni, String nombre, String apellido, String telefono, String direccion, Date fecha_nac) {
        super(id, dni, nombre, apellido, telefono, direccion, fecha_nac);
        this.especialidad = especialidad;
        this.listaTurnos = listaTurnos;
        this.unUsuario = unUsuario;
        this.unHorario = unHorario;
    }

  
    

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public List<Turno> getListaTurnos() {
        return listaTurnos;
    }

    public void setListaTurnos(List<Turno> listaTurnos) {
        this.listaTurnos = listaTurnos;
    }

    public Usuario getUnUsuario() {
        return unUsuario;
    }

    public void setUnUsuario(Usuario unUsuario) {
        this.unUsuario = unUsuario;
    }

    public Horario getUnHorario() {
        return unHorario;
    }

    public void setUnHorario(Horario unHorario) {
        this.unHorario = unHorario;
    }   
    
    
}
