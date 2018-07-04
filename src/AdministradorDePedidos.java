
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
public class AdministradorDePedidos {
    public List<Pedido> obtenerListaDePedidos(){
        Session session=NewHibernateUtil.getSessionFactory().openSession();
        SQLQuery query=session.createSQLQuery("select*from Pedido").addEntity(Pedido.class);
        List<Pedido>listadoPedido=query.list();
        session.close();
        return listadoPedido;
    }
}
