/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author usuario 10
 */
public class GUIPantallaPizzeria extends javax.swing.JFrame {

    /**
     * Creates new form GUIPantallaPizzeria
     */
    public GUIPantallaPizzeria() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelCliente = new javax.swing.JLabel();
        labelHora = new javax.swing.JLabel();
        labelPizzeriaPedido = new javax.swing.JLabel();
        labelPorciones = new javax.swing.JLabel();
        labelTipo = new javax.swing.JLabel();
        labelVariedad = new javax.swing.JLabel();
        labelPizzeriaPedidoResultado = new javax.swing.JLabel();
        labelPorcionesRespuesta = new javax.swing.JLabel();
        labelTipoRespuesta = new javax.swing.JLabel();
        labelVariedadRespuesta = new javax.swing.JLabel();
        labelClienteRespuesta = new javax.swing.JLabel();
        labelHoraRespuesta = new javax.swing.JLabel();
        labelTotal = new javax.swing.JLabel();
        labelPizzaCant = new javax.swing.JLabel();
        labelPizzaCantRespuesta = new javax.swing.JLabel();
        botonCerrar = new javax.swing.JButton();
        botonImprimir = new javax.swing.JButton();
        labelObservaciones = new javax.swing.JLabel();
        labelObservacionesRespuesta = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(487, 530));

        labelCliente.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelCliente.setText("Cliente: ");

        labelHora.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelHora.setText("Hora:");

        labelPizzeriaPedido.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        labelPizzeriaPedido.setText("Pizzeria: Pedido");

        labelPorciones.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelPorciones.setText("Porciones de la Pizza:");

        labelTipo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelTipo.setText("Tipo de Pizza:");
        labelTipo.setToolTipText("");

        labelVariedad.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelVariedad.setText("Varriedad elegida:");

        labelPizzeriaPedidoResultado.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        labelPizzeriaPedidoResultado.setForeground(new java.awt.Color(0, 0, 204));

        labelPorcionesRespuesta.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelPorcionesRespuesta.setText("jLabel1");

        labelTipoRespuesta.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelTipoRespuesta.setText("jLabel2");

        labelVariedadRespuesta.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelVariedadRespuesta.setText("jLabel3");

        labelClienteRespuesta.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelClienteRespuesta.setForeground(new java.awt.Color(0, 0, 255));
        labelClienteRespuesta.setText("Nombre");

        labelHoraRespuesta.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelHoraRespuesta.setForeground(new java.awt.Color(0, 0, 255));
        labelHoraRespuesta.setText("0:00");

        labelTotal.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        labelTotal.setText("Precio Total :");

        labelPizzaCant.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelPizzaCant.setText("Cantidad Pizzas:");

        labelPizzaCantRespuesta.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelPizzaCantRespuesta.setForeground(new java.awt.Color(0, 0, 255));
        labelPizzaCantRespuesta.setText("0");

        botonCerrar.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        botonCerrar.setText("Cerrar");
        botonCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eventoCerrarPestaña(evt);
            }
        });

        botonImprimir.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N
        botonImprimir.setText("Imprimir");
        botonImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imprimirTicket(evt);
            }
        });

        labelObservaciones.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelObservaciones.setText("Observaciones:");

        labelObservacionesRespuesta.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(labelCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelClienteRespuesta))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelTipo)
                            .addComponent(labelPorciones)
                            .addComponent(labelVariedad)
                            .addComponent(labelPizzaCant)
                            .addComponent(labelObservaciones)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(botonImprimir)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 145, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelPizzaCantRespuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelHora)
                            .addComponent(labelVariedadRespuesta)
                            .addComponent(labelTipoRespuesta)
                            .addComponent(labelPorcionesRespuesta))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelHoraRespuesta))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(botonCerrar)))
                .addGap(38, 38, 38))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(labelPizzeriaPedido))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(labelTotal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(labelPizzeriaPedidoResultado)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(labelObservacionesRespuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCliente)
                    .addComponent(labelHora)
                    .addComponent(labelClienteRespuesta)
                    .addComponent(labelHoraRespuesta))
                .addGap(18, 18, 18)
                .addComponent(labelPizzeriaPedido)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPorciones)
                    .addComponent(labelPorcionesRespuesta))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTipo)
                    .addComponent(labelTipoRespuesta))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelVariedad)
                    .addComponent(labelVariedadRespuesta))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPizzaCant)
                    .addComponent(labelPizzaCantRespuesta))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelObservaciones)
                    .addComponent(labelObservacionesRespuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelPizzeriaPedidoResultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void eventoCerrarPestaña(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eventoCerrarPestaña
        this.dispose();
    }//GEN-LAST:event_eventoCerrarPestaña

    private void imprimirTicket(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imprimirTicket
        this.print(getGraphics());
    }//GEN-LAST:event_imprimirTicket

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
            java.util.logging.Logger.getLogger(GUIPantallaPizzeria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIPantallaPizzeria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIPantallaPizzeria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIPantallaPizzeria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIPantallaPizzeria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCerrar;
    private javax.swing.JButton botonImprimir;
    private javax.swing.JLabel labelCliente;
    private javax.swing.JLabel labelClienteRespuesta;
    private javax.swing.JLabel labelHora;
    private javax.swing.JLabel labelHoraRespuesta;
    private javax.swing.JLabel labelObservaciones;
    private javax.swing.JLabel labelObservacionesRespuesta;
    private javax.swing.JLabel labelPizzaCant;
    private javax.swing.JLabel labelPizzaCantRespuesta;
    private javax.swing.JLabel labelPizzeriaPedido;
    private javax.swing.JLabel labelPizzeriaPedidoResultado;
    private javax.swing.JLabel labelPorciones;
    private javax.swing.JLabel labelPorcionesRespuesta;
    private javax.swing.JLabel labelTipo;
    private javax.swing.JLabel labelTipoRespuesta;
    private javax.swing.JLabel labelTotal;
    private javax.swing.JLabel labelVariedad;
    private javax.swing.JLabel labelVariedadRespuesta;
    // End of variables declaration//GEN-END:variables

    public void inicializar (Pedido pedido) {
        labelClienteRespuesta.setText(pedido.getNombreCliente());
        labelHoraRespuesta.setText(pedido.getHoraCreacion());
        labelPizzaCantRespuesta.setText(String.valueOf(pedido.getPedido().getCantidad()));
        labelPorcionesRespuesta.setText(pedido.getPedido().getPizza().getVariedad().getNombrePizza());
        labelTipoRespuesta.setText(pedido.getPedido().getPizza().getTipo().name());
        labelVariedadRespuesta.setText(pedido.getPedido().getPizza().getVariedad().getNombrePizza());
        labelPizzeriaPedidoResultado.setText(String.valueOf(pedido.getPedido().calcularCosto()));
    }

}
