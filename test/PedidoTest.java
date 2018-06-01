/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Calendar;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author ITUOM
 */
public class PedidoTest {
    private Pizza pizzaPrueba;
    private Pedido pedidoTest;
    private Calendar calTest;
    @Before
    public void iniciar(){
        pizzaPrueba=new Pizza(8, Tipo.MOLDE, new Variedad("Muzzarella"));
        calTest=Calendar.getInstance();
        calTest.set(Calendar.HOUR_OF_DAY, 12);
        calTest.set(Calendar.MINUTE, 00);
        calTest.set(Calendar.SECOND, 0);
        pedidoTest=new Pedido("Alfonso", "11:45:00", 1,null,null);
    }
    @Test
    public void deberiaDarQueElPedidoDe11y45EstaAtrasado() throws Exception {
        assertTrue(pedidoTest.pedidoAtrasado(calTest));
    }
    @Test
    public void deberiaDarQueElSegundoPedidoEsMayor(){
        Pedido pedidoMayor=new Pedido("esteban", "11:58:00", 200, null, null);
        assertEquals(-1, pedidoTest.compareTo(pedidoMayor));
    }
    
    @Test
    public void deberiaDarQueElSegundoPedidoEsMenor(){
        Pedido pedidoMayor=new Pedido("esteban", "11:00:00", 1, null, null);
        assertEquals(1, pedidoTest.compareTo(pedidoMayor));
    }
    
}
