
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
public class ItemPedido {
    
    private Pizza pizza;
    private int cantidad;
   
    

    public ItemPedido(Pizza pizza, int cantidad) {
        if (cantidad < 0) {
            throw new Error("Cantidad invalida");
        }
        this.pizza = pizza;
        this.cantidad = cantidad;
    }

    public float calcularCosto() {
        return pizza.calcularCosto() * cantidad;
    }

    public Pizza getPizza() {
        return pizza;
    }

    public int getCantidad() {
        return cantidad;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + Objects.hashCode(this.pizza);
        hash = 89 * hash + this.cantidad;
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
        final ItemPedido other = (ItemPedido) obj;
        if (this.cantidad != other.cantidad) {
            return false;
        }
        if (!Objects.equals(this.pizza, other.pizza)) {
            return false;
        }
        return true;
    }
    
}
