/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author neyder
 */
public class Estudiante {
    String codigo;
    String nombre;
    String apellido;
    String email;
    String seminario;
    
    
    public Estudiante(){
    
    }
    
    public Estudiante(String codigo,String nombre,String apellido,String email,String seminario){
        
    this.codigo=codigo;
    this.nombre=nombre;
    this.apellido=apellido;
    this.email=email;
    this.seminario=seminario;
    
    }
    
    
    public void setCodigo(String codigo){
    this.codigo=codigo;
    }
    
    public String getCodigo(){
    return codigo;
    }
    
     public void setNombre(String nombre){
    this.nombre=nombre;
    }
    
    public String getNombre(){
    return nombre;
    }
     public void setApellido(String apellido){
    this.apellido=apellido;
    }
    
    public String getApellido(){
    return apellido;
    }
     public void setEmail(String email){
    this.email=email;
    }
    
    public String getEmail(){
    return email;
    }
     public void setSeminario(String seminario){
    this.seminario=seminario;
    }
    
    public String getSeminario(){
    return seminario;
    }
    
    
    public String toString(){
        
    return ("Nombre: "+nombre+
            "\nApellido: "+apellido+"\nCodigo: "+codigo+
            "\nEmail: "+email+"\nSeminario: "+seminario);
    }
    
   
    
}

