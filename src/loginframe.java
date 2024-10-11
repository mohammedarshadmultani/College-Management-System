
import java.awt.Cursor;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import sun.security.util.Password;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author muzer
 */
public class loginframe extends javax.swing.JFrame {
   Connection conn= null;
ResultSet rs= null;
PreparedStatement pst =null;
    /**
     * Creates new form loginframe
     */
    public loginframe() {
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        usertf = new javax.swing.JTextField();
        passtf = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 630));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(51, 0, 255));
        jPanel2.setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/user1.png"))); // NOI18N
        jPanel2.add(jLabel1);
        jLabel1.setBounds(90, 130, 230, 220);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 470, 710);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("LOG IN");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(560, 10, 290, 70);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("PASSWORD");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(510, 240, 190, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("LOGIN ID");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(510, 130, 200, 30);

        usertf.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        usertf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        jPanel1.add(usertf);
        usertf.setBounds(510, 160, 420, 70);

        passtf.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        passtf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(passtf);
        passtf.setBounds(510, 270, 420, 70);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jButton1.setText("LOGIN");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(590, 360, 200, 80);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Forgot Password?");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel5);
        jLabel5.setBounds(600, 450, 170, 30);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton2.setText("SIGNUP");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(610, 500, 150, 60);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1050, 660);

        setSize(new java.awt.Dimension(991, 691));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

   //String user= usertf.getText();
  // String pwd= new String( passtf.getPassword());
   /*  
   if ( pwd.equals("aamir")) {
            JOptionPane.showMessageDialog(rootPane, "logged in successfully");
            scsithomeframe ip = new scsithomeframe();
            this.dispose();
            ip.setVisible(true);
        } else
            JOptionPane.showMessageDialog(rootPane, "invalid user id or password");
*/
        Connection conn= null;
ResultSet rs= null;
PreparedStatement pst =null;



    try {
       
            Class.forName("com.mysql.jdbc.Driver");
            
               conn=DriverManager.getConnection("jdbc:mysql://localhost/college","root","1234");

        String query = " select * from login where userid = ? and password = ?;";
        pst=conn.prepareStatement(query);
        pst.setString(1, usertf.getText());
        pst.setString(2,  passtf.getText());
        
        rs=pst.executeQuery();
        if(rs.next())
        {
             JOptionPane.showMessageDialog(null, "login successfully");
             scsithomeframe ip = new scsithomeframe();
            this.dispose();
            ip.setVisible(true);
             }
        else
        {
             JOptionPane.showMessageDialog(null, "login failed");
        }
        conn.close();
    } 
    
    
    
    catch (Exception e) {
        JOptionPane.showMessageDialog(null, e);
    }
    

       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
  forgotpassword fp = new forgotpassword();
  
 this.dispose();
 fp.setVisible(true);
 
// TODO add your handling code here:
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

signupframe sf = new signupframe();
this.dispose();
sf.setVisible(true);

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
            java.util.logging.Logger.getLogger(loginframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loginframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loginframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loginframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
            Splash sp = new Splash();
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               //new loginframe().setVisible(true);
                 
                 sp.setVisible(true);
                 
       
                          }
        });
        
        sp.bar.setStringPainted(true);
        
         try {
            for(int i =0; i<=100; i++)
            {
                Thread.sleep(45);
                sp.bar.setValue(i);
                sp.progress.setText(Integer.toString((i))+"%");
                sp.bar.setValue(i);
            }
            
            sp.dispose();
            
        } catch (Exception e) {
             System.out.println(e);
                
        }
        
         sp.dispose();
        loginframe lf = new loginframe();
        lf.setVisible(true);
        
        
         
        
    }

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField passtf;
    private javax.swing.JTextField usertf;
    // End of variables declaration//GEN-END:variables
}
