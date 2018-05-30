/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author ITUOM
 */
public class Variedad {
    private String nombrePizza;
    private float precio=0;
    private List<String> ingredientes;

    public Variedad(String nombre, float precio, List<String> ingredientes) {
        this.nombrePizza = nombre;
        this.precio = precio;
        this.ingredientes = ingredientes;
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
            ingredientes.add("Probolone");
            ingredientes.add("Roquefort");
            ingredientes.add("Chedar");

        }
        if(nombre.equals("Napolitana")){
            this.precio=70.00f;
            ingredientes.add("Muzarrella");
            ingredientes.add("Jamon");
            ingredientes.add("Tomate");
            ingredientes.add("Salame");
            ingredientes.add("Queso Rayado");
            
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

}
