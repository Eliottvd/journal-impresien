/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package applic_salle_presse;

import java.util.ArrayList;
import java.util.StringTokenizer;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Eliott
 */


public class newsProcessingWindow extends javax.swing.JDialog {

    /**
     * Creates new form newsProcessingWindow
     */
    String tmpCat;
    mainWindow mw2;
    boolean modif;
       
    public newsProcessingWindow(java.awt.Frame parent, boolean modal, String titre) { 
        super(parent, modal);
        initComponents();
        jTextNomNews.setText(titre);
        mw2 = (mainWindow)parent;
        this.setLocationRelativeTo(null);
        tmpCat = "";
        modif = false;
    }
    
    public newsProcessingWindow(java.awt.Frame parent, boolean modal)
    {
        super(parent, modal);
        initComponents();
        mw2 = (mainWindow)parent;
        this.setLocationRelativeTo(null);
        modif = true;
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
        jTextArea1 = new javax.swing.JTextArea();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jTextMotsCles = new javax.swing.JTextField();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        jTextNomNews = new javax.swing.JTextField();
        jButtonPlus = new javax.swing.JButton();
        jCMmotscles = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextComments = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jRadioInter = new javax.swing.JRadioButton();
        jRadioPolitique = new javax.swing.JRadioButton();
        jRadioSport = new javax.swing.JRadioButton();
        jRadioRagots = new javax.swing.JRadioButton();
        jButtonAjouter = new javax.swing.JButton();
        jButtonAnnuler = new javax.swing.JButton();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("News");

        jCheckBox1.setText("Important");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Mot clé :");

        jButtonPlus.setText("+");
        jButtonPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPlusActionPerformed(evt);
            }
        });

        jLabel3.setText("Commentaires :");

        jTextComments.setColumns(20);
        jTextComments.setRows(5);
        jScrollPane2.setViewportView(jTextComments);

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel4.setText("Traitement de la news");

        buttonGroup1.add(jRadioInter);
        jRadioInter.setText("Internationnales");
        jRadioInter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioInterActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioPolitique);
        jRadioPolitique.setText("Vie politique");
        jRadioPolitique.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioPolitiqueActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioSport);
        jRadioSport.setText("Infos Sports ");
        jRadioSport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioSportActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioRagots);
        jRadioRagots.setText("Ragots et potins");
        jRadioRagots.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioRagotsActionPerformed(evt);
            }
        });

        jButtonAjouter.setText("Ajouter");
        jButtonAjouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAjouterActionPerformed(evt);
            }
        });

        jButtonAnnuler.setText("Annuler");
        jButtonAnnuler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAnnulerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jRadioInter)
                                .addGap(40, 40, 40)
                                .addComponent(jRadioPolitique)
                                .addGap(40, 40, 40)
                                .addComponent(jRadioSport)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                                .addComponent(jRadioRagots))
                            .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextNomNews, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(29, 29, 29)
                                        .addComponent(jTextMotsCles)
                                        .addGap(29, 29, 29)
                                        .addComponent(jButtonPlus)))
                                .addGap(18, 18, 18)
                                .addComponent(jCMmotscles, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(283, 283, 283)
                        .addComponent(jButtonAjouter)
                        .addGap(82, 82, 82)
                        .addComponent(jButtonAnnuler)))
                .addContainerGap(105, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel4)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextNomNews, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioPolitique)
                    .addComponent(jRadioSport)
                    .addComponent(jRadioInter)
                    .addComponent(jRadioRagots))
                .addGap(48, 48, 48)
                .addComponent(jCheckBox1)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextMotsCles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPlus)
                    .addComponent(jCMmotscles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonAjouter)
                    .addComponent(jButtonAnnuler))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jButtonPlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPlusActionPerformed
        // TODO add your handling code here:
        jCMmotscles.removeAllItems();
        StringTokenizer st = new StringTokenizer(jTextMotsCles.getText(), "-");
        while(st.hasMoreTokens())
        {
            jCMmotscles.addItem(st.nextToken());
        }
    }//GEN-LAST:event_jButtonPlusActionPerformed

    private void jRadioSportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioSportActionPerformed
        // TODO add your handling code here:
        tmpCat = "Sport";
    }//GEN-LAST:event_jRadioSportActionPerformed

    private void jButtonAnnulerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAnnulerActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButtonAnnulerActionPerformed

    private void jButtonAjouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAjouterActionPerformed
        // TODO add your handling code here:
        
        News n = new News();
        n.setTitre(jTextNomNews.getText());
        n.setCat(tmpCat);
        n.setImportance(jCheckBox1.isSelected());
        n.setTexte(jTextComments.getText());
        
        StringTokenizer st = new StringTokenizer(jTextMotsCles.getText(), "-");
        while(st.hasMoreTokens())
        {
            n.addMotcle(st.nextToken());        }

        switch(tmpCat)
        {
            case "Internationnales" : mw2.getModInter().addElement(n.getTitre());
                                      mw2.jListInter.setModel(mw2.getModInter());
                                      mw2.listeNews.add(n);
                                      mw2.jCBnews.removeItem(mw2.jCBnews.getSelectedItem());
                                      this.dispose();
                                      break;
            case "Vie politique" : mw2.getModViePol().addElement(n.getTitre());
                                   mw2.jListViePol.setModel(mw2.getModViePol());
                                   mw2.listeNews.add(n);
                                   mw2.jCBnews.removeItem(mw2.jCBnews.getSelectedItem());
                                   this.dispose();
                                   break;
            case "Ragots et potins" : mw2.getModRagots().addElement(n.getTitre());
                                      mw2.jListRagots.setModel(mw2.getModRagots());
                                      mw2.listeNews.add(n);
                                      mw2.jCBnews.removeItem(mw2.jCBnews.getSelectedItem());
                                      this.dispose();
                                      break;
            case "Sport" : mw2.getModInfosSports().addElement(n.getTitre());
                           mw2.jListInfosSports.setModel(mw2.getModInfosSports());
                           mw2.listeNews.add(n);
                           mw2.jCBnews.removeItem(mw2.jCBnews.getSelectedItem());
                           this.dispose();
                           break;
            default : JOptionPane.showMessageDialog(new JFrame(), "Veuillez choisir une catégorie", 
                    "Information manquante", JOptionPane.ERROR_MESSAGE);                                                                              
        }
    }//GEN-LAST:event_jButtonAjouterActionPerformed

    private void jRadioInterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioInterActionPerformed
        // TODO add your handling code here:
        tmpCat = "Internationnales";
    }//GEN-LAST:event_jRadioInterActionPerformed

    private void jRadioPolitiqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioPolitiqueActionPerformed
        // TODO add your handling code here:
        tmpCat = "Vie politique";
    }//GEN-LAST:event_jRadioPolitiqueActionPerformed

    private void jRadioRagotsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioRagotsActionPerformed
        // TODO add your handling code here:
        tmpCat = "Ragots et potins";
    }//GEN-LAST:event_jRadioRagotsActionPerformed

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
            java.util.logging.Logger.getLogger(newsProcessingWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(newsProcessingWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(newsProcessingWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(newsProcessingWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                newsProcessingWindow dialog = new newsProcessingWindow(new javax.swing.JFrame(), true, "titre");
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButtonAjouter;
    private javax.swing.JButton jButtonAnnuler;
    private javax.swing.JButton jButtonPlus;
    private javax.swing.JComboBox<String> jCMmotscles;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JRadioButton jRadioInter;
    private javax.swing.JRadioButton jRadioPolitique;
    private javax.swing.JRadioButton jRadioRagots;
    private javax.swing.JRadioButton jRadioSport;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextComments;
    private javax.swing.JTextField jTextMotsCles;
    private javax.swing.JTextField jTextNomNews;
    // End of variables declaration//GEN-END:variables
}
