
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
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
    

    /**
     * Creates new form NuevoPedido
     */
    public GUIPizzeriaCantidades() {
        initComponents();
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
        labelCosto = new javax.swing.JLabel();
        comboBoxTamanio = new javax.swing.JComboBox<>();
        comboBoxTipo = new javax.swing.JComboBox<>();
        comboBoxVariedad = new javax.swing.JComboBox<>();
        labelPizzas = new javax.swing.JLabel();
        textFieldCantidad = new javax.swing.JTextField();
        labelErrorDemora = new javax.swing.JLabel();
        labelErrorNombre = new javax.swing.JLabel();
        labelErrorCantidad = new javax.swing.JLabel();
        labelObservaciones = new javax.swing.JLabel();
        textFieldAgregar = new javax.swing.JTextField();
        LabelErrorHora = new javax.swing.JLabel();

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

        labelCosto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        comboBoxTamanio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        comboBoxTamanio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "8", "10", "12" }));

        comboBoxTipo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        comboBoxTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A la piedra", "A la parrilla", "Al molde" }));

        comboBoxVariedad.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        comboBoxVariedad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Muzzarella", "Jamon y Morrones", "Fugazzeta", "Cuatro Quesos", "Napolitana" }));

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

        LabelErrorHora.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LabelErrorHora.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(comboBoxTamanio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(116, 116, 116)
                                .addComponent(comboBoxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(78, 78, 78)
                                .addComponent(comboBoxVariedad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(labelDemora)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(textFieldDemora, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(labelHora)
                                            .addComponent(labelNombre))
                                        .addGap(47, 47, 47)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(textFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(textFieldHora, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(21, 21, 21)
                                        .addComponent(labelErrorDemora, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(labelErrorNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(LabelErrorHora, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(labelPizzas)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(textFieldCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(labelErrorCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(labelObservaciones)
                                        .addGap(18, 18, 18)
                                        .addComponent(textFieldAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap(74, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelCosto, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonCalcularPedido)
                        .addGap(113, 113, 113))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelErrorNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelNombre)
                        .addComponent(textFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelErrorHora, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelHora, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelErrorDemora, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelDemora)
                    .addComponent(textFieldDemora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBoxTamanio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxVariedad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPizzas)
                    .addComponent(textFieldCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelErrorCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelObservaciones)
                    .addComponent(textFieldAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelCosto, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonCalcularPedido))
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clickBotonCalcularPedido(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clickBotonCalcularPedido
        String nombreIngresado;String hora;String demoraIngresada;
        String cantidad=textFieldCantidad.getText().trim();
        nombreIngresado = (String) textFieldNombre.getText().trim();
        hora = textFieldHora.getText().trim();
        demoraIngresada = textFieldDemora.getText().trim();
        String [] horaArray=hora.split(":");
        boolean horaValida=false;
        if(horaArray.length==3){
            try{
                boolean corte=true;
                for (int i = 0; i < horaArray.length&&corte; i++) {
                    String tiempoString = horaArray[i].trim();
                    if(!tiempoString.isEmpty()){
                        Integer valor=Integer.valueOf(tiempoString);
                        if(i==0&&valor>=24){
                            corte=false;
                        }else if(valor>=60){
                            corte=false;
                        }
                    }  else{
                        horaValida=false;
                    }  
                } horaValida=corte;
            }catch(Exception e){
                
            }
        }
            
        if(nombreIngresado.isEmpty()||demoraIngresada.isEmpty()||cantidad.isEmpty()||!horaValida){
            if(demoraIngresada.isEmpty()){
            labelErrorDemora.setText("Texto vacio");
            }else{
                labelErrorDemora.setText(null);
            }               
            if(nombreIngresado.isEmpty()){
                labelErrorNombre.setText("Nombre vacio");
            }else{
                labelErrorNombre.setText(null);
            }
                
            if(cantidad.isEmpty()){
                labelErrorCantidad.setText("Cantidad vacia");
            }else{
                labelErrorCantidad.setText(null);
            }
            if(!horaValida){
                LabelErrorHora.setText("Hora invalida");
            }else{
                LabelErrorHora.setText(null);
            }
                
        }else {
            labelErrorNombre.setText(null);
            labelErrorCantidad.setText(null);
            labelErrorDemora.setText(null);
            
        
        try {
            Integer demoraReal=Integer.valueOf(demoraIngresada);
            Integer cantidadReal=Integer.valueOf(cantidad);
            if(cantidadReal<1){
            labelErrorDemora.setText("Cantidad invalida");
            }else{
            String selectedItem = (String) comboBoxVariedad.getSelectedItem();
             Variedad variedadDeLaPizza = new Variedad(selectedItem);
            Tipo tipoSeleccionado;
            Integer tamanioSeleccionado = Integer.valueOf( (String) comboBoxTamanio.getSelectedItem());
        
            String tipo = (String) comboBoxTipo.getSelectedItem();
            if (tipo.equals("A la piedra")) {
            tipoSeleccionado = Tipo.PIEDRA;
            } else if (tipo.equals("A la parrilla")) {
            tipoSeleccionado = Tipo.PARRILA;
            } else {
            tipoSeleccionado = Tipo.MOLDE;
            }
            Pizza pizzaPedida = new Pizza(tamanioSeleccionado, tipoSeleccionado, variedadDeLaPizza);
            ItemPedido cantidaPedida = new ItemPedido(pizzaPedida, cantidadReal);
            pedido = new Pedido(nombreIngresado, hora, demoraReal, cantidaPedida);
            labelCosto.setText("$"+String.valueOf(pedido.getPrecio()));
            GUIPantallaPizzeria resultado=new GUIPantallaPizzeria();
            resultado.setVisible(true);
            resultado.inicializar(nombreIngresado, hora, cantidad, String.valueOf(tamanioSeleccionado), tipo, selectedItem, pedido.getPrecio());
        } }catch (NumberFormatException e) {
            labelErrorDemora.setText("Dato Invalido");
        }
        
        }
        
    }//GEN-LAST:event_clickBotonCalcularPedido

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
    private javax.swing.JLabel LabelErrorHora;
    private javax.swing.JButton botonCalcularPedido;
    private javax.swing.JComboBox<String> comboBoxTamanio;
    private javax.swing.JComboBox<String> comboBoxTipo;
    private javax.swing.JComboBox<String> comboBoxVariedad;
    private javax.swing.JLabel labelCosto;
    private javax.swing.JLabel labelDemora;
    private javax.swing.JLabel labelErrorCantidad;
    private javax.swing.JLabel labelErrorDemora;
    private javax.swing.JLabel labelErrorNombre;
    private javax.swing.JLabel labelHora;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel labelObservaciones;
    private javax.swing.JLabel labelPizzas;
    private javax.swing.JTextField textFieldAgregar;
    private javax.swing.JTextField textFieldCantidad;
    private javax.swing.JTextField textFieldDemora;
    private javax.swing.JTextField textFieldHora;
    private javax.swing.JTextField textFieldNombre;
    // End of variables declaration//GEN-END:variables
    private void hourConfig(){
        Date date= new Date();
        Calendar calendar= GregorianCalendar.getInstance();
        calendar.setTime(date);
        int hora=calendar.get(Calendar.HOUR_OF_DAY);
        int minutos=calendar.get(Calendar.MINUTE);
        int segundos=calendar.get(Calendar.SECOND);
        
        String formatoHora=hora+":";
        if(minutos<10){
            formatoHora+="0"+minutos+":";
        }else{
            formatoHora+=minutos+":";
        }
        if(segundos<10){
            formatoHora+="0"+segundos;
        }else{
            formatoHora+=segundos;
        }
        System.out.println(formatoHora);
        textFieldHora.setText(formatoHora);
    }


}
