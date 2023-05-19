import java.sql.*;
import java.sql.DriverManager;
import javax.swing.JFrame;
import javax.swing.*;
import net.proteanit.sql.DbUtils;

public class StudentList extends javax.swing.JFrame {
    Connection con;
    ResultSet rs;
    PreparedStatement st;

    public StudentList() {
        initComponents();
        setTitle("Students List");
        setLocationRelativeTo(this);
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
        UpdTable();
    }
        
    private void UpdTable()
    {
        String vb4="select stid as Student_ID, fname as First_Name, lname as Last_Name, sec as Section, level as Level, yearlevel  from studentlist";
        try
        {
            st=con.prepareStatement(vb4);
            rs=st.executeQuery();
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
        }catch(Exception e)
        {
            
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<String>();
        searchb = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 502, -1, -1));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "STUDENT ID", "SURNAME" }));
        jPanel2.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, 140, 40));
        jPanel2.add(searchb, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 130, 270, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SEARCH_1.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 130, 110, 40));

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
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 830, 320));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIEW STUDENT FORM.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 570));
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 20, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 690));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        UpdTable();
    }//GEN-LAST:event_formWindowOpened

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
       if (jComboBox1.getSelectedItem().toString().equals("STUDENT ID") ){
            String vb4="select stid as Student_ID, fname as First_Name, lname as Last_Name, sec as Section, level as Level, yearlevel  from studentlist where stid = ?";
                try
                    {
                        st=con.prepareStatement(vb4);
                        st.setString(1,searchb.getText());
                        rs=st.executeQuery();
                        jTable1.setModel(DbUtils.resultSetToTableModel(rs));
                    }catch(Exception e)
                    {

                    }
       }
       else if (jComboBox1.getSelectedItem().toString().equals("SURNAME") ){
            String vb4="select stid as Student_ID, fname as First_Name, lname as Last_Name, sec as Section, level as Level, yearlevel  from studentlist where lname = ?";
                try
                    {
                        st=con.prepareStatement(vb4);
                        st.setString(1,searchb.getText());
                        rs=st.executeQuery();
                        jTable1.setModel(DbUtils.resultSetToTableModel(rs));
                    }catch(Exception e)
                    {

                    }
        
        }
       
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int row=jTable1.getSelectedRow();
        
      //String ida=jTable1.getModel().getValueAt(row,0).toString();
            ////String fname1=jTable1.getModel().getValueAt(row,1).toString()+" "+jTable1.getModel().getValueAt(row,2).toString();
            //String seca=jTable1.getModel().getValueAt(row,3).toString();
            //String sleva=jTable1.getModel().getValueAt(row,4).toString();
            Sanction abv=new Sanction();
            Sanction.sid2.setText(jTable1.getModel().getValueAt(row,0).toString());
             Sanction.cnamea.setText(jTable1.getModel().getValueAt(row,1).toString()+" "+jTable1.getModel().getValueAt(row,2).toString());
              Sanction.sec2.setText(jTable1.getModel().getValueAt(row,3).toString());
              Sanction.lev1.setText(jTable1.getModel().getValueAt(row,4).toString());
     // new Sanction(ida, fname1, seca, sleva).setVisible(true);
              Sanction.yearl.setText(jTable1.getModel().getValueAt(row,5).toString());
     // new Sanction(ida, fname1, seca, sleva).setVisible(true);
            abv.setVisible(true);
      this.setVisible(false);
      
        //stid.setText(jTable1.getModel().getValueAt(row,0).toString());                    
    }//GEN-LAST:event_jTable1MouseClicked

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(StudentList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentList().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField searchb;
    // End of variables declaration//GEN-END:variables
}

