package bukuteleponahay;

import java.io.File;

public class test1 extends javax.swing.JFrame {

    public test1() {
        initComponents();
    }
    File fin = new File("D:\\bukutelponAHAY1.txt");
    File fout = new File("D:\\bukutelponAHAY2.txt");

    FileMaker fm = new FileMaker();
    umum ip = new umum();
    pelajar pl = new pelajar();
    pekerja pkr = new pekerja();
    String isi;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cariorang = new javax.swing.JButton();
        isian = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        teksarea = new javax.swing.JTextArea();
        tampilkanisi = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        kolomNama = new javax.swing.JTextField();
        KolomSurel = new javax.swing.JTextField();
        KolomAlamat = new javax.swing.JTextField();
        KolomNMR = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        lainlain = new javax.swing.JTextField();
        Oke = new javax.swing.JButton();
        PilihanCmb = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(239, 216, 216));
        jLabel1.setFont(new java.awt.Font("Calibri", 3, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("BUKU TELEPON KOTA AHAY");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setText("Selamat datang dalam program buku telepon kota Ahay");

        cariorang.setText("Cari orang");
        cariorang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cariorangActionPerformed(evt);
            }
        });

        isian.setText("Silahkan isi ");

        teksarea.setColumns(20);
        teksarea.setRows(5);
        jScrollPane1.setViewportView(teksarea);

        tampilkanisi.setText("Tampilkan isi buku!");
        tampilkanisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tampilkanisiActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setText("Isi Biodata");

        jLabel4.setText("Nama                 : ");

        jLabel5.setText("Alamat               : ");

        jLabel6.setText("Nomor Telepon  :");

        jLabel7.setText("Alamat Email      : ");

        kolomNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kolomNamaActionPerformed(evt);
            }
        });

        KolomSurel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KolomSurelActionPerformed(evt);
            }
        });

        KolomAlamat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KolomAlamatActionPerformed(evt);
            }
        });

        KolomNMR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KolomNMRActionPerformed(evt);
            }
        });

        jLabel8.setText("Status Pekerjaan Anda :");

        lainlain.setText("Silahkan isi jika memilih Lain-lain");
        lainlain.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        lainlain.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);

        Oke.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Oke.setText("OKE");
        Oke.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OkeActionPerformed(evt);
            }
        });

        PilihanCmb.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Belom/Tidak Bekerja", "Pelajar Sekolah/Mahasiswa", "Lain-lain"}));
        PilihanCmb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PilihanCmbActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tampilkanisi)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cariorang)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(isian, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(500, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(kolomNama, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(KolomAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(KolomSurel, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(KolomNMR, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel8)
                            .addComponent(Oke, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PilihanCmb, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lainlain, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cariorang)
                    .addComponent(isian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tampilkanisi)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 416, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel4))
                            .addComponent(kolomNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(KolomAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(KolomNMR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(KolomSurel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PilihanCmb, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lainlain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Oke, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cariorangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cariorangActionPerformed
        teksarea.setText(fm.getOrang(fin, isian.getText()));
    }//GEN-LAST:event_cariorangActionPerformed

    private void tampilkanisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tampilkanisiActionPerformed
        teksarea.setText("================================================================== \n"
                + "urutan : NO NAMA -TEMPAT TINGGAL -NO.TELP-EMAIL -PEKERJAAN \n"
                + "==================================================================="
                + "" + fm.DisplayOrang(fin));
    }//GEN-LAST:event_tampilkanisiActionPerformed

    private void kolomNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kolomNamaActionPerformed
//        isi += kolomNama.getText() + " ";
    }//GEN-LAST:event_kolomNamaActionPerformed

    private void KolomSurelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KolomSurelActionPerformed
//        isi += KolomSurel.getText() + " ";
    }//GEN-LAST:event_KolomSurelActionPerformed

    private void KolomAlamatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KolomAlamatActionPerformed
//        isi += KolomAlamat.getText() + " ";
    }//GEN-LAST:event_KolomAlamatActionPerformed

    private void KolomNMRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KolomNMRActionPerformed
//        isi += KolomNMR.getText() + " ";
    }//GEN-LAST:event_KolomNMRActionPerformed

    private void OkeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OkeActionPerformed
        switch ((String) PilihanCmb.getSelectedItem()) {
            case "Belom/Tidak Bekerja":
                isi = kolomNama.getText() + " " + KolomAlamat.getText() + " " + KolomNMR.getText() + " " + KolomSurel.getText() + " " + "Belom/Tidak Bekerja";
                break;
            case "Pelajar Sekolah/Mahasiswa":
                isi = kolomNama.getText() + " " + KolomAlamat.getText() + " " + KolomNMR.getText() + " " + KolomSurel.getText() + " " + "Pelajar Sekolah/Mahasiswa";
                break;
            case "Lain-lain":
//                lainlain.setText("Silahkan isi jika memilih lain-lain...");
                isi = kolomNama.getText() + " " + KolomAlamat.getText() + " " + KolomNMR.getText() + " " + KolomSurel.getText() + " " + lainlain.getText();
                break;
        }
        teksarea.setText(fm.FillOrang(fin, fout, isi));
        fm.EqualityFile(fout, fin);
        kolomNama.setText("");
        KolomAlamat.setText("");
        KolomSurel.setText("");
        KolomNMR.setText("");
        lainlain.setText("");

    }//GEN-LAST:event_OkeActionPerformed

    private void PilihanCmbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PilihanCmbActionPerformed

    }//GEN-LAST:event_PilihanCmbActionPerformed

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
            java.util.logging.Logger.getLogger(test1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(test1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(test1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(test1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new test1().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField KolomAlamat;
    private javax.swing.JTextField KolomNMR;
    private javax.swing.JTextField KolomSurel;
    private javax.swing.JButton Oke;
    private javax.swing.JComboBox PilihanCmb;
    private javax.swing.JButton cariorang;
    private javax.swing.JTextField isian;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField kolomNama;
    private javax.swing.JTextField lainlain;
    private javax.swing.JButton tampilkanisi;
    private javax.swing.JTextArea teksarea;
    // End of variables declaration//GEN-END:variables
}
