/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package applic_points_presse;
import applic_salle_presse.*;
import java.util.*;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import network.NetworkBasicClient;
import network.NetworkBasicServer;



/**
 *
 * @author Admin
 */
public class JournalisteWindows extends javax.swing.JFrame implements RecevoirMsgListener{

    /**
     * Creates new form JournalisteWindows
     */
    public Categorie tmpCategorie;
    
    private ArrayList<News> _listeJournalisteNews;
    public ArrayList<News> getListeJournalisteNews(){return _listeJournalisteNews;}
    public void setListeJournalisteNews(ArrayList<News> l){_listeJournalisteNews=l;}
    //public ArrayList<News> listeJournalisteNews;
    private NetworkBasicClient NBC;
    private ArrayList<Notifmessage> _listeImplNotifmessages;
    public void setImplNotifmessage(ArrayList<Notifmessage> m)
    {
        _listeImplNotifmessages=(m);
    }
    public void addListenerNotifMessage(Notifmessage k)
    {
        getImplNotifmessages().add(k);
    }
    public ArrayList<Notifmessage> getImplNotifmessages(){return _listeImplNotifmessages;}
    
     private NotifyNewsListener _mainWindow;
     
     public void setMainWindow(NotifyNewsListener n){_mainWindow=n;}
     
     public NotifyNewsListener getMainWindow(){return _mainWindow;}
     
    
    // public NetworkBasicServer NBS;
    
    private String _reponseRecu;
    public void setReponseRecu(String x){_reponseRecu=x;}
    public String getReponseRecu(){return _reponseRecu;}
   
    
    public JournalisteWindows(NotifyNewsListener firstWindow) {
        initComponents();
        _listeImplNotifmessages=new ArrayList<Notifmessage>();
        _listeJournalisteNews=new ArrayList<News>();
        
        setMainWindow(firstWindow);
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabelJournaliste = new javax.swing.JLabel();
        jTextFieldJournaliste = new javax.swing.JTextField();
        jLabelTitre = new javax.swing.JLabel();
        jTextFieldTitre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldTexte = new javax.swing.JTextField();
        jRadioButtonPolitique = new javax.swing.JRadioButton();
        jRadioButtonInternational = new javax.swing.JRadioButton();
        jRadioButtonSports = new javax.swing.JRadioButton();
        jRadioButtonRagotPotin = new javax.swing.JRadioButton();
        jCheckBoxImportant = new javax.swing.JCheckBox();
        jButtonAnnuler = new javax.swing.JButton();
        jButtonEnvoyer = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableNews = new javax.swing.JTable();
        jLabelLogEvenement = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaLogEvenement = new javax.swing.JTextArea();
        jLabelCompteurNews = new javax.swing.JLabel();
        jCheckBoxNewsenvoye = new javax.swing.JCheckBox();
        jLabelReponseRecu = new javax.swing.JLabel();
        jLabelReponse = new javax.swing.JLabel();
        jLabelNombreNews = new javax.swing.JLabel();
        jButtonEnregistrer = new javax.swing.JButton();
        javax.swing.JButton jButtonLireNews = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuConnexion = new javax.swing.JMenu();
        jMenuItemDemarrerReception = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Nouvelle News");

        jLabelJournaliste.setText("Journaliste:");

        jTextFieldJournaliste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldJournalisteActionPerformed(evt);
            }
        });

        jLabelTitre.setText("Titre:");

        jLabel3.setText("Texte:");

        buttonGroup1.add(jRadioButtonPolitique);
        jRadioButtonPolitique.setText("Politique");
        jRadioButtonPolitique.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonPolitiqueActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButtonInternational);
        jRadioButtonInternational.setText("International");
        jRadioButtonInternational.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonInternationalActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButtonSports);
        jRadioButtonSports.setText("Sports");
        jRadioButtonSports.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonSportsActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButtonRagotPotin);
        jRadioButtonRagotPotin.setText("Ragots et Potins");
        jRadioButtonRagotPotin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonRagotPotinActionPerformed(evt);
            }
        });

        jCheckBoxImportant.setText("Important");

        jButtonAnnuler.setText("Annuler");

        jButtonEnvoyer.setText("Envoyer");
        jButtonEnvoyer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEnvoyerActionPerformed(evt);
            }
        });

        jTableNews.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "News", "Type", "Important ?", "Journaliste"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableNews);

        jLabelLogEvenement.setText("Log des evenements :");

        jTextAreaLogEvenement.setColumns(20);
        jTextAreaLogEvenement.setRows(5);
        jScrollPane2.setViewportView(jTextAreaLogEvenement);

        jLabelCompteurNews.setText("0");

        jCheckBoxNewsenvoye.setText("News envoyé");
        jCheckBoxNewsenvoye.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxNewsenvoyeActionPerformed(evt);
            }
        });

        jLabelReponseRecu.setText("Reponse:");

        jLabelReponse.setText("_");

        jLabelNombreNews.setText("Nombre de News envoyes durant cette session :");

        jButtonEnregistrer.setText("Enregister");
        jButtonEnregistrer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEnregistrerActionPerformed(evt);
            }
        });

        jButtonLireNews.setText("Lire News");
        jButtonLireNews.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLireNewsActionPerformed(evt);
            }
        });

        jMenuConnexion.setText("Connexion");

        jMenuItemDemarrerReception.setText("Demarrer reception");
        jMenuItemDemarrerReception.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemDemarrerReceptionActionPerformed(evt);
            }
        });
        jMenuConnexion.add(jMenuItemDemarrerReception);

        jMenuBar1.add(jMenuConnexion);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButtonRagotPotin)
                            .addComponent(jRadioButtonSports)
                            .addComponent(jRadioButtonInternational)
                            .addComponent(jRadioButtonPolitique)
                            .addComponent(jCheckBoxImportant))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabelReponseRecu)
                                        .addGap(31, 31, 31))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabelReponse, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(9, 9, 9)))
                                .addComponent(jCheckBoxNewsenvoye))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButtonEnvoyer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButtonAnnuler, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButtonEnregistrer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButtonLireNews, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(53, 53, 53)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelNombreNews)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabelCompteurNews, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE)
                                .addComponent(jLabelLogEvenement)
                                .addComponent(jScrollPane2)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelJournaliste)
                            .addComponent(jLabelTitre)
                            .addComponent(jLabel3))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextFieldTexte, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextFieldTitre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextFieldJournaliste, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 534, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNombreNews)
                    .addComponent(jLabelCompteurNews, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelJournaliste)
                            .addComponent(jTextFieldJournaliste, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelTitre)
                            .addComponent(jTextFieldTitre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldTexte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addComponent(jRadioButtonPolitique)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButtonInternational)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButtonSports)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButtonRagotPotin)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelReponseRecu)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelReponse))
                            .addComponent(jCheckBoxNewsenvoye))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jCheckBoxImportant)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addComponent(jButtonLireNews)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelLogEvenement)
                    .addComponent(jButtonAnnuler))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonEnvoyer)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonEnregistrer)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButtonPolitiqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonPolitiqueActionPerformed
             
        tmpCategorie=Categorie.POLITIQUE;    
// TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonPolitiqueActionPerformed

    private void jRadioButtonInternationalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonInternationalActionPerformed
       tmpCategorie=Categorie.INTERNATIONNAL; 
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonInternationalActionPerformed

    private void jRadioButtonSportsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonSportsActionPerformed
            
        tmpCategorie=Categorie.SPORT; 

            // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonSportsActionPerformed

    private void jRadioButtonRagotPotinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonRagotPotinActionPerformed
       tmpCategorie=Categorie.RAGOT; 
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonRagotPotinActionPerformed

    private void jTextFieldJournalisteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldJournalisteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldJournalisteActionPerformed

    private void jButtonEnvoyerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEnvoyerActionPerformed
       News NewsEnregistree=new News();
       String Envoye =new String();
       
       
        
       if(jTableNews.getRowSelectionAllowed())
       {
           int i;
           for(i=0;i<jTableNews.getSelectedRow();i++)
           {
                
  
           }
           NewsEnregistree= getListeJournalisteNews().get(i);
           Envoye=NewsEnregistree.getTitre()+"/"+NewsEnregistree.getTexte()+"/"+NewsEnregistree.getSource()+"/"+NewsEnregistree.getCat().toString()+"/"+NewsEnregistree.getImportance();
           
           System.out.println(Envoye);
           

           
           
          
           
           Event1News EvNews1=new Event1News();
           EvNews1.setMessageTraite(Envoye);
           EvNews1.setLocalite("Charleroi");
           
           EvNews1.setMainPrincipale(getMainWindow());
           
           NBC.sendStringWithoutWaiting(Envoye);
           
                      
            try 
            {
                Thread.sleep(1000, 0);
            } catch (InterruptedException ex) 
            {
                Logger.getLogger(mainWindow.class.getName()).log(Level.SEVERE, null, ex);
            }
            
           for(i=0;i<getImplNotifmessages().size();i++)
               getImplNotifmessages().get(i).ActionReceive(EvNews1);


           // NBC.setEndSending();

       }
       else
       {
           JOptionPane.showMessageDialog(new JFrame(), "Pas de catégorie selectionnée", "Information manquante", JOptionPane.ERROR_MESSAGE);
       }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonEnvoyerActionPerformed

    private void jButtonEnregistrerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEnregistrerActionPerformed
        // TODO add your handling code here:
        News newsJournaliste= new News();
        newsJournaliste.setTitre(jTextFieldTitre.getText());
        newsJournaliste.setCat(tmpCategorie);
        newsJournaliste.setImportance(jCheckBoxImportant.isSelected());
        newsJournaliste.setTexte(jTextFieldTexte.getText());
        newsJournaliste.setSource(jTextFieldJournaliste.getText());
        
        
        getListeJournalisteNews().add(newsJournaliste);
        int i;
        for( i=0;i<getListeJournalisteNews().size();i++)
        {
            News Newspossedee;
            Newspossedee= getListeJournalisteNews().get(i);
             jTableNews.getModel().setValueAt(Newspossedee.getTitre(), i, 0);
             jTableNews.getModel().setValueAt(Newspossedee.getCat(), i, 1);
             if(Newspossedee.getImportance())
             {
                 jTableNews.getModel().setValueAt("Y", i, 2);
             }
             else
             {
                 jTableNews.getModel().setValueAt("N", i, 2);
             }
             
             jTableNews.getModel().setValueAt(Newspossedee.getSource(), i, 3);

                 
        }
        String Nbrenvoye=Integer.toString(i);
        jLabelCompteurNews.setText(Nbrenvoye);
        
        Date date=new Date();
        Calendar calendar= GregorianCalendar.getInstance();
        calendar.setTime(date);
        String sep=System.getProperty("line.separator");
        
        jTextAreaLogEvenement.append("["+ calendar.get(Calendar.HOUR_OF_DAY)+":"+calendar.get(Calendar.MINUTE)+"]"+"Une news enregistree avec succes("+newsJournaliste.getSource()+")-"+newsJournaliste.getTitre()+sep);
        
       
        //NBS=new NetworkBasicServer(60002, jCheckBoxImportant);
        
        
        
        //newsJournaliste.sets
    }//GEN-LAST:event_jButtonEnregistrerActionPerformed

    private void jCheckBoxNewsenvoyeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxNewsenvoyeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxNewsenvoyeActionPerformed

    private void jMenuItemDemarrerReceptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemDemarrerReceptionActionPerformed
                
                
            Destinataire=new ReceivingBean(jCheckBoxNewsenvoye);
            addListenerNotifMessage(Destinataire);// TODO add your handling code here:
            try 
            {
                Thread.sleep(1000, 0);
            } catch (InterruptedException ex) 
            {
                Logger.getLogger(mainWindow.class.getName()).log(Level.SEVERE, null, ex);
            }
            NBC=new NetworkBasicClient("localhost", 60001);
                
    }//GEN-LAST:event_jMenuItemDemarrerReceptionActionPerformed

    private void jButtonLireNewsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLireNewsActionPerformed
        
        //setReponseRecu(NBS.getMessage());
        //jLabelReponse.setText(getReponseRecu());        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonLireNewsActionPerformed

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
            java.util.logging.Logger.getLogger(JournalisteWindows.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JournalisteWindows.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JournalisteWindows.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JournalisteWindows.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                NotifyNewsListener nodefaut;
                try {
                    nodefaut = new mainWindow("dev");
                new JournalisteWindows(nodefaut).setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(JournalisteWindows.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    
    @Override
     public void actionliremessage(RecuMessageEvent RME)
     {
         jLabelReponse.setText(RME.getMsg());
     }

    public ReceivingBean Destinataire;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButtonAnnuler;
    private javax.swing.JButton jButtonEnregistrer;
    private javax.swing.JButton jButtonEnvoyer;
    private javax.swing.JCheckBox jCheckBoxImportant;
    private javax.swing.JCheckBox jCheckBoxNewsenvoye;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelCompteurNews;
    private javax.swing.JLabel jLabelJournaliste;
    private javax.swing.JLabel jLabelLogEvenement;
    private javax.swing.JLabel jLabelNombreNews;
    private javax.swing.JLabel jLabelReponse;
    private javax.swing.JLabel jLabelReponseRecu;
    private javax.swing.JLabel jLabelTitre;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuConnexion;
    private javax.swing.JMenuItem jMenuItemDemarrerReception;
    private javax.swing.JRadioButton jRadioButtonInternational;
    private javax.swing.JRadioButton jRadioButtonPolitique;
    private javax.swing.JRadioButton jRadioButtonRagotPotin;
    private javax.swing.JRadioButton jRadioButtonSports;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableNews;
    private javax.swing.JTextArea jTextAreaLogEvenement;
    private javax.swing.JTextField jTextFieldJournaliste;
    private javax.swing.JTextField jTextFieldTexte;
    private javax.swing.JTextField jTextFieldTitre;
    // End of variables declaration//GEN-END:variables
}
