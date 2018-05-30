
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
public class Pizza {

    //pre: clasificacion de tamaños Grande: 8 porc.+100 Extra Grande: 10 porc.+120 y Ultra Grande:12 porc.+130
    private int tamanio;
    private Tipo tipo;
    private Variedad variedad;
    

    public Pizza(int tamanio, Tipo tipo, Variedad variedad) {
        if (tamanio != 8 && tamanio != 10 && tamanio != 12) {
            throw new Error("Tamanio invalido");
        }

        this.tamanio = tamanio;
        this.tipo = tipo;
        this.variedad = variedad;

    }

    public float calcularCosto() {
        float resultado = 0;
        float precioTamanio;
        float precioTipo;
        if (tamanio == 8) {
            precioTamanio = 100f;
        } else if (tamanio == 10) {
            precioTamanio = 120f;
        } else {
            precioTamanio = 130f;
        }

        if (tipo == Tipo.MOLDE) {
            precioTipo = 40;
        } else if (tipo == Tipo.PIEDRA) {
            precioTipo = 20;
        } else {
            precioTipo = 30;
        }
        resultado = variedad.getPrecio() + precioTamanio + precioTipo;
        return resultado;
    }

    public int getTamanio() {
        return tamanio;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public Variedad getVariedad() {
        return variedad;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + this.tamanio;
        hash = 59 * hash + Objects.hashCode(this.tipo);
        hash = 59 * hash + Objects.hashCode(this.variedad);
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
        final Pizza other = (Pizza) obj;
        if (this.tamanio != other.tamanio) {
            return false;
        }
        if (this.tipo != other.tipo) {
            return false;
        }
        if (!Objects.equals(this.variedad, other.variedad)) {
            return false;
        }
        return true;
    }
}
