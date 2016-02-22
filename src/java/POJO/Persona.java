package POJO;
// Generated 15-feb-2016 11:50:57 by Hibernate Tools 4.3.1


import java.time.LocalDate;
import java.sql.Date;

/**
 * Persona generated by hbm2java
 */
public class Persona  implements java.io.Serializable {


     private Integer id;
     private Direccion direccion;
     private String nombre;
     private String apellido;
     private String telefono;
     private String dni;
     private Date cumpleanios;

    public Persona() {
    }

    public Persona(Direccion direccion, String nombre, String apellido, String telefono, String dni, LocalDate cumpleanios) {
       this.direccion = direccion;
       this.nombre = nombre;
       this.apellido = apellido;
       this.telefono = telefono;
       this.dni = dni;
       this.cumpleanios = Date.valueOf(cumpleanios);
    }

    public Persona(String nombre, String apellido, String telefono, String dni, LocalDate cumpleanios) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.dni = dni;
        this.cumpleanios = Date.valueOf(cumpleanios);
    }
    
    
    
    public Persona(String dni){
        this.dni=dni;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public Direccion getDireccion() {
        return this.direccion;
    }
    
    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return this.apellido;
    }
    
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getTelefono() {
        return this.telefono;
    }
    
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getDni() {
        return this.dni;
    }
    
    public void setDni(String dni) {
        this.dni = dni;
    }
    public Date getCumpleanios() {
        return this.cumpleanios;
    }
    
    public void setCumpleanios(Date cumpleanios) {
        this.cumpleanios = cumpleanios;
    }




}


