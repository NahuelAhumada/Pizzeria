
import java.util.ArrayList;
import java.util.List;
import javax.swing.event.TableColumnModelEvent;
import javax.swing.event.TableModelEvent;
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

    private List<Pedido> listaPedidos = new ArrayList();
    private List<TableModelListener> listeners = new ArrayList<TableModelListener>();

    public List<Pedido> getListaPedidos() {
        return listaPedidos;
    }

    @Override
    public int getRowCount() {
        return listaPedidos.size();//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getColumnCount() {
        return 9;
    }

    @Override
    public String getColumnName(int columnIndex) {
        String resultado = "";
        if (columnIndex == 0) {
            resultado = "Cliente";
        } else if (columnIndex == 1) {
            resultado = "Hora del pedido";
        } else if (columnIndex == 2) {
            resultado = "Demora(Min.)";
        } else if (columnIndex == 3) {
            resultado = "Gusto";
        } else if (columnIndex == 4) {
            resultado = "Tipo";
        } else if (columnIndex == 5) {
            resultado = "Tamaño(Porc)";
        } else if (columnIndex == 6) {
            resultado = "Cantidad";
        } else if (columnIndex == 7) {
            resultado = "Costo total";
        } else {
            resultado = "Observaciones";
        }
        return resultado;
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return String.class;
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Pedido pedido = listaPedidos.get(rowIndex);
        String valor = "vacio";
        if (columnIndex == 0) {
            valor = pedido.getNombreCliente();
        } else if (columnIndex == 1) {
            valor = pedido.getHoraCreacion();
        } else if (columnIndex == 2) {
            valor = String.valueOf(pedido.getTiempoDemoraMinutos());
        } else if (columnIndex == 3) {
            valor = String.valueOf(pedido.getPedido().getPizza().getVariedad().getNombrePizza());
        } else if (columnIndex == 4) {
            valor = String.valueOf(pedido.getPedido().getPizza().getTipo());
        } else if (columnIndex == 5) {
            valor = String.valueOf(pedido.getPedido().getPizza().getTamanio()) + " Porc. ";
        } else if (columnIndex == 6) {
            valor = String.valueOf(pedido.getPedido().getCantidad());
        } else if (columnIndex == 7) {
            valor = "$" + String.valueOf(pedido.getPrecio());
        } else {
            valor = pedido.getObservaciones();
        }
        return valor;
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {

    }

    @Override
    public void addTableModelListener(TableModelListener tl) {
        listeners.add(tl);
    }

    @Override
    public void removeTableModelListener(TableModelListener tl) {
        listeners.remove(tl);
    }

    public void agregarPedido(Pedido pedido) {
        this.listaPedidos.add(pedido);

        TableModelEvent evento = new TableModelEvent(this,
                this.listaPedidos.size() - 1, this.listaPedidos.size() - 1,
                TableModelEvent.ALL_COLUMNS, TableModelEvent.INSERT);

        for (TableModelListener listener : this.listeners) {
            listener.tableChanged(evento);
        }
        
        actualizarLista();
    }

    public void borrarPedido(int posicion) {
        TableModelEvent evento = new TableModelEvent(this,
                posicion, posicion,
                TableModelEvent.ALL_COLUMNS, TableModelEvent.DELETE);

        for (TableModelListener listener : this.listeners) {
            listener.tableChanged(evento);
        }
    }

    void actualizarLista() {
        
        listaPedidos.sort(new CompararPorHora());
        
        TableModelEvent evento = new TableModelEvent(this,
                0, listaPedidos.size() - 1,
                TableModelEvent.ALL_COLUMNS, TableModelEvent.UPDATE);

        for (TableModelListener listener : this.listeners) {
            listener.tableChanged(evento);
        }
    }

}
