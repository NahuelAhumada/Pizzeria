
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

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
    private String horaCreacion;
    private int tiempoDemoraMinutos;
    private ItemPedido pedido;
    private String observaciones="";

    public String getObservaciones() {
        return observaciones;
    }

    public Pedido(String nombreCliente, String horaCreacion, int tiempoDemoraMinutos, ItemPedido pedido, String observaciones) {
        this.nombreCliente = nombreCliente;
        this.horaCreacion = horaCreacion;
        this.tiempoDemoraMinutos = tiempoDemoraMinutos;
        this.pedido = pedido;
        this.observaciones=observaciones;
    }
    public float getPrecio(){
        return pedido.calcularCosto();
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public String getHoraCreacion() {
        return horaCreacion;
    }

    public int getTiempoDemoraMinutos() {
        return tiempoDemoraMinutos;
    }

    public ItemPedido getPedido() {
        return pedido;
    }
    public boolean pedidoAtrasado(Calendar horaActual)throws Exception{
        Calendar horaPedido=Calendar.getInstance();
        String[]valores=horaCreacion.split(":");
        int hora=Integer.valueOf(valores[0]);
        int minutos=Integer.valueOf(valores[1]);
        int segundos=Integer.valueOf(valores[2]);
        horaPedido.set(Calendar.HOUR_OF_DAY, hora);
        horaPedido.set(Calendar.MINUTE,minutos);
        horaPedido.set(Calendar.SECOND, segundos);
        horaPedido.add(Calendar.MINUTE, tiempoDemoraMinutos);
        return horaActual.after(horaPedido);
    }
    
}
