/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package HER_2301081010;

/**
 *
 * @author Muhamad Farhan
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextField;
public class Form_Pdam extends javax.swing.JFrame {
    

    /**
     * Creates new form FormPdam
     */
    
    public Form_Pdam() {
        initComponents();
        
    }

    public JTable getTblPdam() {
        return tblPdam;
    }

    public JTextField getTxtKode() {
        return txtKode;
    }

    public JTextField getTxtMeterBulanIni() {
        return txtMeterBulanIni;
    }

    public JTextField getTxtMeterBulanLalu() {
        return txtMeterBulanLalu;
    }

    public JTextField getTxtNama() {
        return txtNama;
    }

    public JTextField getTxtTanggal() {
        return txtTanggal;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtKode = new javax.swing.JTextField();
        txtNama = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtTanggal = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtMeterBulanIni = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtMeterBulanLalu = new javax.swing.JTextField();
        btnInsert = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblPdam = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        cbJenis = new javax.swing.JComboBox<>();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("Kode Pembayaran");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 10, 96, 16);
        getContentPane().add(txtKode);
        txtKode.setBounds(160, 10, 370, 22);

        txtNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNamaActionPerformed(evt);
            }
        });
        getContentPane().add(txtNama);
        txtNama.setBounds(160, 40, 370, 22);

        jLabel3.setText("Jenis Pelanggan");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 70, 100, 16);

        jLabel4.setText("Tanggal");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 100, 50, 16);
        getContentPane().add(txtTanggal);
        txtTanggal.setBounds(160, 100, 370, 22);

        jLabel5.setText("Meter Bulan Ini");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(10, 130, 90, 16);
        getContentPane().add(txtMeterBulanIni);
        txtMeterBulanIni.setBounds(160, 130, 370, 22);

        jLabel6.setText("Meter Bulan Lalu");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(10, 160, 100, 16);

        txtMeterBulanLalu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMeterBulanLaluActionPerformed(evt);
            }
        });
        getContentPane().add(txtMeterBulanLalu);
        txtMeterBulanLalu.setBounds(160, 160, 370, 22);

        btnInsert.setText("Insert");
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });
        getContentPane().add(btnInsert);
        btnInsert.setBounds(10, 200, 72, 23);

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpdate);
        btnUpdate.setBounds(100, 200, 72, 23);

        btnDelete.setText("Delete");
        getContentPane().add(btnDelete);
        btnDelete.setBounds(190, 200, 72, 23);

        btnCancel.setText("Cancel");
        getContentPane().add(btnCancel);
        btnCancel.setBounds(280, 200, 72, 23);

        tblPdam.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Kode Pelanggan", "Nama pelanggan", "Jenis Pelanggan", "Tanggal", "Meter Bulan Ini", "Meter Bulan Lalu", "Total"
            }
        ));
        jScrollPane2.setViewportView(tblPdam);
        if (tblPdam.getColumnModel().getColumnCount() > 0) {
            tblPdam.getColumnModel().getColumn(0).setResizable(false);
            tblPdam.getColumnModel().getColumn(1).setResizable(false);
            tblPdam.getColumnModel().getColumn(2).setResizable(false);
            tblPdam.getColumnModel().getColumn(3).setResizable(false);
            tblPdam.getColumnModel().getColumn(4).setResizable(false);
        }

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(10, 240, 560, 402);

        jLabel8.setText("Nama Pelanggan");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(10, 40, 100, 16);

        cbJenis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(cbJenis);
        cbJenis.setBounds(160, 70, 72, 22);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void txtNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNamaActionPerformed

    private void txtMeterBulanLaluActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMeterBulanLaluActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMeterBulanLaluActionPerformed

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
        
      
// TODO add your handling code here:
    }//GEN-LAST:event_btnInsertActionPerformed

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
            java.util.logging.Logger.getLogger(Form_Pdam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form_Pdam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form_Pdam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form_Pdam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form_Pdam().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cbJenis;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tblPdam;
    private javax.swing.JTextField txtKode;
    private javax.swing.JTextField txtMeterBulanIni;
    private javax.swing.JTextField txtMeterBulanLalu;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtTanggal;
    // End of variables declaration//GEN-END:variables
}
