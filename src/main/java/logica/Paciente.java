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
import javax.persistence.OneToOne;

/**
 *
 * @author Manuel
 */
@Entity
public class Paciente extends Persona implements Serializable{
    
    private boolean tien_OS;
    private String tipoSangre;
    
    /*relacion uno a uno con responsables*/
    @OneToOne
    private Responsable unResponsable;
    
    //relacion 1 a muchos
    @OneToMany(mappedBy="pacien")
    private List<Turno>listaTurnos;

    public Paciente() {
        
    }

    public Paciente(boolean tien_OS, String tipoSangre, Responsable unResponsable, List<Turno> listaTurnos, int id, int dni, String nombre, String apellido, String telefono, String direccion, Date fecha_nac) {
        
        super(id, dni, nombre, apellido, telefono, direccion, fecha_nac);
        this.tien_OS = tien_OS;
        this.tipoSangre = tipoSangre;
        this.unResponsable = unResponsable;
        this.listaTurnos = listaTurnos;
        
    }

    

       

    public boolean isTien_OS() {
        return tien_OS;
    }

    public void setTien_OS(boolean tien_OS) {
        this.tien_OS = tien_OS;
    }

    public String getTipoSangre() {
        return tipoSangre;
    }

    public void setTipoSangre(String tipoSangre) {
        this.tipoSangre = tipoSangre;
    }

    public Responsable getUnResponsable() {
        return unResponsable;
    }

    public void setUnResponsable(Responsable unResponsable) {
        this.unResponsable = unResponsable;
    }

    public List<Turno> getListaTurnos() {
        return listaTurnos;
    }

    public void setListaTurnos(List<Turno> listaTurnos) {
        this.listaTurnos = listaTurnos;
    }

   
}
