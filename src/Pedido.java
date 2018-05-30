
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Objects;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author ITUOM
 */
public class Pedido implements Comparable<Object>{
    
    private String nombreCliente;
    private String horaCreacion;
    private int tiempoDemoraMinutos;
    private ItemPedido pedido;
    private String observaciones="";
    private Calendar horaRealDeEntrega;


    public Pedido(String nombreCliente, String horaCreacion, int tiempoDemoraMinutos, ItemPedido pedido, String observaciones) {
        this.nombreCliente = nombreCliente;
        this.horaCreacion = horaCreacion;
        this.tiempoDemoraMinutos = tiempoDemoraMinutos;
        this.pedido = pedido;
        this.observaciones=observaciones;
        Calendar horaPedido=Calendar.getInstance();
        String[]valores=horaCreacion.split(":");
        int hora=Integer.valueOf(valores[0]);
        int minutos=Integer.valueOf(valores[1]);
        int segundos=Integer.valueOf(valores[2]);
        horaPedido.set(Calendar.HOUR_OF_DAY, hora);
        horaPedido.set(Calendar.MINUTE,minutos);
        horaPedido.set(Calendar.SECOND, segundos);
        horaPedido.add(Calendar.MINUTE, tiempoDemoraMinutos);
        this.horaRealDeEntrega=horaPedido;
    }
    
    public String getObservaciones() {
        return observaciones;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.nombreCliente);
        hash = 79 * hash + this.tiempoDemoraMinutos;
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
        final Pedido other = (Pedido) obj;
        if (this.tiempoDemoraMinutos != other.tiempoDemoraMinutos) {
            return false;
        }
        if (!Objects.equals(this.nombreCliente, other.nombreCliente)) {
            return false;
        }
        return true;
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
    public boolean pedidoAtrasado(Calendar horaActual) {
        
        return horaActual.after(this.horaRealDeEntrega);
    }

    @Override
    public int compareTo(Object t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
