package projekod;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static projekod.baglama.conn;

public class kayit extends javax.swing.JFrame {
    
    Connection conn;
    ResultSet rs;
    PreparedStatement pst;
    DefaultTableModel table_model = new DefaultTableModel();

    public kayit() {
        initComponents(); 
        Object[] columns= {"Film Turleri"}; 
        table_model.setColumnIdentifiers(columns);
        table.setModel(table_model);
       
        veri_yukle();
    }
    
    public void veri_yukle(){
        conn =baglama.tur_baglama();
        if(conn!=null){
            String sql="Select tur from filmturleri";
            
            try {
                pst=conn.prepareStatement(sql);
                rs=pst.executeQuery();
                Object[] data= new Object[2]; 
                
                while(rs.next())
            {
                data[0]=rs.getString("tur");
                table_model.addRow(data);
            }
            table.setModel(table_model);
                
                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
                
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        kayit_kayit = new javax.swing.JButton();
        kayit_sifre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        kayit_dogum = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        kayit_mail = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        kayit_isim = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Film Turleri"
            }
        ));
        table.setCellSelectionEnabled(true);
        jScrollPane1.setViewportView(table);
        table.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 50, 220, 190));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aksiyon ve Macera", "Belgesel", "Bilim Kurgu ve Fantastik Yapımlar", "Bilim ve Doga", "Cocuk ve Aile", "Drama", "Gerilim", "Komedi", "Korku", "Romantik" }));
        getContentPane().add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, -1, -1));

        jLabel8.setText("3.");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, -1, -1));

        jLabel7.setText("2.");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aksiyon ve Macera", "Belgesel", "Bilim Kurgu ve Fantastik Yapımlar", "Bilim ve Doga", "Cocuk ve Aile", "Drama", "Gerilim", "Komedi", "Korku", "Romantik" }));
        getContentPane().add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aksiyon ve Macera", "Belgesel", "Bilim Kurgu ve Fantastik Yapımlar", "Bilim ve Doga", "Cocuk ve Aile", "Drama", "Gerilim", "Komedi", "Korku", "Romantik" }));
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, -1, -1));

        jLabel6.setText("1.");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));

        jLabel5.setText("Lütfen 3 film türü seciniz.");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, -1, -1));

        kayit_kayit.setText("Kaydol");
        kayit_kayit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kayit_kayitActionPerformed(evt);
            }
        });
        getContentPane().add(kayit_kayit, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, -1, -1));

        kayit_sifre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kayit_sifreActionPerformed(evt);
            }
        });
        getContentPane().add(kayit_sifre, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 82, -1));

        jLabel4.setText("Sifre");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));
        getContentPane().add(kayit_dogum, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 82, -1));

        jLabel3.setText("Dogum tarihi");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));
        getContentPane().add(kayit_mail, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 82, -1));

        jLabel2.setText("Mail");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, -1));
        getContentPane().add(kayit_isim, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 82, -1));

        jLabel1.setText("Isim");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 52, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projekod/WhatsApp Image 2020-06-01 at 17.11.07.jpeg"))); // NOI18N
        jLabel10.setText("jLabel10");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kayit_sifreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kayit_sifreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kayit_sifreActionPerformed

    private void kayit_kayitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kayit_kayitActionPerformed
        String yeni_mail, yeni_sifre, yeni_isim, yeni_dogum, sql_sorgu;
       
       yeni_mail=kayit_mail.getText();
       yeni_isim=kayit_isim.getText();
       yeni_dogum=kayit_dogum.getText();
       yeni_sifre=kayit_sifre.getText();
        
       sql_sorgu= "INSERT INTO kullanicilar (mail, sifre, isim, dogum_tarihi)"+ "VALUES ('"+ yeni_mail+"', '"+ yeni_sifre+"', '" + yeni_isim+"', '" +yeni_dogum+"')";
       System.out.println(sql_sorgu); 
        
        try {
            baglama.ekle(sql_sorgu);
        } catch (SQLException ex) {
            Logger.getLogger(kayit.class.getName()).log(Level.SEVERE, null, ex);
        }
        giris lgf = new giris();
        lgf.setVisible(true);
        lgf.pack();
        lgf.setLocationRelativeTo(null);
        lgf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
        
        
    }//GEN-LAST:event_kayit_kayitActionPerformed

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
            java.util.logging.Logger.getLogger(kayit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(kayit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(kayit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(kayit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new kayit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField kayit_dogum;
    private javax.swing.JTextField kayit_isim;
    private javax.swing.JButton kayit_kayit;
    private javax.swing.JTextField kayit_mail;
    private javax.swing.JTextField kayit_sifre;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables

}
