import java.sql.*;
import java.sql.DriverManager;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vondrew
 */
public class AdvicerForm extends javax.swing.JFrame {
    Connection con;
    ResultSet rs;
    PreparedStatement st;
    /**
     * Creates new form AdvicerForm
     */
    public AdvicerForm() {
        initComponents();
        setLocationRelativeTo(this);
        setTitle("Advicer Infractions"); 
        setDefaultCloseOperation(JFrame.MAXIMIZED_HORIZ);
        setResizable(false);
        
        try
        {
            String driver="com.mysql.jdbc.Driver";
            Class.forName(driver);
            con=DriverManager.getConnection("jdbc:mysql://localhost/studentw","root","");
            System.out.print("Connected");
        }catch(Exception e)
        {
            
        }
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        attirecomb = new javax.swing.JComboBox<String>();
        attendancecomb = new javax.swing.JComboBox<String>();
        jScrollPane1 = new javax.swing.JScrollPane();
        remark2 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        remark1 = new javax.swing.JTextArea();
        fourthq = new javax.swing.JTextField();
        firstq = new javax.swing.JTextField();
        secondq = new javax.swing.JTextField();
        thirdq = new javax.swing.JTextField();
        firstq2 = new javax.swing.JTextField();
        fourthq2 = new javax.swing.JTextField();
        thirdq2 = new javax.swing.JTextField();
        secondq2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        search1 = new javax.swing.JTextField();
        output1 = new javax.swing.JTextField();
        output3 = new javax.swing.JTextField();
        output4 = new javax.swing.JTextField();
        output2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        attirecomb.setFont(new java.awt.Font("Lucida Grande", 0, 24));
        attirecomb.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Haircut/Hairstyle", "School Uniform", "School ID", "Accesories" }));
        attirecomb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                attirecombActionPerformed(evt);
            }
        });
        jPanel1.add(attirecomb, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 630, 330, 40));

        attendancecomb.setFont(new java.awt.Font("Lucida Grande", 0, 24));
        attendancecomb.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Excessive Absences", "Habitual Tardiness", "Cutting Classes" }));
        attendancecomb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                attendancecombActionPerformed(evt);
            }
        });
        jPanel1.add(attendancecomb, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 400, 340, 40));

        remark2.setColumns(20);
        remark2.setRows(5);
        jScrollPane1.setViewportView(remark2);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 600, 280, 130));

        remark1.setColumns(20);
        remark1.setRows(5);
        jScrollPane2.setViewportView(remark1);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 350, 280, 130));

        fourthq.setFont(new java.awt.Font("Lucida Grande", 0, 24));
        fourthq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fourthqActionPerformed(evt);
            }
        });
        jPanel1.add(fourthq, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 390, 100, 50));

        firstq.setFont(new java.awt.Font("Lucida Grande", 0, 24));
        firstq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstqActionPerformed(evt);
            }
        });
        jPanel1.add(firstq, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 390, 100, 50));

        secondq.setFont(new java.awt.Font("Lucida Grande", 0, 24));
        secondq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                secondqActionPerformed(evt);
            }
        });
        jPanel1.add(secondq, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 390, 100, 50));

        thirdq.setFont(new java.awt.Font("Lucida Grande", 0, 24));
        thirdq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thirdqActionPerformed(evt);
            }
        });
        jPanel1.add(thirdq, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 390, 100, 50));

        firstq2.setFont(new java.awt.Font("Lucida Grande", 0, 24));
        firstq2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstq2ActionPerformed(evt);
            }
        });
        jPanel1.add(firstq2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 620, 100, 50));

        fourthq2.setFont(new java.awt.Font("Lucida Grande", 0, 24));
        fourthq2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fourthq2ActionPerformed(evt);
            }
        });
        jPanel1.add(fourthq2, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 620, 100, 50));

        thirdq2.setFont(new java.awt.Font("Lucida Grande", 0, 24));
        thirdq2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thirdq2ActionPerformed(evt);
            }
        });
        jPanel1.add(thirdq2, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 620, 100, 50));

        secondq2.setFont(new java.awt.Font("Lucida Grande", 0, 24));
        secondq2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                secondq2ActionPerformed(evt);
            }
        });
        jPanel1.add(secondq2, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 620, 100, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SUBMIT.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 560, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CLEAR small red.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 490, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SUBMIT.png"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 490, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CLEAR small red.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 560, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LOG OUT.png"))); // NOI18N
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 110, -1, 40));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Home 2.png"))); // NOI18N
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 70, -1, -1));

        search1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search1ActionPerformed(evt);
            }
        });
        search1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                search1KeyReleased(evt);
            }
        });
        jPanel1.add(search1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 120, 220, 50));
        jPanel1.add(output1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 140, 90, -1));
        jPanel1.add(output3, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 180, 130, 40));
        jPanel1.add(output4, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 180, 110, 40));

        output2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                output2ActionPerformed(evt);
            }
        });
        jPanel1.add(output2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 180, 180, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/INFRACTIONS WITH SEARCH FOR ADVISERS ONLY v2.png"))); // NOI18N
        jLabel1.setText("BG");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void attirecombActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_attirecombActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_attirecombActionPerformed

    private void attendancecombActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_attendancecombActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_attendancecombActionPerformed

    private void fourthqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fourthqActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fourthqActionPerformed

    private void firstqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstqActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstqActionPerformed

    private void secondqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_secondqActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_secondqActionPerformed

    private void thirdqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thirdqActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_thirdqActionPerformed

    private void firstq2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstq2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstq2ActionPerformed

    private void fourthq2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fourthq2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fourthq2ActionPerformed

    private void thirdq2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thirdq2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_thirdq2ActionPerformed

    private void secondq2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_secondq2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_secondq2ActionPerformed

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        loginform ab = new loginform();
        this.setVisible(false);
        ab.setVisible(true);
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        TeacherHomePage ab = new TeacherHomePage();
        this.setVisible(false);
        ab.setVisible(true);
    }//GEN-LAST:event_jLabel7MouseClicked

    private void search1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_search1ActionPerformed

    private void search1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_search1KeyReleased
      keyy();
    }//GEN-LAST:event_search1KeyReleased

    private void output2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_output2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_output2ActionPerformed

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
    String vb1 ="insert into infraction (categoryname, categorydesc, stid, stname, level, sec, firstq, secondq, thirdq, fourthq, remarks) values(?,?,?,?,?,?,?,?,?,?,?)";

        try
        {
            String cat1="Attendance";
            
            st=con.prepareStatement(vb1);
            st.setString(1,cat1);
            st.setString(2,attendancecomb.getSelectedItem().toString());
            st.setString(3,search1.getText());
            st.setString(4,output1.getText()+" "+output2.getText());
            st.setString(5,output3.getText());
            st.setString(6,output4.getText());
            st.setString(7,firstq.getText());
            st.setString(8,secondq.getText());
            st.setString(9,thirdq.getText());
            st.setString(10,fourthq.getText());
            st.setString(11,remark1.getText());
            st.execute();
            JOptionPane.showMessageDialog(null,"Succefully Added");
            jLabel7.setVisible(false);

        }catch (Exception e)
        {

        }
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
    String vb1 ="insert into infraction (categoryname, categorydesc, stid, stname, level, sec, firstq, secondq, thirdq, fourthq, remarks) values(?,?,?,?,?,?,?,?,?,?,?)";

        try
        {
            String cat1="Attire And Grooming";
            
            st=con.prepareStatement(vb1);
            st.setString(1,cat1);
            st.setString(2,attirecomb.getSelectedItem().toString());
            st.setString(3,search1.getText());
            st.setString(4,output1.getText()+" "+output2.getText());
            st.setString(5,output3.getText());
            st.setString(6,output4.getText());
            st.setString(7,firstq2.getText());
            st.setString(8,secondq2.getText());
            st.setString(9,thirdq2.getText());
            st.setString(10,fourthq2.getText());
            st.setString(11,remark2.getText());
            st.execute();
            JOptionPane.showMessageDialog(null,"Succefully Added");
            jLabel7.setVisible(false);

        }catch (Exception e)
        {

        }
    }//GEN-LAST:event_jLabel2MouseClicked
    private void keyy(){
        String xa="%"+search1.getText()+"%";
        String sql="select * from studentlist where stid like '"+xa+"' limit 1";
        
            try 
            {
            
                st=con.prepareStatement(sql);
                rs=st.executeQuery();
                while(rs.next())
                {
                    
                    output1.setText(rs.getString("fname"));
                    output2.setText(rs.getString("lname"));
                    output3.setText(rs.getString("sec"));
                    output4.setText(rs.getString("level"));
                }
                
            }
            catch(Exception e)
               {
                        
               }
    }
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
            java.util.logging.Logger.getLogger(AdvicerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdvicerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdvicerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdvicerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdvicerForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> attendancecomb;
    private javax.swing.JComboBox<String> attirecomb;
    private javax.swing.JTextField firstq;
    private javax.swing.JTextField firstq2;
    private javax.swing.JTextField fourthq;
    private javax.swing.JTextField fourthq2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField output1;
    private javax.swing.JTextField output2;
    private javax.swing.JTextField output3;
    private javax.swing.JTextField output4;
    private javax.swing.JTextArea remark1;
    private javax.swing.JTextArea remark2;
    private javax.swing.JTextField search1;
    private javax.swing.JTextField secondq;
    private javax.swing.JTextField secondq2;
    private javax.swing.JTextField thirdq;
    private javax.swing.JTextField thirdq2;
    // End of variables declaration//GEN-END:variables
}