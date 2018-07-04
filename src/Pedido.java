
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author ITUOM
 */
@Entity
public class Pedido implements Comparable<Pedido>{
    @Column
    private String nombreCliente;
    @Column
    private String horaCreacion;
    @Transient
    private int tiempoDemoraMinutos;
    @Transient 
    private String observaciones="";
    @Transient
    private Calendar horaRealDeEntrega;
    @Transient
    private List<ItemPedido> pizzasAPedir;
    @Column
    private float precioTotal; 
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    public Pedido() {
    }


    public Pedido(String nombreCliente, String horaCreacion, int tiempoDemoraMinutos,
            List<ItemPedido> pizzasPedidas, String observaciones) {
        this.nombreCliente = nombreCliente;
        this.horaCreacion = horaCreacion;
        this.tiempoDemoraMinutos = tiempoDemoraMinutos;
        this.pizzasAPedir=pizzasPedidas;
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

    public Calendar getHoraRealDeEntrega() {
        return horaRealDeEntrega;
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
    
    public float getPrecioTotal(){
        float precioTotal=0f;
        for(ItemPedido item: pizzasAPedir){
            precioTotal+=item.calcularCosto();
        }
        this.precioTotal=precioTotal;
        return this.precioTotal;
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

    public boolean pedidoAtrasado(Calendar horaActual) {
        
        return horaActual.after(this.horaRealDeEntrega);
    }

    @Override
    public int compareTo(Pedido t) {
        return this.horaRealDeEntrega.compareTo(t.horaRealDeEntrega);
        
    }
    
}
