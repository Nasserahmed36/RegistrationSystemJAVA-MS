
package registrationsystem;

import java.sql.*;

public class Profile_I extends javax.swing.JFrame {
String id;
String name;
    public Profile_I() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel12 = new javax.swing.JLabel();
        Lhomepage = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        Lname = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jlable7 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        Laddress = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        Lenrolled_year = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel12.setText("Homepage :");

        Lhomepage.setFont(new java.awt.Font("Tahoma", 1, 14));
        Lhomepage.setForeground(new java.awt.Color(255, 51, 0));
        Lhomepage.setText("jLabel12");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel1.setText("Name :");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 36));
        jLabel15.setText("Profile Instructor");

        Lname.setFont(new java.awt.Font("Tahoma", 1, 14));
        Lname.setForeground(new java.awt.Color(255, 51, 0));
        Lname.setText("jLabel2");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 24));
        jButton1.setText("Edit Profile");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jlable7.setFont(new java.awt.Font("Tahoma", 1, 18));
        jlable7.setText("Local Address :");

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 24));
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        Laddress.setFont(new java.awt.Font("Tahoma", 1, 14));
        Laddress.setForeground(new java.awt.Color(255, 51, 0));
        Laddress.setText("jLabel8");

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14));
        jButton3.setText("Sign Out");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        Lenrolled_year.setFont(new java.awt.Font("Tahoma", 1, 14));
        Lenrolled_year.setForeground(new java.awt.Color(255, 51, 0));
        Lenrolled_year.setText("jLabel2");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel11.setText("Enrolled Year :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(330, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(30, 30, 30)
                                .addComponent(Lname))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(18, 18, 18)
                                .addComponent(Lhomepage))))
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11)
                            .addComponent(jlable7))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Lenrolled_year)
                            .addComponent(Laddress))
                        .addGap(138, 138, 138))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Lname)
                                    .addComponent(jLabel1))
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel12)
                                    .addComponent(Lhomepage)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jlable7)
                                .addComponent(Laddress))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Lenrolled_year)
                                    .addComponent(jLabel11))
                                .addGap(52, 52, 52)))
                        .addGap(75, 75, 75)
                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        Edit_Profile_P e=new Edit_Profile_P();
        e.getIdInstructor(id);
        e.setVisible(true);
        e.getIdInstructor(id);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Welcome_Instructor i=new Welcome_Instructor();
        i.setVisible(true);
        i.setMessageText(Lname.getText(), id);
        this.setVisible(false);
}//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Login l=new Login();
        l.setVisible(true);
        this.setVisible(false);
}//GEN-LAST:event_jButton3ActionPerformed

    
    
    public void viewProfile_Instructor(String idd){
    DB_Connection DB =new DB_Connection();
 try{

 DB.con=DB.connect("System");
 String query="Select `firstName`,`lastName`,`address`,`yeraEnrolled`,`homepage`  FROM `Instructor` where `instId`="+idd+"";
 ResultSet rs=DB.executeQueryselect(query,DB.con);
 while(rs.next()){
Lname.setText(rs.getString("firstName")+" "+rs.getString("lastName"));
Laddress.setText(rs.getString("address"));
Lenrolled_year.setText(rs.getString("yeraEnrolled"));
Lhomepage.setText(rs.getString("homepage"));
id=idd;
    }
 DB.disconnect(DB.con);
    }
 catch(Exception e){
     System.out.println("cannt execute the query  setProfile_Student  "+e.getMessage());
 }
}
   
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Profile_I().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Laddress;
    private javax.swing.JLabel Lenrolled_year;
    private javax.swing.JLabel Lhomepage;
    private javax.swing.JLabel Lname;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jlable7;
    // End of variables declaration//GEN-END:variables

}
