/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import entity.Course;
import entity.Skema;
import java.io.File;
import java.util.ArrayList;
import selenium.Selenium;

/**
 *
 * @author Lenovo
 */
public class RecordGui extends javax.swing.JFrame {
    AlgorithmConnector ac = new AlgorithmConnector();
    SoundRecorder soundrec = new SoundRecorder();
    File wav;
    Selenium s = new Selenium();
    Skema skema = new Skema();
    

    /**
     * Creates new form RecordGui
     */
    public RecordGui() {
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

        jButton1 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        UserTextField = new javax.swing.JTextPane();
        CreateUserButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        RecordOneStatus = new javax.swing.JLabel();
        SkemaGetterButton = new javax.swing.JButton();
        SkemaTextField = new javax.swing.JTextField();
        HtmlLabel = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        jButton1.setText("jButton1");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane4.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setViewportView(UserTextField);

        CreateUserButton.setText("Create User");
        CreateUserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateUserButtonActionPerformed(evt);
            }
        });

        RecordOneStatus.setText("Not Recording");

        SkemaGetterButton.setText("Fetch Skema");
        SkemaGetterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SkemaGetterButtonActionPerformed(evt);
            }
        });

        HtmlLabel.setText("<html><head> <title>My schedule</title> <style>  th{background-color:white;font-weight:bold;font-size:10pt}  .open{color:red;background-color:white;font-size:10pt}  .scheduled{background:lightgrey;font-size:10pt}  .office{background:lightblue;font-size:10pt} .chapel{color:blue;background-color:yellow;font-size:10pt} </style> </head> <body> <h3>My schedule</h3>  <table border=1 width=100%> <tr>  <th width=16%>Monday</th> <th width=16%>Tuesday</th> <th width=16%>Wednesday</th> <th width=16%>Thursday</th> <th width=16%>Friday</th>\\ </tr> <tr> <td align=center rowspan=8 class=scheduled > Lunch<br/> Monday 08:00-12:00 </td> <td align=center rowspan=8 class=scheduled > Lunch<br/> Monday 08:00-12:00 </td> <td align=center rowspan=8 class=scheduled > Lunch<br/> Monday 08:00-12:00 </td> <td align=center rowspan=8 class=scheduled > Lunch<br/> Monday 08:00-12:00 </td> <td align=center rowspan=8 class=scheduled > Lunch<br/> Monday 08:00-12:00 </td> </tr> <tr> </tr> <tr> </tr> <tr> </tr> <tr> </tr> <tr> </tr> <tr> </tr> <tr> </tr> <tr> <td align=center rowspan=8 class=open><br>OPEN<br> </td> <td align=center rowspan=8 class=open><br>OPEN<br> </td> <td align=center rowspan=8 class=open><br>OPEN<br> </td> <td align=center rowspan=8 class=open><br>OPEN<br> </td> <td align=center rowspan=8 class=open><br>OPEN<br> </td> </tr> <tr> </tr> <tr> </tr> <tr> </tr> <tr> </tr> <tr> </tr> <tr> </tr> <tr> </tr> <tr> </tr> <tr> </tr> <tr> </tr> <tr> </tr> <tr> </tr> <tr> </tr> <tr> </tr> <tr> </tr> <tr> </tr> <tr> </tr> </table> <p> <small>Created using <a href=http://www.stolaf.edu/people/hansonr/mysched>http://www.stolaf.edu/people/hansonr/mysched</a></small> <div style=display:none><pre>   </pre></div> </body>");

        jButton2.setText("Test");
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
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(SkemaTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                            .addComponent(jScrollPane1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(354, 354, 354)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(CreateUserButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(SkemaGetterButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(HtmlLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69)
                        .addComponent(jButton2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addComponent(RecordOneStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(75, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(CreateUserButton)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(RecordOneStatus, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(69, 69, 69))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SkemaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SkemaGetterButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(HtmlLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
                                .addGap(48, 48, 48))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CreateUserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateUserButtonActionPerformed
User user = new User();
RecordOneStatus.setText("Please say Hello How are you");
user.createUser(UserTextField.getText());// TODO add your handling code here:
soundrec.startRecording(UserTextField.getText()+"\\record.wav");
        RecordOneStatus.setText("Please say i am fine");
        soundrec.startRecording(UserTextField.getText()+"\\record2.wav");
        RecordOneStatus.setText("Please say I love talking to myself");
        soundrec.startRecording(UserTextField.getText()+"\\record3.wav");
        RecordOneStatus.setText("Thx for your help");
        
        
    }//GEN-LAST:event_CreateUserButtonActionPerformed

    private void SkemaGetterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SkemaGetterButtonActionPerformed
skema = s.callSelenium(SkemaTextField.getText());
        System.out.println(skema.getCoursesOfWeek().size());
HtmlString htmlString = new HtmlString(skema.getCoursesOfWeek());
htmlString.setTimeAndActivity();
htmlString.setHtmlString();
        System.out.println(htmlString.getHtmlString());


HtmlLabel.setText(htmlString.getHtmlString());
    }//GEN-LAST:event_SkemaGetterButtonActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
AlgorithmConnector ac = new AlgorithmConnector();
ac.AlgorithmTester();
        
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
            java.util.logging.Logger.getLogger(RecordGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RecordGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RecordGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RecordGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RecordGui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CreateUserButton;
    private javax.swing.JLabel HtmlLabel;
    private javax.swing.JLabel RecordOneStatus;
    private javax.swing.JButton SkemaGetterButton;
    private javax.swing.JTextField SkemaTextField;
    private javax.swing.JTextPane UserTextField;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
