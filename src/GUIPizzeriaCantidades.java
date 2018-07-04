
import java.awt.Color;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.TimerTask;
import javax.swing.JComboBox;
import org.hibernate.Session;
import sun.util.calendar.Gregorian;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author usuario 10
 */
public class GUIPizzeriaCantidades extends javax.swing.JFrame {
    
    private Pedido pedido;
    private GUITablaDePedidos pantallaPedidosEnviados;
    private ModeloTablasPizzasAPedir modeloTabla;
    private List<Variedad>variedades;

    /**
     * Creates new form NuevoPedido
     */
    public GUIPizzeriaCantidades() {
        initComponents();
        iniciarTabla();
        hourConfig();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelNombre = new javax.swing.JLabel();
        labelHora = new javax.swing.JLabel();
        labelDemora = new javax.swing.JLabel();
        botonCalcularPedido = new javax.swing.JButton();
        textFieldNombre = new javax.swing.JTextField();
        textFieldHora = new javax.swing.JTextField();
        textFieldDemora = new javax.swing.JTextField();
        comboBoxTamanio = new javax.swing.JComboBox<>();
        comboBoxTipo = new javax.swing.JComboBox<>();
        comboBoxVariedad = new javax.swing.JComboBox<>();
        labelPizzas = new javax.swing.JLabel();
        textFieldCantidad = new javax.swing.JTextField();
        labelErrorDemora = new javax.swing.JLabel();
        labelErrorNombre = new javax.swing.JLabel();
        labelErrorCantidad = new javax.swing.JLabel();
        labelObservaciones = new javax.swing.JLabel();
        textFieldObservaciones = new javax.swing.JTextField();
        labelErrorHora = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaPizzas = new javax.swing.JTable();
        botonAgregarPizza = new javax.swing.JButton();
        labelErrorListaVacia = new javax.swing.JLabel();
        botonAdministrarVariedad = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelNombre.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelNombre.setText("Nombre:");

        labelHora.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelHora.setText("Hora:");

        labelDemora.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelDemora.setText("Demora:");

        botonCalcularPedido.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        botonCalcularPedido.setText("OK");
        botonCalcularPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clickBotonCalcularPedido(evt);
            }
        });

        textFieldNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        textFieldHora.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        textFieldDemora.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        comboBoxTamanio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        comboBoxTamanio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "8", "10", "12" }));

        comboBoxTipo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        comboBoxTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A la piedra", "A la parrilla", "Al molde" }));

        comboBoxVariedad.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        comboBoxVariedad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxVariedadActionPerformed(evt);
            }
        });

        labelPizzas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelPizzas.setText("¿Cuantas Pizzas? :");

        textFieldCantidad.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        labelErrorDemora.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelErrorDemora.setForeground(new java.awt.Color(255, 0, 0));

        labelErrorNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelErrorNombre.setForeground(new java.awt.Color(255, 0, 0));

        labelErrorCantidad.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelErrorCantidad.setForeground(new java.awt.Color(255, 0, 0));

        labelObservaciones.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelObservaciones.setText("Observaciones:");

        labelErrorHora.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelErrorHora.setForeground(new java.awt.Color(255, 0, 0));

        tablaPizzas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tablaPizzas);

        botonAgregarPizza.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        botonAgregarPizza.setText("Agregar Pizza");
        botonAgregarPizza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarPizzaActionPerformed(evt);
            }
        });

        labelErrorListaVacia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelErrorListaVacia.setForeground(new java.awt.Color(255, 0, 0));

        botonAdministrarVariedad.setText("Administrar variedad");
        botonAdministrarVariedad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAdministrarVariedadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(comboBoxTamanio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(labelDemora)
                                        .addGap(49, 49, 49)
                                        .addComponent(textFieldDemora, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(labelHora)
                                        .addGap(72, 72, 72)
                                        .addComponent(textFieldHora, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelErrorHora, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelErrorDemora, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(labelObservaciones)
                                        .addGap(34, 34, 34)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(textFieldObservaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(comboBoxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(78, 78, 78)
                                                .addComponent(comboBoxVariedad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(69, 69, 69)
                                                .addComponent(labelPizzas))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(labelNombre)
                                        .addGap(47, 47, 47)
                                        .addComponent(textFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(labelErrorNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(30, 30, 30)
                                        .addComponent(botonCalcularPedido)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(textFieldCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)
                                .addComponent(labelErrorCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(75, 75, 75)
                                .addComponent(botonAgregarPizza, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(146, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(185, 185, 185)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 625, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)
                        .addComponent(labelErrorListaVacia, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(botonAdministrarVariedad)))
                .addGap(0, 78, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelNombre)
                            .addComponent(textFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botonCalcularPedido)
                            .addComponent(labelErrorNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonAgregarPizza, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelErrorListaVacia, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(265, 265, 265))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelHora)
                                .addGap(1, 1, 1))
                            .addComponent(textFieldHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)
                        .addComponent(labelErrorHora, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelErrorDemora, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(labelDemora)
                                .addComponent(textFieldDemora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(comboBoxTamanio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(comboBoxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(comboBoxVariedad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(labelPizzas)
                                        .addComponent(textFieldCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(labelObservaciones)
                                    .addComponent(textFieldObservaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(labelErrorCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(58, 58, 58)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 166, Short.MAX_VALUE)
                        .addComponent(botonAdministrarVariedad)
                        .addGap(33, 33, 33))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clickBotonCalcularPedido(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clickBotonCalcularPedido
        
        String nombreIngresado;String hora;String demoraIngresada;
        
        nombreIngresado = (String) textFieldNombre.getText().trim();
        hora = textFieldHora.getText().trim();
        demoraIngresada = textFieldDemora.getText().trim();
        String [] horaArray=hora.trim().split(":");
        boolean horaValida=false;
        if(horaArray.length==3){
            try{
                int horaActual=Integer.valueOf(horaArray[0]);
                int minutosActual=Integer.valueOf(horaArray[1]);
                int segundosActual=Integer.valueOf(horaArray[2]);
                if(horaActual>=0&&minutosActual>=0&&segundosActual>=0){
                    horaValida=(horaActual<24&&minutosActual<60&&segundosActual<60);
                }
            }catch(Exception e){
                
            }
        }
        boolean datosDeClienteInvalidos=nombreIngresado.isEmpty()||demoraIngresada.isEmpty()||!horaValida;
        if(datosDeClienteInvalidos){
            if(demoraIngresada.isEmpty()){
            labelErrorDemora.setText("Demora vacia");
            }else{
                labelErrorDemora.setText(null);
            }if(nombreIngresado.isEmpty()){
                labelErrorNombre.setText("Nombre vacio");
            }else{
                labelErrorNombre.setText(null);
            }
            
            if(!horaValida){
                labelErrorHora.setText("Hora invalida");
            }else{
                labelErrorHora.setText(null);
            }
                
        }
        try {
            Integer demoraReal = Integer.valueOf(demoraIngresada);
            List<ItemPedido> pizzas=modeloTabla.getPizzas();
            String observaciones=textFieldObservaciones.getText();
            if(pizzas.size()==0){
                labelErrorListaVacia.setText("No hay pizzas para pedir");
            }else if(!datosDeClienteInvalidos){
                pedido=new Pedido(nombreIngresado, hora, demoraReal, pizzas, observaciones);
                float precio=pedido.getPrecioTotal();
                AdministradorDePedidos admin= new AdministradorDePedidos();
                Session session=NewHibernateUtil.getSessionFactory().openSession();
                session.beginTransaction();
                admin.obtenerListaDePedidos().add(pedido);
                session.merge(pedido);
                session.getTransaction().commit();
                session.close();
                try{
                pantallaPedidosEnviados.getModelo().agregarPedido(pedido);
                }catch(Exception e){
                    
                }
                this.modeloTabla.getPizzas().clear();
                this.setVisible(false);
            }
        } catch (NumberFormatException e) {
            if(!demoraIngresada.isEmpty()){
                labelErrorDemora.setText("Dato Invalido");
            }
            
        
        }
    }//GEN-LAST:event_clickBotonCalcularPedido

    private void botonAgregarPizzaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarPizzaActionPerformed
        Pizza pizzaIngresada;
        Integer tamanioSeleccionado=Integer.valueOf((String)comboBoxTamanio.getSelectedItem());
        
        String nombreVariedad = (String) comboBoxVariedad.getSelectedItem();
        int indiceVariedadSeleccioada = comboBoxVariedad.getSelectedIndex();
        
        
        
        
        Tipo tipoSeleccionado;
        String tipo = (String) comboBoxTipo.getSelectedItem();
            if (tipo.equals("A la piedra")) {
            tipoSeleccionado = Tipo.PIEDRA;
            } else if (tipo.equals("A la parrilla")) {
            tipoSeleccionado = Tipo.PARRILA;
            } else {
            tipoSeleccionado = Tipo.MOLDE;
            }
            Variedad variedad=this.variedades.get(indiceVariedadSeleccioada);
            pizzaIngresada=new Pizza(tamanioSeleccionado, tipoSeleccionado, variedad);
            String cantidad=textFieldCantidad.getText().trim();
            Integer cantidadReal;
            if(cantidad.isEmpty()){
                labelErrorCantidad.setText("Cantidad Vacia");
            }else{
                labelErrorCantidad.setText(null);
                try{
                    cantidadReal=Integer.valueOf(cantidad);
                    if(cantidadReal<=0){
                        labelErrorCantidad.setText("Cantidad invalida");
                    }else{
                        ItemPedido itemFinal=new ItemPedido(pizzaIngresada, cantidadReal);
                        modeloTabla.agregarPizza(itemFinal);
                    }
                    }catch(Exception e){
                        labelErrorCantidad.setText("Inserte un numero ");
                
            }
        }
    }//GEN-LAST:event_botonAgregarPizzaActionPerformed

    private void comboBoxVariedadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxVariedadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxVariedadActionPerformed

    private void botonAdministrarVariedadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAdministrarVariedadActionPerformed
        GUIAdministrarVariedad adV=new GUIAdministrarVariedad();
        adV.setVisible(true);
        adV.setPizzeria(this);
    }//GEN-LAST:event_botonAdministrarVariedadActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUIPizzeriaCantidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIPizzeriaCantidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIPizzeriaCantidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIPizzeriaCantidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIPizzeriaCantidades().setVisible(true);

            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAdministrarVariedad;
    private javax.swing.JButton botonAgregarPizza;
    private javax.swing.JButton botonCalcularPedido;
    private javax.swing.JComboBox<String> comboBoxTamanio;
    private javax.swing.JComboBox<String> comboBoxTipo;
    private javax.swing.JComboBox<String> comboBoxVariedad;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelDemora;
    private javax.swing.JLabel labelErrorCantidad;
    private javax.swing.JLabel labelErrorDemora;
    private javax.swing.JLabel labelErrorHora;
    private javax.swing.JLabel labelErrorListaVacia;
    private javax.swing.JLabel labelErrorNombre;
    private javax.swing.JLabel labelHora;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel labelObservaciones;
    private javax.swing.JLabel labelPizzas;
    private javax.swing.JTable tablaPizzas;
    private javax.swing.JTextField textFieldCantidad;
    private javax.swing.JTextField textFieldDemora;
    private javax.swing.JTextField textFieldHora;
    private javax.swing.JTextField textFieldNombre;
    private javax.swing.JTextField textFieldObservaciones;
    // End of variables declaration//GEN-END:variables
    public void iniciarTabla() {
        modeloTabla=new ModeloTablasPizzasAPedir();
        tablaPizzas.setModel(modeloTabla);
        AdministradorDeVariedades admin=new AdministradorDeVariedades();
        variedades=admin.obtenerVariedades();
        for(Variedad v:variedades){
            
            comboBoxVariedad.addItem(v.getNombrePizza());
        }
            
    }
    
    private void hourConfig() {
        Date date = new Date();
        Calendar calendar = GregorianCalendar.getInstance();
        calendar.setTime(date);
        int hora = calendar.get(Calendar.HOUR_OF_DAY);
        int minutos = calendar.get(Calendar.MINUTE);
        int segundos = calendar.get(Calendar.SECOND);

        String formatoHora = hora + ":";
        if (minutos < 10) {
            formatoHora += "0" + minutos + ":";
        } else {
            formatoHora += minutos + ":";
        }
        if (segundos < 10) {
            formatoHora += "0" + segundos;
        } else {
            formatoHora += segundos;
        }
        textFieldHora.setText(formatoHora);
    }
    
    public Pedido getPedido() {
        return pedido;
    }
    
    public void setGui(GUITablaDePedidos pantallaPedidos) {
        this.pantallaPedidosEnviados = pantallaPedidos;
    }
    public List<Variedad>getVariedades(){
        return this.variedades;
    }

    public JComboBox<String> getComboBoxVariedad() {
        return comboBoxVariedad;
    }
}
