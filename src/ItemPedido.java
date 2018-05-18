/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author ITUOM
 */
public class ItemPedido {
    private Pizza pizza;
    private int cantidad;
    

    public ItemPedido(Pizza pizza, int cantidad) {
        if(cantidad<0){
            throw new Error("Cantidad invalida");
        }
        this.pizza = pizza;
        this.cantidad = cantidad;
    }
    public float calcularCosto(){
        return pizza.calcularCosto()*cantidad;
    }

    public Pizza getPizza() {
        return pizza;
    }

    public int getCantidad() {
        return cantidad;
    }
    
}
