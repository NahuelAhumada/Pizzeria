/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pizzeria;

import Pizzeria.Tipo;
import Pizzeria.Variedad;

/**
 *
 * @author ITUOM
 */
public class Pizza {
    //pre: clasificacion de tamaños Grande: 8 porc.+100 Extra Grande: 10 porc.+120 y Ultra Grande:12 porc.+130
    private int tamanio;
    private Tipo tipo;
    private Variedad variedad;

    public Pizza(int tamanio, Tipo tipo, Variedad variedad) {
        if(tamanio!=8||tamanio!=10||tamanio!=12){
            throw new Error("Tamanio invalido");
        }
        this.tamanio = tamanio;
        this.tipo = tipo;
        this.variedad = variedad;
        
    }
    
    
    public float calcularCosto(){
        float resultado=0;
        float precioTamanio;
        float precioTipo;
        if(tamanio==8){
            precioTamanio=100f;
        }else if(tamanio==10){
            precioTamanio=120f;
        }else{
            precioTamanio=130f;
        }
        
        if(tipo==Tipo.MOLDE){
            precioTipo=40;
        }else if(tipo==Tipo.PIEDRA){
            precioTipo=20;
        }else{
            precioTipo=30;
        }
        resultado=variedad.getPrecio()+precioTamanio+precioTipo;
        return resultado;
    }
}
