
import java.util.ArrayList;
import java.util.List;
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
public class ModeloTablasPizzasAPedir implements TableModel {
    private List<ItemPedido> pizzas= new ArrayList<>();
    private List<TableModelListener>listener=new ArrayList<>();

    public List<ItemPedido> getPizzas() {
        return pizzas;
    }
    
    @Override
    public int getRowCount() {
        return pizzas.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public String getColumnName(int i) {
        String resultado="d";
        if(i==0){
            resultado="Variedad";
        }else if(i==1){
            resultado="Tipo";
        }else if(i==2){
            resultado="Porciones";
        }else if(i==3){
            resultado="Cantidad";
        }else{
            resultado="Observaciones";
        }
        return resultado;
    }

    @Override
    public Class<?> getColumnClass(int i) {
        return String.class;
    }

    @Override
    public boolean isCellEditable(int i, int i1) {
        return false;
    }

    @Override
    public Object getValueAt(int i, int j) {
         ItemPedido pizza=pizzas.get(i);
         String valor="d";
         if(j==0){
             valor=pizza.getPizza().getVariedad().getNombrePizza();
         }else if(j==1){
             valor= String.valueOf(pizza.getPizza().getTipo());
         }else if(j==2){
             valor=String.valueOf(pizza.getPizza().getTamanio());
         }else if(j==3){
             valor=String.valueOf(pizza.getCantidad());
         }else{
             valor="observaciones";
         }
         return valor;
    }

    @Override
    public void setValueAt(Object o, int i, int i1) {
        
    }

    @Override
    public void addTableModelListener(TableModelListener tl) {
        listener.add(tl); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void removeTableModelListener(TableModelListener tl) {
        listener.remove(tl); //To change body of generated methods, choose Tools | Templates.
    }
    public void agregarPizza(ItemPedido nuevaPizza){
        this.pizzas.add(nuevaPizza);
        TableModelEvent evento = new TableModelEvent(this,
                this.pizzas.size() - 1, this.pizzas.size() - 1,
                TableModelEvent.ALL_COLUMNS, TableModelEvent.INSERT);

        for (TableModelListener listener : this.listener) {
            listener.tableChanged(evento);
            
        }
        
    }
    public void borrarPedido(ItemPedido pizzaABorrar){
        this.pizzas.remove(pizzaABorrar);
        TableModelEvent evento = new TableModelEvent(this,
                this.pizzas.size()-1, this.pizzas.size()-1,
                TableModelEvent.ALL_COLUMNS, TableModelEvent.DELETE);
        for (TableModelListener listener : this.listener) {
            listener.tableChanged(evento);
            
        }
    }
    
}
