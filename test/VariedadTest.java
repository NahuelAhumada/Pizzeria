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
public class VariedadTest {
    private Variedad vt;
    public VariedadTest() {
    }

    @Test
    public void deberiaDarCero() {
        vt=new Variedad("");
        assertEquals(0, vt.getPrecio(), 0.01f);
    }
    @Test
    public void deberiaDarCincuenta(){
        vt=new Variedad("Muzzarella");
        assertEquals(50f, vt.getPrecio(), 0.01f);
    }
    @Test
    public void deberiaDar60() {
        vt=new Variedad("Jamon y Morrones");
        assertEquals(60f, vt.getPrecio(), 0.01f);
    }
    @Test
    public void deberiaDarCuarenta() {
        vt=new Variedad("Fugazzeta");
        assertEquals(40f, vt.getPrecio(), 0.01f);
    }
    @Test
    public void deberiaDarsetenta() {
        vt=new Variedad("Cuatro Quesos");
        assertEquals(70f, vt.getPrecio(), 0.01f);
    }
}
