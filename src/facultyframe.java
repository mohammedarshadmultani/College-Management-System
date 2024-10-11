
import java.awt.Color;
import java.awt.color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author muzer
 */
public class facultyframe extends javax.swing.JFrame {

    
    Color panedefault;
    Color paneClick;
    
    
    public facultyframe() {
        initComponents();
        
        panedefault = new Color(51, 0, 102);
        paneClick = new Color(255, 255, 255);
        panel1.setBackground(panedefault);
        panel2.setBackground(panedefault);
         panel3.setBackground(panedefault);
         
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        panel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        panel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        panel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        backlabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        dekstop1 = new javax.swing.JDesktopPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        table1 = new javax.swing.JTable();
        clabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 0, 255));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(51, 0, 102));
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel2MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });
        jPanel2.setLayout(null);

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        jPanel2.add(panel2);
        panel2.setBounds(0, 0, 30, 70);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("MANAGEMENT FACULTY");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel2MousePressed(evt);
            }
        });
        jPanel2.add(jLabel2);
        jLabel2.setBounds(40, 20, 215, 30);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(20, 270, 300, 70);

        jPanel3.setBackground(new java.awt.Color(51, 0, 102));
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel3MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel3MousePressed(evt);
            }
        });
        jPanel3.setLayout(null);

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        jPanel3.add(panel1);
        panel1.setBounds(0, 0, 30, 70);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("COMPUTER FACULTY");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel1MousePressed(evt);
            }
        });
        jPanel3.add(jLabel1);
        jLabel1.setBounds(40, 20, 190, 30);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(20, 180, 300, 70);

        jPanel5.setBackground(new java.awt.Color(51, 0, 102));
        jPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel5MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel5MousePressed(evt);
            }
        });
        jPanel5.setLayout(null);

        javax.swing.GroupLayout panel3Layout = new javax.swing.GroupLayout(panel3);
        panel3.setLayout(panel3Layout);
        panel3Layout.setHorizontalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        panel3Layout.setVerticalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        jPanel5.add(panel3);
        panel3.setBounds(0, 0, 30, 70);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Manage Faculty");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel5.add(jLabel5);
        jLabel5.setBounds(50, 20, 190, 30);

        jPanel1.add(jPanel5);
        jPanel5.setBounds(20, 360, 300, 70);

        jPanel8.setBackground(new java.awt.Color(51, 0, 102));
        jPanel8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel8MouseClicked(evt);
            }
        });
        jPanel8.setLayout(null);

        backlabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        backlabel1.setForeground(new java.awt.Color(255, 255, 255));
        backlabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        backlabel1.setText("BACK");
        backlabel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                backlabel1MouseMoved(evt);
            }
        });
        backlabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backlabel1MouseClicked(evt);
            }
        });
        jPanel8.add(backlabel1);
        backlabel1.setBounds(50, 10, 100, 40);

        jPanel1.add(jPanel8);
        jPanel8.setBounds(20, 460, 300, 60);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 320, 660);

        jPanel4.setBackground(new java.awt.Color(0, 0, 255));
        jPanel4.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("FACULTY  STAFF");
        jPanel4.add(jLabel4);
        jLabel4.setBounds(280, 20, 420, 100);

        getContentPane().add(jPanel4);
        jPanel4.setBounds(300, 0, 1070, 130);

        dekstop1.setBackground(new java.awt.Color(204, 255, 255));

        table1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "faculty id", "name", "qualification", "designation", "responsibility"
            }
        ));
        table1.setRowHeight(30);
        table1.setShowVerticalLines(false);
        jScrollPane1.setViewportView(table1);

        dekstop1.add(jScrollPane1);
        jScrollPane1.setBounds(0, 140, 1050, 390);

        clabel.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        clabel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        dekstop1.add(clabel);
        clabel.setBounds(10, 30, 570, 80);

        getContentPane().add(dekstop1);
        dekstop1.setBounds(320, 130, 1050, 530);

        setSize(new java.awt.Dimension(1391, 709));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MousePressed
    panel1.setBackground(paneClick);
        panel2.setBackground(panedefault);
         panel3.setBackground(panedefault);

        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel3MousePressed

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
    panel2.setBackground(paneClick);
        panel1.setBackground(panedefault);  
         panel3.setBackground(panedefault);// TODO add your handling code here:
    }//GEN-LAST:event_jPanel2MousePressed

    private void jPanel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseClicked
  
    clabel.setText("Computer Faculty");
     
        
        table1.setModel(new DefaultTableModel (null, new String[] {"faculty_id","name","qualification","designation","responsibility"}));
     //   table3.setModel(new DefaultTableModel (null, new String[] {"faculty_id","name","qualification","designation","responsibility"}));
        DefaultTableModel m1=(DefaultTableModel)table1.getModel();
try{
       Class.forName("java.sql.Driver");
       Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/college","root","1234");
       Statement s1=conn.createStatement();

       String q1="select*from c_faculty";
       ResultSet rs=s1.executeQuery(q1);
       while(rs.next()){
       String faculty_id= rs.getString("Faculty_id");
       String name= rs.getString("Name");
       String qualification= rs.getString("qualification");
       String designation= rs.getString("Designation");
       String responsibility=rs.getString("Responsibility");
       m1.addRow(new Object[]{faculty_id,name,qualification,designation,responsibility});

       }
       rs.close();
       s1.close();
       conn.close();
}
catch(Exception e){
           JOptionPane.showMessageDialog(null, e);
       }


        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel3MouseClicked

    private void jPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseClicked
  
      
        clabel.setText("Management Faculty");
  
       // table3.setModel(new DefaultTableModel (null, new String[] {"faculty_id","name","qualification","designation","responsibility"}));
        table1.setModel(new DefaultTableModel (null, new String[] {"faculty_id","name","qualification","designation","responsibility"}));
        DefaultTableModel m1=(DefaultTableModel)table1.getModel();
