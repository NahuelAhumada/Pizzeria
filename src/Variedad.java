/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

/**
 *
 * @author ITUOM
 */
@Entity
public class Variedad {
    @Column
    private String nombrePizza;
    @Column
    private float precio=0;
    
    @Transient
    private List<String> ingredientes;
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    
    public Variedad(String nombre, float precio, List<String> ingredientes) {
        this.nombrePizza = nombre;
        this.precio = precio;
        this.ingredientes = ingredientes;
    }
    
    public Variedad(){
        
    }

    public Variedad(String nombre) {
        
        this.nombrePizza = nombre;
        this.ingredientes = new ArrayList<>();
        
        if (nombre.equals("Muzzarella")) {
            this.precio = 50.00f;
            ingredientes.add("Tomate");
            ingredientes.add("Queso Muzzarella");

        }
        if (nombre.equals("Jamon y Morrones")) {
            this.precio = 60.00f;
            ingredientes.add("Jamon");
            ingredientes.add("Tomate");
            ingredientes.add("Morron");

        }
        if (nombre.equals("Fugazzeta")) {
            this.precio = 40.00f;
            ingredientes.add("Queso");
            ingredientes.add("Cebolla");

        }
        if (nombre.equals("Cuatro Quesos")) {
            this.precio = 70.00f;
            ingredientes.add("Muzzarella");
            ingredientes.add("Provolone");
            ingredientes.add("Roquefort");
            ingredientes.add("Cheddar");

        }
        if(nombre.equals("Napolitana")){
            this.precio=70.00f;
            ingredientes.add("Muzzarella");
            ingredientes.add("Jamon");
            ingredientes.add("Tomate");
            ingredientes.add("Salame");
            ingredientes.add("Queso Rallado");
            
        }
        
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.nombrePizza);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Variedad other = (Variedad) obj;
        return this.nombrePizza.equals(other.getNombrePizza());
    }
     
    public float getPrecio() {
        return precio;
    }

    public String getNombrePizza() {
        return nombrePizza;
    }

    public void setNombrePizza(String nombrePizza) {
        this.nombrePizza = nombrePizza;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
}
