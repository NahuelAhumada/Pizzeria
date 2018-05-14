/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author ITUOM
 */
public class PizzaTest {
    
    private Pizza pizzaTest;

    @Test
    public void deberiaDarCientonoventa() {
        pizzaTest=new Pizza(8, Tipo.MOLDE, new Variedad("Muzzarella"));
        assertEquals(190f,pizzaTest.calcularCosto() ,0.01);
    }
    @Test
    public void deberiaDarDocientos(){
        //Piedra+20, 10 porc +120, jym+60
        pizzaTest=new Pizza(10, Tipo.PIEDRA, new Variedad("Jamon y Morrones"));
        assertEquals(200, pizzaTest.calcularCosto(), 0.01);
    }
    @Test
    public void deberiaDarDocientosTambien(){
        //Parrilla+30, 12 porc +130, fugazzeta+40
        pizzaTest=new Pizza(12, Tipo.PARRILA, new Variedad("Fugazzeta"));
        assertEquals(200, pizzaTest.calcularCosto(), 0.01);
    }
    @Test
    public void deberiaDarDocientoTreinta(){
        //Parrilla+30, 12 porc +130, Cuatro Quesos+70
        pizzaTest=new Pizza(12, Tipo.PARRILA, new Variedad("Cuatro Quesos"));
        assertEquals(230, pizzaTest.calcularCosto(), 0.01);
    }
    @Test(expected = Error.class)
    public void deberiaDarErrorAlPasarNueve(){
        pizzaTest=new Pizza(9, Tipo.PIEDRA, new Variedad("Jamon y Morrones"));
    }
    
}
