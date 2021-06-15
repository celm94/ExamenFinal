/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dormidospizza;

/**
 *
 * @author Célita Morales
 */
public class Pizzas {
    
    private String nombre;
    private String precio;
    private String descripcion;
    
   /*constructor*/
    public Pizzas(){
        
    }
/*+++++++++++++++++++
    Si falla algo, quizá falte algo como esto en el código XDDDDD :
    public Clientes(String nombre, String direccion, String edad, int noCliente) {
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
        this.noCliente = noCliente;
    }
    +++++++++++++++++++++++++++++*/
    public Pizzas(String nombre, String precio, String descripcion)
    {
        this.nombre=nombre;
        this.precio=precio;
        this.descripcion=descripcion;
    }   
    
   

    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    public String getPrecio() {
        return precio;
    }
    public void setPrecio(String precio) {
        this.precio = precio;
    }

    
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
    @Override
    public String toString(){
        return this.nombre;
    }
    
    
}
