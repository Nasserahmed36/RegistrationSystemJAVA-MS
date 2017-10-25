
package registrationsystem;

import java.sql.ResultSet;

public class Profile_S extends javax.swing.JFrame {

    public Profile_S() {
   initComponents();
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Lname = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Lbirth = new javax.swing.JLabel();
        jlable7 = new javax.swing.JLabel();
        Laddress = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Ldepartment = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        Lenrolled_year = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        Lhomepage = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel1.setText("Name :");

        Lname.setFont(new java.awt.Font("Tahoma", 1, 14));
        Lname.setForeground(new java.awt.Color(255, 51, 0));
        Lname.setText("jLabel2");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel5.setText("Date Of Birth :");

        Lbirth.setFont(new java.awt.Font("Tahoma", 1, 14));
        Lbirth.setForeground(new java.awt.Color(255, 51, 0));
        Lbirth.setText("jLabel6");

        jlable7.setFont(new java.awt.Font("Tahoma", 1, 18));
        jlable7.setText("Local Address :");

        Laddress.setFont(new java.awt.Font("Tahoma", 1, 14));
        Laddress.setForeground(new java.awt.Color(255, 51, 0));
        Laddress.setText("jLabel8");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel9.setText("Department :");

        Ldepartment.setFont(new java.awt.Font("Tahoma", 1, 14));
        Ldepartment.setForeground(new java.awt.Color(255, 51, 0));
        Ldepartment.setText("jLabel10");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel11.setText("Enrolled Year :");

        Lenrolled_year.setFont(new java.awt.Font("Tahoma", 1, 14));
        Lenrolled_year.setForeground(new java.awt.Color(255, 51, 0));
        Lenrolled_year.setText("jLabel12");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 36));
        jLabel15.setText("Profile Student");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 24));
        jButton1.setText("Edit Profile");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel12.setText("Homepage :");

        Lhomepage.setFont(new java.awt.Font("Tahoma", 1, 14));
        Lhomepage.setForeground(new java.awt.Color(255, 51, 0));
        Lhomepage.setText("jLabel12");

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 24));
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14));
        jButton3.setText("Sign Out");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 210, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel5)
                            .addComponent(jLabel12))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Lbirth)
                            .addComponent(Lname)
                            .addComponent(Lhomepage))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 200, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel9)
                            .addComponent(jlable7))
                        .addGap(34, 34, 34))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(442, 442, 442)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Ldepartment)
                            .addComponent(Lenrolled_year)
                            .addComponent(Laddress))
                        .addGap(90, 90, 90))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(Lbirth))
                        .addGap(97, 97, 97))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(Ldepartment))
                                .addGap(78, 78, 78)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jlable7)
                                    .addComponent(Laddress)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Lenrolled_year)
                                    .addComponent(jLabel11))
                                .addGap(52, 52, 52))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Lname)
                                    .addComponent(jLabel1))
                                .addGap(78, 78, 78)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel12)
                                    .addComponent(Lhomepage))))
                        .addGap(45, 45, 45)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

     Edit_Profile_S e=new Edit_Profile_S();
     e.setVisible(true);
     e.getIdStudent(id);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
     Welcome_Student w=new Welcome_Student();
     w.setVisible(true);
     w.setMessageText(Lname.getText(), id);
     this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       Login l=new Login();
     l.setVisible(true);
     this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    public void viewProfile_Student(String idd){

 try{

 DB.con=DB.connect("System");
 String query="Select `deptName`,`studentId`,`firstName`,`lastName`,`date_of_birth`,`address`,`yearEnrolled`,`homepage`  FROM `Student` inner JOIN `Department` ON `Student`.`deptId`=`Department`.`deptId` where studentId ="+idd+"";
 ResultSet rs=DB.executeQueryselect(query,DB.con);
 while(rs.next()){
Lname.setText(rs.getString("firstName")+" "+rs.getString("lastName"));

Lbirth.setText(rs.getString("date_of_birth"));
Laddress.setText(rs.getString("address"));
Ldepartment.setText(rs.getString("deptName"));
Lenrolled_year.setText(rs.getString("yearEnrolled"));
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
                new Profile_S().setVisible(true);
            }
        });
    }


String id;

    DB_Connection DB =new DB_Connection();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Laddress;
    private javax.swing.JLabel Lbirth;
    private javax.swing.JLabel Ldepartment;
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
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jlable7;
    // End of variables declaration//GEN-END:variables

}
