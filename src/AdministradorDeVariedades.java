
import java.util.List;
import org.hibernate.SQLQuery;
import org.hibernate.Session;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class AdministradorDeVariedades {
    
    public List<Variedad> obtenerVariedades(){
        Session session=NewHibernateUtil.getSessionFactory().openSession();
        SQLQuery query=session.createSQLQuery("select * from Variedad").addEntity(Variedad.class);
        List<Variedad>listado=query.list();
        for(Variedad v:listado){
            System.out.println("Variedad: "+v.getNombrePizza());
        }
        session.close();
        for(Variedad v:listado){
            System.out.println("Variedad: "+v.getNombrePizza()+" Precio: "+v.getPrecio());
        }
        
        
        return listado;
    }
    
}
