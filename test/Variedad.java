/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pizzeria;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ITUOM
 */
public class Variedad {
    private String nombre;
    private float precio;
    private List<String> ingredientes;


    public Variedad(String nombre, float precio, List<String> ingredientes) {
        this.nombre = nombre;
        this.precio = precio;
        this.ingredientes = ingredientes;
    }
    public Variedad(String nombre, float precio ){
        this.nombre=nombre;
        this.precio=precio;
        this.ingredientes=new ArrayList<>();
        if(nombre.equals("Muzzarella")){
            ingredientes.add("Tomate");
            ingredientes.add("Queso Muzzarella");
        }
        if(nombre.equals("Jamon y Morrones")){
            ingredientes.add("Jamon");
            ingredientes.add("Tomate");
            
            ingredientes.add("Morron");
            
        }
        if(nombre.equals("Fugazzeta")){
            ingredientes.add("Queso");
            ingredientes.add("Cebolla");
            
        }
        if(nombre.equals("Cuatro Quesos")){
            ingredientes.add("Muzzarella");
            ingredientes.add("Probolone");
            ingredientes.add("Roquefort");
            ingredientes.add("Chedar");
            
        }
    }

    public float getPrecio() {
        return precio;
    }
    
    
}
