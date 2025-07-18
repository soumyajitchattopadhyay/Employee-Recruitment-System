package employee;

import jaco.mp3.player.MP3Player;
import java.io.File;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import oracle.jdbc.OracleConnection;
import oracle.jdbc.OracleStatement;
@SuppressWarnings("serial")
public class SignUp extends javax.swing.JFrame{
    public SignUp() {
        initComponents();
    }
    public static final String SONG ="D:\\interface-124464.mp3";
    public static final String Son ="D:\\error-1-126514.mp3";
    public static final String So="D:\\1669121560481qrermxl-voicemaker.in-speech.mp3";
    MP3Player mp3player = new MP3Player(new File(SONG));
    MP3Player m = new MP3Player(new File(So));
    MP3Player mp = new MP3Player(new File(Son));
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jPasswordField2 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("MV Boli", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Sign up");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(450, 120, 87, 34);

        jLabel2.setBackground(new java.awt.Color(255, 0, 0));
        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 255, 153));
        jLabel2.setText("Welcome!");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(460, 80, 140, 46);

        jLabel5.setFont(new java.awt.Font("Viner Hand ITC", 3, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setText("ICOVE pvt.Ltd");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(920, 40, 270, 39);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 0, 102));
        jLabel3.setText("Looks like you don't have an account.");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(450, 150, 240, 15);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 0, 102));
        jLabel4.setText("Let's create a new account !!");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(450, 170, 220, 15);

        jLabel6.setFont(new java.awt.Font("Rockwell", 3, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 255));
        jLabel6.setText("Name");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(510, 230, 70, 30);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(600, 230, 260, 30);

        jLabel7.setFont(new java.awt.Font("Rockwell", 3, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 255));
        jLabel7.setText("Email");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(510, 271, 60, 30);
        getContentPane().add(jTextField2);
        jTextField2.setBounds(600, 270, 260, 30);

        jLabel8.setFont(new java.awt.Font("Rockwell", 3, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 255));
        jLabel8.setText("Password");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(490, 311, 90, 30);

        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jPasswordField1);
        jPasswordField1.setBounds(600, 310, 260, 30);

        jPasswordField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jPasswordField2);
        jPasswordField2.setBounds(600, 350, 260, 30);

        jButton1.setForeground(new java.awt.Color(255, 51, 0));
        jButton1.setText("Agree and continue");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(530, 460, 140, 30);
        getContentPane().add(jLabel10);
        jLabel10.setBounds(52, 379, 40, 0);

        jLabel11.setForeground(new java.awt.Color(0, 0, 255));
        jLabel11.setText("By selecting Agree and continue below,");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(530, 410, 216, 13);

        jLabel12.setForeground(new java.awt.Color(0, 0, 204));
        jLabel12.setText("I agree to Terms of Services and Privacy Policy !!");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(530, 430, 290, 13);

        jLabel9.setFont(new java.awt.Font("Rockwell", 3, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 255));
        jLabel9.setText("Confirm Password");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(410, 350, 180, 22);

        jPanel2.setBackground(new java.awt.Color(0,0,0,120));
        jPanel2.setForeground(new java.awt.Color(0, 102, 102));
        getContentPane().add(jPanel2);
        jPanel2.setBounds(310, 210, 620, 330);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/employee/joanna-kosinska-7ACuHoezUYk-unsplash.jpg"))); // NOI18N
        getContentPane().add(jLabel13);
        jLabel13.setBounds(0, -20, 1590, 1510);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    @SuppressWarnings("deprecation")
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
         try
        {
            // 1. REGISTRATION OF JAVA PROGRAM WITH ORACLE
            DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
            OracleConnection oconn =(OracleConnection)DriverManager.getConnection("jdbc:oracle:thin:@DESKTOP-COTHCMM:1522:orcl","SOUMYAJIT","CHATTOPADHYAY");
            
            // 2. CREATING THE CONNECTION OBJECT
            
            // 3. CREATING THE STATEMENT OBJECT
            OracleStatement ostmt = (OracleStatement)oconn.createStatement();
            
            //4. DECLARING THE VARIABLES
            String name,email,pass1,pass2;
                    name=jTextField1.getText();
                    email=jTextField2.getText();
                    pass1=jPasswordField1.getText();
                    pass2=jPasswordField2.getText();
                    if (name.equals("")&&email.equals("")&&pass1.equals("")&&pass2.equals(""))
                    {
                        mp.play();
                        JOptionPane.showMessageDialog(this,"Please input your data!");
                    }
                    else if(!name.equals("")&&email.equals(""))
                    {
                        mp.play();
                        JOptionPane.showMessageDialog(this,"Please input your email!");
                    }
                    else if (!name.equals("")&&!email.equals("")&&pass1.equals("")&&pass2.equals(""))
                    {
                        mp.play();
                        JOptionPane.showMessageDialog(this,"Password cannot be empty!");
                    }
                    else if (name.equals("")&&!email.equals("")||email.equals("")&&!pass1.equals("")&&!pass2.equals("")||pass1.equals("")&&pass2.equals(""))
                        {
                        mp.play();
                        JOptionPane.showMessageDialog(this,"Please enter your name!");
                    }
                    else{
                    if(pass1.equals(pass2))
                    {
                        
                        
                       String sql = "insert into signup values('"+name+"','"+email+"','"+pass1+"','"+pass2+"')";
                       ostmt.executeUpdate(sql);
                       m.play();
                       JOptionPane.showMessageDialog(this,"Account has successfully been created"); 
                       mp3player.play();
                       JobProfile ob = new JobProfile();
                       ob.show();}
                    else{
                        mp.play();
                        JOptionPane.showMessageDialog(this,"Passwords do not match!");
                    }
                }
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(this,ex.toString());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void jPasswordField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField2ActionPerformed

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
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}