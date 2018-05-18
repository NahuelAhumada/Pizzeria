
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

    public Pedido(String nombreCliente, String horaCreacion, int tiempoDemoraMinutos, ItemPedido pedido) {
        this.nombreCliente = nombreCliente;
        this.horaCreacion = horaCreacion;
        this.tiempoDemoraMinutos = tiempoDemoraMinutos;
        this.pedido = pedido;
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
        Calendar cal=Calendar.getInstance();
        String[]valores=horaCreacion.split(":");
        int hora=Integer.valueOf(valores[0]);
        int minutos=Integer.valueOf(valores[1]);
        int segundos=Integer.valueOf(valores[2]);
        cal.set(Calendar.HOUR_OF_DAY, hora);
        cal.set(Calendar.MINUTE,minutos);
        cal.set(Calendar.SECOND, segundos);
        cal.add(Calendar.MINUTE, tiempoDemoraMinutos);
        
        return horaActual.before(cal);
    }
    
}
