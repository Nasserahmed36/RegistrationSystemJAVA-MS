
package registrationsystem;


public class Welcome_Instructor extends javax.swing.JFrame {


    public Welcome_Instructor() {
        initComponents();

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        welcomeMsgname = new javax.swing.JLabel();
        welcomeMsgid = new javax.swing.JLabel();
        label3 = new javax.swing.JLabel();
        Jprofile = new javax.swing.JButton();
        JviewCourse = new javax.swing.JButton();
        Lsign_out = new javax.swing.JButton();
        JaddCourseButton = new javax.swing.JButton();
        roomInfoButton = new javax.swing.JButton();
        myStudentsButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        welcomeMsgname.setFont(new java.awt.Font("Tahoma", 1, 18));
        welcomeMsgname.setText("Hello");

        welcomeMsgid.setFont(new java.awt.Font("Tahoma", 1, 18));
        welcomeMsgid.setForeground(new java.awt.Color(255, 0, 0));
        welcomeMsgid.setText("jLabel2");

        label3.setFont(new java.awt.Font("Tahoma", 1, 18));
        label3.setText("ID:");

        Jprofile.setFont(new java.awt.Font("Tahoma", 1, 14));
        Jprofile.setText("The profile ");
        Jprofile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JprofileActionPerformed(evt);
            }
        });

        JviewCourse.setFont(new java.awt.Font("Tahoma", 1, 14));
        JviewCourse.setText("View Course");
        JviewCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JviewCourseActionPerformed(evt);
            }
        });

        Lsign_out.setFont(new java.awt.Font("Tahoma", 1, 14));
        Lsign_out.setText("Sign Out");
        Lsign_out.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Lsign_outActionPerformed(evt);
            }
        });

        JaddCourseButton.setFont(new java.awt.Font("Tahoma", 1, 14));
        JaddCourseButton.setText("Add Course");
        JaddCourseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JaddCourseButtonActionPerformed(evt);
            }
        });

        roomInfoButton.setFont(new java.awt.Font("Tahoma", 1, 14));
        roomInfoButton.setText("Class Room Info");
        roomInfoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roomInfoButtonActionPerformed(evt);
            }
        });

        myStudentsButton.setFont(new java.awt.Font("Tahoma", 1, 14));
        myStudentsButton.setText("My Students");
        myStudentsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myStudentsButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(label3, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(welcomeMsgid)
                            .addGap(440, 440, 440))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(Jprofile, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(32, 32, 32)
                            .addComponent(JaddCourseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(roomInfoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(JviewCourse, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(welcomeMsgname, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(myStudentsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addContainerGap(166, Short.MAX_VALUE)))
                    .addComponent(Lsign_out, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(JaddCourseButton, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                        .addComponent(roomInfoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(JviewCourse, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE))
                    .addComponent(Jprofile, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(myStudentsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(welcomeMsgname, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(welcomeMsgid))
                .addGap(54, 54, 54)
                .addComponent(Lsign_out, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void JprofileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JprofileActionPerformed
        Login l =new Login();
        Profile_I p=new Profile_I();
        p.setVisible(true);
        p.viewProfile_Instructor(id);
        this.setVisible(false);
}//GEN-LAST:event_JprofileActionPerformed

    private void JviewCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JviewCourseActionPerformed
        View_Course_I v=new View_Course_I(id, name);
        v.setVisible(true);
}//GEN-LAST:event_JviewCourseActionPerformed

    private void Lsign_outActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Lsign_outActionPerformed
        Login l=new Login();
        l.setVisible(true);
        this.setVisible(false);
}//GEN-LAST:event_Lsign_outActionPerformed

    private void JaddCourseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JaddCourseButtonActionPerformed
        
        AddCourse addCourse = new AddCourse();
        addCourse.setVisible(true);
        addCourse.getidinstructor(id);
}//GEN-LAST:event_JaddCourseButtonActionPerformed

    private void roomInfoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roomInfoButtonActionPerformed
        new ClassRoomInfo(id)
                .setVisible(true);
    }//GEN-LAST:event_roomInfoButtonActionPerformed

    private void myStudentsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myStudentsButtonActionPerformed
        new MyStudents(id).setVisible(true);
                
    }//GEN-LAST:event_myStudentsButtonActionPerformed

 public void setMessageText(String nam,String ids)
    {
         welcomeMsgname.setText("Welcome "+nam+" In your University");
         welcomeMsgid.setText(ids);
         id=ids;
         name=nam;
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Welcome_Instructor().setVisible(true);
            }
        });
    }
  String id;
     String name;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JaddCourseButton;
    private javax.swing.JButton Jprofile;
    private javax.swing.JButton JviewCourse;
    private javax.swing.JButton Lsign_out;
    private javax.swing.JLabel label3;
    private javax.swing.JButton myStudentsButton;
    private javax.swing.JButton roomInfoButton;
    private javax.swing.JLabel welcomeMsgid;
    private javax.swing.JLabel welcomeMsgname;
    // End of variables declaration//GEN-END:variables

}
