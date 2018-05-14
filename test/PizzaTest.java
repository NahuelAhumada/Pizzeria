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
    @Before
    public void iniciar(){
        pizzaTest=new Pizza(8, Tipo.MOLDE, new Variedad("Muzzarella"));
    }

    @Test
    public void testSomeMethod() {
    }
    
}
