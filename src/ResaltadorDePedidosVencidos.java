
import java.awt.Color;
import java.awt.Component;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;
import sun.swing.table.DefaultTableCellHeaderRenderer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class ResaltadorDePedidosVencidos implements TableCellRenderer{
    private final ModeloTablaDePedidos modelo;

    public ResaltadorDePedidosVencidos(ModeloTablaDePedidos modelo) {
        this.modelo = modelo;
    }
    
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        
        Component c = new DefaultTableCellHeaderRenderer()
                .getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        Pedido pedido = modelo.getListaPedidos().get(row);
        try {
            if (pedido.pedidoAtrasado(Calendar.getInstance())) {
                c.setBackground(Color.red);
            } else {
                c.setBackground(Color.white);
            }
        } catch (Exception ex) {
            Logger.getLogger(ResaltadorDePedidosVencidos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return c;
    }

}
