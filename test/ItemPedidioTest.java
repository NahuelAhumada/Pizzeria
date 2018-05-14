/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ITUOM
 */
public class ItemPedidioTest {

    private ItemPedidio itemTest;
    private Pizza pizzaPrueba=new Pizza(8, Tipo.MOLDE, new Variedad("Muzzarella"));
    //precio:190
    @Test(expected=Error.class)
    public void debeDarErrorSiPasoUnNumeroMenorACero() {
        itemTest=new ItemPedidio(pizzaPrueba, -1);
    }
    @Test()
    public void deberia(){
        itemTest=new ItemPedidio(pizzaPrueba, 2);
        assertEquals(380f, itemTest.calcularCosto(), 0.01);
    }
    
}
