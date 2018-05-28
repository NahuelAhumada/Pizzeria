
import java.util.ArrayList;
import java.util.List;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ITUOM
 */
public class ModeloTablaDePedidos implements TableModel {
    private List<Pedido>listaPedidos=new ArrayList();
    @Override
    public int getRowCount() {
        return listaPedidos.size();//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getColumnCount() {
        return 9; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getColumnName(int i) {
        String resultado = "";
        if (i == 0) {
            resultado = "Cliente";
        } else if (i == 1) {
            resultado = "Hora del pedido";
        } else if (i == 2) {
            resultado = "Demora(Min.)";
        } else if (i == 3) {
            resultado = "Gusto";
        } else if (i == 4) {
            resultado = "Tipo";
        } else if (i == 5) {
            resultado = "Tamaño(Porc)";
        } else if (i == 6) {
            resultado = "Cantidad";
        } else if (i == 7) {
            resultado = "Costo total";
        } else {
            resultado = "Observaciones";
        }
        return resultado;   //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Class<?> getColumnClass(int i) {
        return String.class; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isCellEditable(int i, int i1) {
        return false; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object getValueAt(int i, int i1) {
        Pedido pedido=listaPedidos.get(i);
        String valor="";
        if(i1==0){
            valor=pedido.getNombreCliente();
        }else if(i1==1){
            valor=pedido.getHoraCreacion();
        }else if(i1==2){
            valor=String.valueOf(pedido.getTiempoDemoraMinutos());
        } else if(i1==3){
            valor=String.valueOf(pedido.getPedido().getPizza().getVariedad().getNombrePizza());
        }else if(i1==4){
            valor=String.valueOf(pedido.getPedido().getPizza().getTipo());
        }else if(i1==5){
            valor=String.valueOf(pedido.getPedido().getPizza().getTamanio())+" Porc";
            
        }else if(i1==6){
            valor=String.valueOf(pedido.getPedido().getCantidad());
        }
        return valor;
    }

    @Override
    public void setValueAt(Object o, int i, int i1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addTableModelListener(TableModelListener tl) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void removeTableModelListener(TableModelListener tl) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
