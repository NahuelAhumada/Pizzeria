/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pizzeria;

/**
 *
 * @author ITUOM
 */
public class Pedido {
    private String nombreCliente;
    private int fechaCreacion;
    private int tiempoDemoraMinutos;
    private ItemPedidio pedido;

    public Pedido(String nombreCliente, int fechaCreacion, int tiempoDemoraMinutos, ItemPedidio pedido) {
        this.nombreCliente = nombreCliente;
        this.fechaCreacion = fechaCreacion;
        this.tiempoDemoraMinutos = tiempoDemoraMinutos;
        this.pedido = pedido;
    }
    
}
