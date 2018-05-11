/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author ITUOM
 */
public class ItemPedidio {
    private Pizza pizza;
    private int cantidad;

    public ItemPedidio(Pizza pizza, int cantidad) {
        this.pizza = pizza;
        this.cantidad = cantidad;
    }
    public float calcularCosto(){
        return pizza.calcularCosto()*cantidad;
    }
}
