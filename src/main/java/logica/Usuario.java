/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Usuario implements Serializable {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id_usuario;
    private String nombreUsuario;
    private String constrasenia;
    private String rol;

    public Usuario() {
    }

    public Usuario(int id_usuario, String nombreUsuario, String constrasenia, String rol) {
        this.id_usuario = id_usuario;
        this.nombreUsuario = nombreUsuario;
        this.constrasenia = constrasenia;
        this.rol = rol;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public String getConstrasenia() {
        return constrasenia;
    }

    public String getRol() {
        return rol;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public void setConstrasenia(String constrasenia) {
        this.constrasenia = constrasenia;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
    
    

    
}
