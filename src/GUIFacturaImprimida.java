/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author usuario 10
 */
public class GUIFacturaImprimida extends javax.swing.JFrame {

    /**
     * Creates new form GUIFacturaImprimida
     */
    public GUIFacturaImprimida() {
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

        labelTitulo = new javax.swing.JLabel();
        labelNombre = new javax.swing.JLabel();
        labelCostoTotal = new javax.swing.JLabel();
        labelHora = new javax.swing.JLabel();
        labelHoraEntrega = new javax.swing.JLabel();
        labelNombreRespuesta = new javax.swing.JLabel();
        labelCostoTotalRespuesta = new javax.swing.JLabel();
        labelHoraRespuesta = new javax.swing.JLabel();
        labelHoraEntregaRespuesta = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelTitulo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        labelTitulo.setText("Pizzeria: Factura");

        labelNombre.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelNombre.setText("Nombre:");

        labelCostoTotal.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelCostoTotal.setText("Costo Total:");

        labelHora.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelHora.setText("Hora:");

        labelHoraEntrega.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelHoraEntrega.setText("Hora de Entrega:");

        labelNombreRespuesta.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelNombreRespuesta.setText("label1");

        labelCostoTotalRespuesta.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelCostoTotalRespuesta.setText("label2");

        labelHoraRespuesta.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelHoraRespuesta.setText("label3");

        labelHoraEntregaRespuesta.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelHoraEntregaRespuesta.setText("label4");

        jLabel1.setText("(Para los clientes que su pedido aun esta en la cocina)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelNombre)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelHoraEntrega)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelTitulo)
                                    .addComponent(labelCostoTotal)
                                    .addComponent(labelHora))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 113, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelNombreRespuesta, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelCostoTotalRespuesta, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelHoraRespuesta, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelHoraEntregaRespuesta, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(93, 93, 93))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNombre)
                    .addComponent(labelNombreRespuesta))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCostoTotal)
                    .addComponent(labelCostoTotalRespuesta))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelHora)
                    .addComponent(labelHoraRespuesta))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelHoraEntrega)
                    .addComponent(labelHoraEntregaRespuesta))
                .addContainerGap(98, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(GUIFacturaImprimida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIFacturaImprimida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIFacturaImprimida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIFacturaImprimida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIFacturaImprimida().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel labelCostoTotal;
    private javax.swing.JLabel labelCostoTotalRespuesta;
    private javax.swing.JLabel labelHora;
    private javax.swing.JLabel labelHoraEntrega;
    private javax.swing.JLabel labelHoraEntregaRespuesta;
    private javax.swing.JLabel labelHoraRespuesta;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel labelNombreRespuesta;
    private javax.swing.JLabel labelTitulo;
    // End of variables declaration//GEN-END:variables
}
