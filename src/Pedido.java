/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author ITUOM
 */
public class Pedido {
    private String nombreCliente;
    private double horaCreacion;
    private int tiempoDemoraMinutos;
    private ItemPedidio pedido;

    public Pedido(String nombreCliente, double horaCreacion, int tiempoDemoraMinutos, ItemPedidio pedido) {
        this.nombreCliente = nombreCliente;
        this.horaCreacion = horaCreacion;
        this.tiempoDemoraMinutos = tiempoDemoraMinutos;
        this.pedido = pedido;
    }
    
}
