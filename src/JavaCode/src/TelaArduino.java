
import com.fazecast.jSerialComm.SerialPort;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aluno.saolucas
 */
public class TelaArduino extends javax.swing.JFrame {
private SerialPort serialPort;

    /**
     * Creates new form TelaArduino
     */
    public TelaArduino() {
        initComponents();
        initialize(); 
    }
 private void initialize() {
        carregarPortas(); // Chama o método para carregar as portas seriais no JComboBox
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        conectar = new javax.swing.JButton();
        Portas = new javax.swing.JComboBox<>();
        LigaDesliga = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        conectar.setBackground(new java.awt.Color(51, 255, 0));
        conectar.setText("Conectar");
        conectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conectarActionPerformed(evt);
            }
        });

        Portas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PortasActionPerformed(evt);
            }
        });

        LigaDesliga.setBackground(new java.awt.Color(0, 255, 0));
        LigaDesliga.setText("Liga/Desliga");
        LigaDesliga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LigaDesligaActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 0, 0));
        jButton2.setText("Desconectar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(conectar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(74, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(LigaDesliga, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(149, 149, 149))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Portas, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(135, 135, 135))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(Portas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(conectar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(LigaDesliga, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 
    public void carregarPortas() {
    SerialPort[] portNames = SerialPort.getCommPorts();
    
    for (SerialPort portName : portNames) {
        Portas.addItem(portName.getSystemPortName());
    }
}

    private void PortasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PortasActionPerformed
       
        carregarPortas();
        
    }//GEN-LAST:event_PortasActionPerformed

    private void LigaDesligaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LigaDesligaActionPerformed
 if (serialPort != null && serialPort.isOpen()) {
        try {
            if (LigaDesliga.getText().equals("Liga/Desliga")) {
                serialPort.getOutputStream().write('1');
                LigaDesliga.setText("Desligar");
                System.out.println("LED Ligado");
            } else {
                serialPort.getOutputStream().write('0');
                LigaDesliga.setText("Liga/Desliga");
                System.out.println("LED Desligado");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }        // TODO add your handling code here:
    }//GEN-LAST:event_LigaDesligaActionPerformed

    private void conectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conectarActionPerformed

    String portName = (String) Portas.getSelectedItem();
    serialPort = SerialPort.getCommPort(portName);
    serialPort.setComPortParameters(9600, 8, 1, 0);
    serialPort.setComPortTimeouts(SerialPort.TIMEOUT_SCANNER, 0, 0);

    if (serialPort.openPort()) {
        conectar.setBackground(new java.awt.Color(0, 255, 0));
        System.out.println("Conectado à porta " + portName);
    } else {
        conectar.setBackground(new java.awt.Color(255, 0, 0));
        System.out.println("Erro ao conectar à porta " + portName);
    }
       // TODO add your handling code here:
    }//GEN-LAST:event_conectarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    if (serialPort != null && serialPort.isOpen()) {
        serialPort.closePort();
        conectar.setBackground(new java.awt.Color(255, 0, 0));
        System.out.println("Desconectado.");
    }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaArduino.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaArduino.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaArduino.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaArduino.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaArduino().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LigaDesliga;
    private javax.swing.JComboBox<String> Portas;
    private javax.swing.JButton conectar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    // End of variables declaration//GEN-END:variables

    private void Portas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
