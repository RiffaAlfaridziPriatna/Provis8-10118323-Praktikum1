
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Riffa Alfaridzi P
 */
public class futama extends javax.swing.JFrame {

    /**
     * Creates new form futama
     */
    public futama() {
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

        LabelNama = new javax.swing.JLabel();
        BtnTekan = new javax.swing.JButton();
        LabelNim = new javax.swing.JLabel();
        LabelKelas = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pemrograman Visual");
        setResizable(false);

        LabelNama.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        LabelNama.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelNama.setText("Nama");

        BtnTekan.setText("Tekan Saya");
        BtnTekan.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnTekan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnTekanMouseClicked(evt);
            }
        });

        LabelNim.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        LabelNim.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelNim.setText("NIM");

        LabelKelas.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        LabelKelas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelKelas.setText("Kelas");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LabelNama, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(149, 149, 149)
                .addComponent(BtnTekan)
                .addContainerGap(152, Short.MAX_VALUE))
            .addComponent(LabelNim, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(LabelKelas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(LabelNama)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LabelNim)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LabelKelas)
                .addGap(14, 14, 14)
                .addComponent(BtnTekan)
                .addContainerGap(88, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnTekanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnTekanMouseClicked
        // TODO add your handling code here:
        LabelNama.setText("Riffa Alfaridzi Priatna");
        LabelNim.setText("10118323");
        LabelKelas.setText("IF 8");
        JOptionPane.showMessageDialog(null, "Anda berhasil Mengubah Nama, NIM, dan Kelas");
    }//GEN-LAST:event_BtnTekanMouseClicked

    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnTekan;
    private javax.swing.JLabel LabelKelas;
    private javax.swing.JLabel LabelNama;
    private javax.swing.JLabel LabelNim;
    // End of variables declaration//GEN-END:variables
}
