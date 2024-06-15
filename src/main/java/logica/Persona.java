/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

/*clase madre que no persista como tabla, pero si como plantilla
 para las clases hijas*/
import java.io.Serializable;
import java.util.Date;

/*para trabajar con entity se necesitan importar estas clases*/
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

//mapaeo de id y tipo date junto con la notation
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.GeneratedValue;

/*con esta estrategia el id va en la clase madre*/
/*una tabla por cada clase hija*/
@Entity
@Inheritance (strategy=InheritanceType.TABLE_PER_CLASS)
/**
 *
 * @author Manuel
 */
public class Persona implements Serializable {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    private int dni;
    private String nombre;
    private String apellido;
    private String telefono;
    private String direccion;
    @Temporal(TemporalType.DATE)
    private Date fecha_nac;

    public Persona() {
    }

    public Persona(int id, int dni, String nombre, String apellido, String telefono, String direccion, Date fecha_nac) {
        this.id = id;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.direccion = direccion;
        this.fecha_nac = fecha_nac;
    }

    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }   

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Date getFecha_nac() {
        return fecha_nac;
    }

    public void setFecha_nac(Date fecha_nac) {
        this.fecha_nac = fecha_nac;
    }   
    
}
