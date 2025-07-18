package employee;
import jaco.mp3.player.MP3Player;
import java.io.File;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import oracle.jdbc.OracleConnection;
import oracle.jdbc.OracleStatement;
@SuppressWarnings("serial")
public class JobProfile extends javax.swing.JFrame 
{
    public JobProfile() 
    {
        initComponents();
    }
    public static final String Son ="D:\\error-1-126514.mp3";
    public static final String SONG ="D:\\interface-124464.mp3";
    MP3Player mp3player = new MP3Player(new File(SONG));
    MP3Player mp = new MP3Player(new File(Son));
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jDialog1 = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel12 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Sitka Text", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 255, 153));
        jLabel1.setText("JOB PROFILE");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(410, 0, 191, 64);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(221, 376, 132, 15);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 255, 153));
        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\dell\\Desktop\\blur.jpg")); // NOI18N
        jLabel3.setText("ID:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 76, 144, 26);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 255, 153));
        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\dell\\Desktop\\blur.jpg")); // NOI18N
        jLabel4.setText("PROFILE:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 120, 144, 41);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 255, 153));
        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\dell\\Desktop\\blur.jpg")); // NOI18N
        jLabel5.setText("COMPANY:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(477, 70, 147, 39);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 255, 153));
        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\dell\\Desktop\\blur.jpg")); // NOI18N
        jLabel6.setText("PLACE:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(477, 121, 147, 29);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(160, 77, 182, 26);

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2);
        jTextField2.setBounds(160, 130, 182, 31);

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField3);
        jTextField3.setBounds(628, 71, 220, 38);

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField4);
        jTextField4.setBounds(629, 116, 220, 39);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 255, 153));
        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\dell\\Desktop\\blur.jpg")); // NOI18N
        jLabel7.setText("EXPERIENCE:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(480, 270, 148, 16);

        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField5);
        jTextField5.setBounds(629, 162, 220, 42);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 255, 153));
        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\dell\\Desktop\\blur.jpg")); // NOI18N
        jLabel8.setText("SALARY:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(477, 174, 148, 16);

        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField6);
        jTextField6.setBounds(630, 260, 220, 34);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 255, 153));
        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\dell\\Desktop\\blur.jpg")); // NOI18N
        jLabel9.setText("P_PIN");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(10, 200, 148, 36);

        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField7);
        jTextField7.setBounds(160, 190, 182, 44);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 255, 153));
        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\dell\\Desktop\\blur.jpg")); // NOI18N
        jLabel10.setText("DATE OF LEAVE:");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(477, 210, 148, 38);

        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField8);
        jTextField8.setBounds(629, 210, 220, 38);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 255, 153));
        jLabel11.setIcon(new javax.swing.ImageIcon("C:\\Users\\dell\\Desktop\\blur.jpg")); // NOI18N
        jLabel11.setText("DESCRIPTION:");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(10, 298, 148, 48);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(162, 274, 250, 96);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 255, 153));
        jLabel12.setIcon(new javax.swing.ImageIcon("C:\\Users\\dell\\Desktop\\blur.jpg")); // NOI18N
        jLabel12.setText("INDUSTRY:");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(10, 397, 147, 41);

        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField9);
        jTextField9.setBounds(161, 397, 186, 50);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 255, 153));
        jLabel13.setIcon(new javax.swing.ImageIcon("C:\\Users\\dell\\Desktop\\blur.jpg")); // NOI18N
        jLabel13.setText("EMAIL:");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(10, 474, 126, 50);

        jTextField10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField10ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField10);
        jTextField10.setBounds(160, 480, 190, 47);

        jButton1.setText("SUBMIT:");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(580, 480, 128, 50);

        jLabel14.setForeground(new java.awt.Color(255, 0, 0));
        jLabel14.setText("THIS FIELD IS ONLY FOR WHO HAD BEEN IN ANY OTHER COMPANY PREVIOUSLY (LEAVE BLANK IF NOT !)");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(480, 310, 680, 13);

        jPanel2.setBackground(new java.awt.Color(0,0,0,160));
        jPanel2.setForeground(new java.awt.Color(0, 102, 102));
        getContentPane().add(jPanel2);
        jPanel2.setBounds(460, 60, 660, 280);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 255, 153));
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/employee/joanna-kosinska-7ACuHoezUYk-unsplash.jpg"))); // NOI18N
        getContentPane().add(jLabel16);
        jLabel16.setBounds(0, -20, 6016, 1510);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9ActionPerformed

    private void jTextField10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField10ActionPerformed

    @SuppressWarnings("deprecation")
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try
        {
            DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
            OracleConnection oconn =(OracleConnection)DriverManager.getConnection("jdbc:oracle:thin:@DESKTOP-COTHCMM:1522:orcl","SOUMYAJIT","CHATTOPADHYAY");
            OracleStatement ostmt = (OracleStatement)oconn.createStatement();
            String id,profile,company ,place ,experience ,salary ,p_pin,doa,description,industry ,email;
            id= jTextField1.getText();
            profile=jTextField2.getText();
            company=jTextField3.getText();
            place=jTextField4.getText();
            experience=jTextField6.getText();
            salary=jTextField5.getText();
            p_pin=jTextField7.getText();
            doa=jTextField8.getText();
            description=jTextArea1.getText();
            industry=jTextField9.getText();
            email=jTextField10.getText();
            if ("".equals(id)||"".equals(profile)||"".equals(p_pin)||"".equals(description)||"".equals(industry)||"".equals(email))
            {
                mp.play();
                JOptionPane.showMessageDialog(this,"Please fill all the fields!");
            }
            else{
            
                   String sql = "insert into job_profile values('"+id+"','"+profile+"','"+company+"','"+place+"','"+experience+"','"+salary+"','"+p_pin+"','"+doa+"','"+description+"','"+industry+"','"+email+"')";
            ostmt.executeUpdate(sql);
            mp3player.play();
            JOptionPane.showMessageDialog(this,"Registered Successfully!"); 
            JOptionPane.showMessageDialog(this,"Going back to home page...");
            Homepage obj = new Homepage();
            obj.show();
            }
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(this,ex.toString());
        }
    }//GEN-LAST:event_jButton1ActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JobProfile().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}