
import java.awt.Color;
import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author usuario 10
 */
public class GUIPantallaPedidos extends javax.swing.JFrame {
    private Pedido[]pedidos=new Pedido[5];
    javax.swing.JLabel[]labels;
    /**
     * Creates new form GUIPantallaPizzeria
     */
    public GUIPantallaPedidos() {
        initComponents();
        inicioOculto();
        
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
        LabelCliente1 = new javax.swing.JLabel();
        LabelClienteRespuesta1 = new javax.swing.JLabel();
        LabelHora1 = new javax.swing.JLabel();
        LabelHoraRespuesta1 = new javax.swing.JLabel();
        labelVariedadResupuesta1 = new javax.swing.JLabel();
        labelTipoResupuesta1 = new javax.swing.JLabel();
        labelPorcionesRespuesta1 = new javax.swing.JLabel();
        labelCantidad1 = new javax.swing.JLabel();
        labelCantidadResultado1 = new javax.swing.JLabel();
        labelPrecioTotal1 = new javax.swing.JLabel();
        labelResultadoTotal1 = new javax.swing.JLabel();
        labelObservacion1 = new javax.swing.JLabel();
        labelObsRespuesta1 = new javax.swing.JLabel();
        botonImpimir1 = new javax.swing.JButton();
        botonAgregarPedido = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelCliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelCliente.setText("Cliente: ");

        labelHora.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelHora.setText("Hora:");

        labelPizzeriaPedidoResultado.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
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
        labelHoraRespuesta.setForeground(new java.awt.Color(0, 204, 51));
        labelHoraRespuesta.setText("0:00");

        labelTotal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelTotal.setText("Precio Total :");

        labelPizzaCant.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelPizzaCant.setText("Cantidad:");

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

        botonImprimir.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        botonImprimir.setText("Imprimir");
        botonImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imprimirTicket(evt);
            }
        });

        labelObservaciones.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelObservaciones.setText("Observaciones:");

        labelObservacionesRespuesta.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        LabelCliente1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LabelCliente1.setText("Cliente: ");

        LabelClienteRespuesta1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LabelClienteRespuesta1.setForeground(new java.awt.Color(0, 0, 255));
        LabelClienteRespuesta1.setText("jLabel1");

        LabelHora1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LabelHora1.setText("Hora:");

        LabelHoraRespuesta1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LabelHoraRespuesta1.setForeground(new java.awt.Color(0, 204, 51));
        LabelHoraRespuesta1.setText("0:00");

        labelVariedadResupuesta1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelVariedadResupuesta1.setText("Var1");

        labelTipoResupuesta1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelTipoResupuesta1.setText("jLabel1");

        labelPorcionesRespuesta1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelPorcionesRespuesta1.setText("jLabel1");

        labelCantidad1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelCantidad1.setText("Cantidad:");

        labelCantidadResultado1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelCantidadResultado1.setForeground(new java.awt.Color(0, 0, 255));
        labelCantidadResultado1.setText("0");

        labelPrecioTotal1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelPrecioTotal1.setText("Precio Total :");

        labelResultadoTotal1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelResultadoTotal1.setText("jLabel1");

        labelObservacion1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelObservacion1.setText("jLabel1");

        labelObsRespuesta1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelObsRespuesta1.setText("jLabel2");

        botonImpimir1.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N
        botonImpimir1.setText("Imprimir");

        botonAgregarPedido.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N
        botonAgregarPedido.setText("Agregar Pedido");
        botonAgregarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarPedidoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelObservaciones, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(labelCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(labelClienteRespuesta))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelVariedadRespuesta)
                                    .addComponent(labelObservacion1))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(92, 92, 92)
                                        .addComponent(labelObsRespuesta1))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(78, 78, 78)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(labelTipoRespuesta)
                                            .addComponent(labelTipoResupuesta1))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addGap(131, 131, 131)
                                                .addComponent(labelPorcionesRespuesta))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(92, 92, 92)
                                                .addComponent(labelPorcionesRespuesta1)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 115, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(labelCantidad1)
                                            .addComponent(labelPizzaCant))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(labelCantidadResultado1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(labelPrecioTotal1))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(labelPizzaCantRespuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(labelTotal))))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelVariedadResupuesta1)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(187, 187, 187)
                                                .addComponent(labelHora))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(LabelCliente1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(LabelClienteRespuesta1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(LabelHora1)))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(labelHoraRespuesta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(LabelHoraRespuesta1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(75, 75, 75)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelResultadoTotal1)
                            .addComponent(labelPizzeriaPedidoResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(84, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botonAgregarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonImpimir1)
                    .addComponent(botonCerrar)
                    .addComponent(botonImprimir)
                    .addComponent(labelObservacionesRespuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39))
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
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelVariedadRespuesta)
                        .addComponent(labelTipoRespuesta)
                        .addComponent(labelPorcionesRespuesta)
                        .addComponent(labelPizzaCant)
                        .addComponent(labelPizzaCantRespuesta)
                        .addComponent(labelTotal))
                    .addComponent(labelPizzeriaPedidoResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addComponent(labelObservaciones)
                .addGap(29, 29, 29)
                .addComponent(botonImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelCliente1)
                    .addComponent(LabelClienteRespuesta1)
                    .addComponent(LabelHora1)
                    .addComponent(LabelHoraRespuesta1))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelVariedadResupuesta1)
                    .addComponent(labelTipoResupuesta1)
                    .addComponent(labelPorcionesRespuesta1)
                    .addComponent(labelCantidad1)
                    .addComponent(labelCantidadResultado1)
                    .addComponent(labelPrecioTotal1)
                    .addComponent(labelResultadoTotal1))
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelObservacionesRespuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelObservacion1)
                        .addComponent(labelObsRespuesta1)))
                .addGap(18, 18, 18)
                .addComponent(botonImpimir1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(botonAgregarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addComponent(botonCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
        );

        botonAgregarPedido.getAccessibleContext().setAccessibleName("AgregarPedido");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void eventoCerrarPestaña(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eventoCerrarPestaña
        this.dispose();
    }//GEN-LAST:event_eventoCerrarPestaña

    private void imprimirTicket(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imprimirTicket
        this.print(getGraphics());
    }//GEN-LAST:event_imprimirTicket

    private void botonAgregarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarPedidoActionPerformed
        GUIPizzeriaCantidades nuevaPizza=new GUIPizzeriaCantidades();
        nuevaPizza.setVisible(true);
        nuevaPizza.setGui(this);
    }//GEN-LAST:event_botonAgregarPedidoActionPerformed

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
            java.util.logging.Logger.getLogger(GUIPantallaPedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIPantallaPedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIPantallaPedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIPantallaPedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIPantallaPedidos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelCliente1;
    private javax.swing.JLabel LabelClienteRespuesta1;
    private javax.swing.JLabel LabelHora1;
    private javax.swing.JLabel LabelHoraRespuesta1;
    private javax.swing.JButton botonAgregarPedido;
    private javax.swing.JButton botonCerrar;
    private javax.swing.JButton botonImpimir1;
    private javax.swing.JButton botonImprimir;
    private javax.swing.JLabel labelCantidad1;
    private javax.swing.JLabel labelCantidadResultado1;
    private javax.swing.JLabel labelCliente;
    private javax.swing.JLabel labelClienteRespuesta;
    private javax.swing.JLabel labelHora;
    private javax.swing.JLabel labelHoraRespuesta;
    private javax.swing.JLabel labelObsRespuesta1;
    private javax.swing.JLabel labelObservacion1;
    private javax.swing.JLabel labelObservaciones;
    private javax.swing.JLabel labelObservacionesRespuesta;
    private javax.swing.JLabel labelPizzaCant;
    private javax.swing.JLabel labelPizzaCantRespuesta;
    private javax.swing.JLabel labelPizzeriaPedidoResultado;
    private javax.swing.JLabel labelPorcionesRespuesta;
    private javax.swing.JLabel labelPorcionesRespuesta1;
    private javax.swing.JLabel labelPrecioTotal1;
    private javax.swing.JLabel labelResultadoTotal1;
    private javax.swing.JLabel labelTipoRespuesta;
    private javax.swing.JLabel labelTipoResupuesta1;
    private javax.swing.JLabel labelTotal;
    private javax.swing.JLabel labelVariedadRespuesta;
    private javax.swing.JLabel labelVariedadResupuesta1;
    // End of variables declaration//GEN-END:variables

    public void inicializar (Pedido pedido) {
        pedidos[0]=pedido;
        labelClienteRespuesta.setText(pedido.getNombreCliente());
        labelHoraRespuesta.setText(pedido.getHoraCreacion());
        labelPizzaCantRespuesta.setText(String.valueOf(pedido.getPedido().getCantidad()));
        labelPorcionesRespuesta.setText(pedido.getPedido().getPizza().getTamanio()+" porc.");
        labelTipoRespuesta.setText(pedido.getPedido().getPizza().getTipo().name());
        labelVariedadRespuesta.setText(pedido.getPedido().getPizza().getVariedad().getNombrePizza());
        labelPizzeriaPedidoResultado.setText("$" + String.valueOf(pedido.getPedido().calcularCosto()));
        inicializaTask();
    }
    public void inicializaTask(){
        TimerTask task=new TimerTask() {
            @Override
            public void run() {
                try{
                    if(pedidos[0].pedidoAtrasado(Calendar.getInstance())){
                        labelHoraRespuesta.setForeground(Color.red);
                    }
                    
                }catch (Exception e){
                    
                }
                
                
            }
        };
        Timer time =new Timer();
        time.schedule(task, 3000, 15000);
    }

    public void inicioOculto(){
        labelCantidad1.setVisible(false);
        labelCantidadResultado1.setVisible(false);
        labelPorcionesRespuesta1.setVisible(false);
        labelPrecioTotal1.setVisible(false);
        labelTipoResupuesta1.setVisible(false);
        labelVariedadResupuesta1.setVisible(false);
        LabelClienteRespuesta1.setVisible(false);
        LabelCliente1.setVisible(false);
        LabelHora1.setVisible(false);
        LabelHoraRespuesta1.setVisible(false);
        botonImpimir1.setVisible(false);
        labelObservacion1.setVisible(false);
        labelObsRespuesta1.setVisible(false);
        labelObservacion1.setVisible(false);
        labelResultadoTotal1.setVisible(false);
        
    }
}
