/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Summarizer.Summary;
import java.awt.CardLayout;
import java.io.File;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Safer
 */
public class Base extends javax.swing.JFrame {

    /**
     * Creates new form Base
     */
    public Base() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        mainPanel = new javax.swing.JPanel();
        basePanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        newQueryButton = new javax.swing.JButton();
        existingDataButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        newQuery = new javax.swing.JPanel();
        Add = new javax.swing.JLabel();
        queryfield = new javax.swing.JTextField();
        showSummaryNButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        textarea = new javax.swing.JTextArea();
        backNButton = new javax.swing.JButton();
        length = new javax.swing.JComboBox();
        links = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        oldData = new javax.swing.JPanel();
        backOButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        farmer = new javax.swing.JRadioButton();
        yemen = new javax.swing.JRadioButton();
        netnu = new javax.swing.JRadioButton();
        showSummaryOButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        oldtextarea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mainPanel.setLayout(new java.awt.CardLayout());

        basePanel.setPreferredSize(new java.awt.Dimension(624, 537));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("AUTOMATIC SUMMARIZATION SYSYTEM");

        newQueryButton.setText("NEW QUERY");
        newQueryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newQueryButtonActionPerformed(evt);
            }
        });

        existingDataButton.setText("EXISTING DATASET");
        existingDataButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                existingDataButtonActionPerformed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/NIELIT_logo.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");

        javax.swing.GroupLayout basePanelLayout = new javax.swing.GroupLayout(basePanel);
        basePanel.setLayout(basePanelLayout);
        basePanelLayout.setHorizontalGroup(
            basePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(basePanelLayout.createSequentialGroup()
                .addGap(163, 163, 163)
                .addComponent(newQueryButton)
                .addGap(115, 115, 115)
                .addComponent(existingDataButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, basePanelLayout.createSequentialGroup()
                .addContainerGap(137, Short.MAX_VALUE)
                .addGroup(basePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, basePanelLayout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(183, 183, 183))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, basePanelLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76))))
        );
        basePanelLayout.setVerticalGroup(
            basePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(basePanelLayout.createSequentialGroup()
                .addContainerGap(63, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jLabel5)
                .addGap(50, 50, 50)
                .addGroup(basePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newQueryButton)
                    .addComponent(existingDataButton))
                .addGap(113, 113, 113))
        );

        mainPanel.add(basePanel, "card1");

        newQuery.setPreferredSize(new java.awt.Dimension(624, 537));

        Add.setText("ENTER THE QUERY");

        queryfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                queryfieldActionPerformed(evt);
            }
        });

        showSummaryNButton.setText("SHOW SUMMARY");
        showSummaryNButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showSummaryNButtonActionPerformed(evt);
            }
        });

        jScrollPane1.setEnabled(false);
        jScrollPane1.setHorizontalScrollBar(null);

        textarea.setColumns(20);
        textarea.setRows(5);
        jScrollPane1.setViewportView(textarea);

        backNButton.setText("BACK");
        backNButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backNButtonActionPerformed(evt);
            }
        });

        length.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Default", "5", "7", "10" }));

        links.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Default", "5", "10", "15" }));

        jLabel3.setText("select summary size");

        jLabel4.setText("select number of links");

        javax.swing.GroupLayout newQueryLayout = new javax.swing.GroupLayout(newQuery);
        newQuery.setLayout(newQueryLayout);
        newQueryLayout.setHorizontalGroup(
            newQueryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(newQueryLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(backNButton, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(252, 252, 252))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, newQueryLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(newQueryLayout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addGroup(newQueryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(showSummaryNButton)
                    .addComponent(Add))
                .addGap(126, 126, 126)
                .addGroup(newQueryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, newQueryLayout.createSequentialGroup()
                        .addComponent(length, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(links, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, newQueryLayout.createSequentialGroup()
                        .addComponent(queryfield, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(newQueryLayout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))))
        );
        newQueryLayout.setVerticalGroup(
            newQueryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(newQueryLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(newQueryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Add)
                    .addComponent(queryfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(newQueryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(showSummaryNButton)
                    .addComponent(length, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(links, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(newQueryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(backNButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        mainPanel.add(newQuery, "card2");

        backOButton.setText("BACK");
        backOButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backOButtonActionPerformed(evt);
            }
        });

        jLabel2.setText("CHOOSE A DATA SET");

        buttonGroup1.add(farmer);
        farmer.setText("Farmer Suicide");

        buttonGroup1.add(yemen);
        yemen.setText("Paris Attack");

        buttonGroup1.add(netnu);
        netnu.setText("Net Neutrality");

        showSummaryOButton.setText("Show Summary");
        showSummaryOButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showSummaryOButtonActionPerformed(evt);
            }
        });

        oldtextarea.setColumns(20);
        oldtextarea.setRows(5);
        jScrollPane2.setViewportView(oldtextarea);

        javax.swing.GroupLayout oldDataLayout = new javax.swing.GroupLayout(oldData);
        oldData.setLayout(oldDataLayout);
        oldDataLayout.setHorizontalGroup(
            oldDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(oldDataLayout.createSequentialGroup()
                .addContainerGap(171, Short.MAX_VALUE)
                .addComponent(backOButton, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(126, 126, 126)
                .addComponent(showSummaryOButton)
                .addGap(142, 142, 142))
            .addGroup(oldDataLayout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(jLabel2)
                .addGap(54, 54, 54)
                .addGroup(oldDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(farmer)
                    .addComponent(yemen)
                    .addComponent(netnu))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(oldDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, oldDataLayout.createSequentialGroup()
                    .addContainerGap(80, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(80, Short.MAX_VALUE)))
        );
        oldDataLayout.setVerticalGroup(
            oldDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, oldDataLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(oldDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(yemen))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(farmer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(netnu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 375, Short.MAX_VALUE)
                .addGroup(oldDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backOButton)
                    .addComponent(showSummaryOButton))
                .addGap(32, 32, 32))
            .addGroup(oldDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, oldDataLayout.createSequentialGroup()
                    .addContainerGap(116, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(78, Short.MAX_VALUE)))
        );

        mainPanel.add(oldData, "card3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 3, Short.MAX_VALUE)
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 3, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void newQueryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newQueryButtonActionPerformed
        // TODO add your handling code here:
        CardLayout card = (CardLayout)mainPanel.getLayout();
        card.show(mainPanel, "card2");
    }//GEN-LAST:event_newQueryButtonActionPerformed

    private void backNButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backNButtonActionPerformed
        // TODO add your handling code here:
        textarea.setText("");
        CardLayout card = (CardLayout)mainPanel.getLayout();
        card.show(mainPanel, "card1");
    }//GEN-LAST:event_backNButtonActionPerformed

    private void showSummaryNButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showSummaryNButtonActionPerformed
        // TODO add your handling code here:
        textarea.setText("");
        if (queryfield.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter proper text", "error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        for(File f: new File("Documents/").listFiles()) {
            f.delete();
        }
        int len = ((String)(length.getSelectedItem())).equals("Default") ? 5 : Integer.parseInt((String)(length.getSelectedItem()));
        int lin = ((String)(links.getSelectedItem())).equals("Default") ? 5 : Integer.parseInt((String)(links.getSelectedItem()));
        System.out.println(len + " " + lin);
        Summary summary = new Summary("Documents/", queryfield.getText(), len, lin);
        
        summary.makeHybridSummary();
        textarea.setLineWrap(true);
        textarea.setText(summary.summary.toString());
        queryfield.setText("");
         
    }//GEN-LAST:event_showSummaryNButtonActionPerformed

    private void queryfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_queryfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_queryfieldActionPerformed

    private void backOButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backOButtonActionPerformed
        // back from oldData to basePanel
        CardLayout card = (CardLayout)mainPanel.getLayout();
        card.show(mainPanel, "card1");
    }//GEN-LAST:event_backOButtonActionPerformed

    private void showSummaryOButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showSummaryOButtonActionPerformed
        // show old summary
        if(!farmer.isSelected() && !yemen.isSelected() && !netnu.isSelected()) {
            JOptionPane.showMessageDialog(null, "Please select a dataset", "error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (farmer.isSelected()) {
            Summary summary = new Summary("Farmer suicide/");
            summary.makeHybridSummary();
            oldtextarea.setLineWrap(true);
            oldtextarea.setText(summary.summary.toString());
            
        }else if(yemen.isSelected()) {
            Summary summary = new Summary("paris attack/");
            summary.makeHybridSummary();
            oldtextarea.setLineWrap(true);
            oldtextarea.setText(summary.summary.toString());
            
        }else {
            Summary summary = new Summary("netneutrality/");
            summary.makeHybridSummary();
            oldtextarea.setLineWrap(true);
            oldtextarea.setText(summary.summary.toString());
            
        }
        buttonGroup1.clearSelection();
    }//GEN-LAST:event_showSummaryOButtonActionPerformed

    private void existingDataButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_existingDataButtonActionPerformed
        // goto old dataset
        oldtextarea.setText("");
        CardLayout card = (CardLayout)mainPanel.getLayout();
        card.show(mainPanel, "card3");
    }//GEN-LAST:event_existingDataButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Base.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Base.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Base.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Base.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Base b = new Base();
                b.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                b.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Add;
    private javax.swing.JButton backNButton;
    private javax.swing.JButton backOButton;
    private javax.swing.JPanel basePanel;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton existingDataButton;
    private javax.swing.JRadioButton farmer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox length;
    private javax.swing.JComboBox links;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JRadioButton netnu;
    private javax.swing.JPanel newQuery;
    private javax.swing.JButton newQueryButton;
    private javax.swing.JPanel oldData;
    private javax.swing.JTextArea oldtextarea;
    private javax.swing.JTextField queryfield;
    private javax.swing.JButton showSummaryNButton;
    private javax.swing.JButton showSummaryOButton;
    private javax.swing.JTextArea textarea;
    private javax.swing.JRadioButton yemen;
    // End of variables declaration//GEN-END:variables
}