try{
       Class.forName("java.sql.Driver");
       Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/college","root","1234");
       Statement s1=conn.createStatement();

       String q1="select*from m_faculty";
       ResultSet rs=s1.executeQuery(q1);
       while(rs.next()){
       String faculty_id= rs.getString("Faculty_id");
       String name= rs.getString("Name");
       String qualification= rs.getString("qualification");
       String designation= rs.getString("Designation");
       String responsibility=rs.getString("Responsibility");
       m1.addRow(new Object[]{faculty_id,name,qualification,designation,responsibility});

       }
       rs.close();
       s1.close();
       conn.close();
}
catch(Exception e){
           JOptionPane.showMessageDialog(null, e);
       }

        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel2MouseClicked

    private void jPanel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseClicked
    String password = JOptionPane.showInputDialog("Enter the Password: ");
   if(password.equals("admin")){
        
        addfaculty af = new addfaculty();
this.dispose();
af.setVisible(true);
   }
    else{
    JOptionPane.showMessageDialog(rootPane, " Error, Please try again.");
   }
   
   
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel5MouseClicked

    private void jPanel5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MousePressed
      panel3.setBackground(paneClick);
      panel1.setBackground(panedefault);  
         panel2.setBackground(panedefault);
      
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel5MousePressed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked

    clabel.setText("Computer Faculty");
     
        
        table1.setModel(new DefaultTableModel (null, new String[] {"faculty_id","name","qualification","designation","responsibility"}));
     //   table3.setModel(new DefaultTableModel (null, new String[] {"faculty_id","name","qualification","designation","responsibility"}));
        DefaultTableModel m1=(DefaultTableModel)table1.getModel();
try{
       Class.forName("java.sql.Driver");
       Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/college","root","1234");
       Statement s1=conn.createStatement();

       String q1="select*from c_faculty";
       ResultSet rs=s1.executeQuery(q1);
       while(rs.next()){
       String faculty_id= rs.getString("Faculty_id");
       String name= rs.getString("Name");
       String qualification= rs.getString("qualification");
       String designation= rs.getString("Designation");
       String responsibility=rs.getString("Responsibility");
       m1.addRow(new Object[]{faculty_id,name,qualification,designation,responsibility});

       }
       rs.close();
       s1.close();
       conn.close();
}
catch(Exception e){
           JOptionPane.showMessageDialog(null, e);
       }



        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
 
      
        clabel.setText("Management Faculty");
  
       // table3.setModel(new DefaultTableModel (null, new String[] {"faculty_id","name","qualification","designation","responsibility"}));
        table1.setModel(new DefaultTableModel (null, new String[] {"faculty_id","name","qualification","designation","responsibility"}));
        DefaultTableModel m1=(DefaultTableModel)table1.getModel();
try{
       Class.forName("java.sql.Driver");
       Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/college","root","1234");
       Statement s1=conn.createStatement();

       String q1="select*from m_faculty";
       ResultSet rs=s1.executeQuery(q1);
       while(rs.next()){
       String faculty_id= rs.getString("Faculty_id");
       String name= rs.getString("Name");
       String qualification= rs.getString("qualification");
       String designation= rs.getString("Designation");
       String responsibility=rs.getString("Responsibility");
       m1.addRow(new Object[]{faculty_id,name,qualification,designation,responsibility});

       }
       rs.close();
       s1.close();
       conn.close();
}
catch(Exception e){
           JOptionPane.showMessageDialog(null, e);
       }
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel2MouseClicked

    private void backlabel1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backlabel1MouseMoved
     //   backlabel1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        // TODO add your handling code here:
    }//GEN-LAST:event_backlabel1MouseMoved

    private void backlabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backlabel1MouseClicked
        scsithomeframe ip = new scsithomeframe();
        this.dispose();
        ip.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_backlabel1MouseClicked

    private void jPanel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel8MouseClicked

academicsframe af = new academicsframe();
this.dispose();
af.setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel8MouseClicked

    private void jLabel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MousePressed
   panel1.setBackground(paneClick);
        panel2.setBackground(panedefault);
         panel3.setBackground(panedefault);

        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel1MousePressed

    private void jLabel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MousePressed
   panel2.setBackground(paneClick);
        panel1.setBackground(panedefault);  
         panel3.setBackground(panedefault);// TODO add your handling code here:
          // TODO add your handling code here:
    }//GEN-LAST:event_jLabel2MousePressed

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
    String password = JOptionPane.showInputDialog("Enter the Password: ");
   if(password.equals("admin")){
        
        addfaculty af = new addfaculty();
this.dispose();
af.setVisible(true);
   }
    else{
    JOptionPane.showMessageDialog(rootPane, " Error, Please try again.");
   }
           // TODO add your handling code here:
    }//GEN-LAST:event_jLabel5MouseClicked

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
            java.util.logging.Logger.getLogger(facultyframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(facultyframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(facultyframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(facultyframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new facultyframe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backlabel1;
    private javax.swing.JLabel clabel;
    private javax.swing.JDesktopPane dekstop1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panel1;
    private javax.swing.JPanel panel2;
    private javax.swing.JPanel panel3;
    private javax.swing.JTable table1;
    // End of variables declaration//GEN-END:variables

   private ImageIcon Format = null;

}
