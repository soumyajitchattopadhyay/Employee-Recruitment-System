package employee;
import jaco.mp3.player.MP3Player;
import java.io.File;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import oracle.jdbc.OracleConnection;
import oracle.jdbc.OraclePreparedStatement;
import oracle.jdbc.OracleResultSet;
import oracle.jdbc.OracleStatement;

@SuppressWarnings("serial")
public class Login extends javax.swing.JFrame 
{
    
    public Login() {
        initComponents();
    }
    public static final String Son ="D:\\error-1-126514.mp3";
    public static final String SONG ="D:\\interface-124464.mp3";
    
    MP3Player mp = new MP3Player(new File(Son));
    MP3Player mp3player = new MP3Player(new File(SONG));
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jColorChooser1 = new javax.swing.JColorChooser();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        jColorChooser1.setBackground(new java.awt.Color(255, 0, 0));
        jColorChooser1.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setBackground(new java.awt.Color(255, 0, 0));
        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 3, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 255, 153));
        jLabel1.setText("Welcome!");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(700, 60, 210, 46);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 51));
        jLabel2.setText("Email");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(480, 202, 90, 30);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 51));
        jLabel3.setText("Password");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(480, 250, 90, 30);

        jPasswordField1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.lightGray, null, null));
        jPasswordField1.setCaretColor(new java.awt.Color(51, 0, 102));
        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jPasswordField1);
        jPasswordField1.setBounds(580, 250, 340, 30);

        jTextField1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.lightGray, null, null));
        jTextField1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextField1.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        getContentPane().add(jTextField1);
        jTextField1.setBounds(580, 200, 340, 29);

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setText("~We Love To Innovate New Era  !!");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(700, 140, 340, 17);

        jLabel5.setFont(new java.awt.Font("Viner Hand ITC", 3, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 51));
        jLabel5.setText("ICOVE pvt.Ltd");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(1030, 20, 270, 59);

        jButton1.setBackground(new java.awt.Color(255, 51, 0));
        jButton1.setText("Login");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(580, 310, 110, 40);

        jButton2.setBackground(new java.awt.Color(255, 51, 0));
        jButton2.setText("Sign up");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton2MouseEntered(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(810, 310, 110, 40);

        jPanel2.setBackground(new java.awt.Color(0,0,0,40));
        jPanel2.setForeground(new java.awt.Color(0, 102, 102));
        getContentPane().add(jPanel2);
        jPanel2.setBounds(460, 170, 530, 210);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/employee/174776bfe7965a060d6289594d3accc0.jpg"))); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(0, -610, 1920, 1800);
        getContentPane().add(jPanel1);
        jPanel1.setBounds(90, 210, 10, 10);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    @SuppressWarnings("deprecation")
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try
        {
            DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
            OracleConnection oconn =(OracleConnection)DriverManager.getConnection("jdbc:oracle:thin:@DESKTOP-COTHCMM:1522:orcl","SOUMYAJIT","CHATTOPADHYAY");
            OraclePreparedStatement pstmt =(OraclePreparedStatement)oconn.prepareStatement("SELECT COUNT(*) FROM signup WHERE email=? and password=?");
            OracleStatement ostmt = (OracleStatement)oconn.createStatement();
            String email,pass;
            email = jTextField1.getText();
            pass = jPasswordField1.getText();
            if (email.equals("")&&pass.equals("")){
                mp.play();
                JOptionPane.showMessageDialog(this,"Please input your login details!");
            }
            else if(!email.equals("")&&pass.equals("")){
                mp.play();
                JOptionPane.showMessageDialog(this,"Please input your password!");
            }
            else if(email.equals("")&&!pass.equals("")){
                mp.play();
                JOptionPane.showMessageDialog(this,"Please input your email!");
            }
            else{
            pstmt.setString(1,email);
            pstmt.setString(2,pass);
            OracleResultSet ors = (OracleResultSet)pstmt.executeQuery();
            
             if(ors.next())
                 if(ors.getString(1).equals("1")){
                     mp3player.play();
                     JOptionPane.showMessageDialog(this,"Login Successful!");
                      String sql = "insert into login values('"+email+"','"+pass+"')";
                       ostmt.executeUpdate(sql);
                     Profile ob = new Profile();
                     ob.show();
                 }
                 else{
                     mp.play();
                     JOptionPane.showMessageDialog(this,"Wrong credentials!");
                 }
            }
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(this,ex.toString());
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    @SuppressWarnings("deprecation")
    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
        mp3player.play();
        SignUp ob = new SignUp();
        ob.show();
    }//GEN-LAST:event_jButton2MouseClicked

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2MouseEntered

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
