package registrationsystem;

public class Welcome_Student extends javax.swing.JFrame {

    /** Creates new form Welcome */
    public Welcome_Student() {
        initComponents();
    
    }
   

    @SuppressWarnings("unchecked")


public void setMessageText(String nam,String ids)
    {

        welcomeMsgname.setText("Welcome "+nam+" In your University");
        welcomeMsgid.setText(ids);
        id=ids;
        name = nam;

    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        welcomeMsgname = new javax.swing.JLabel();
        Jprofile = new javax.swing.JButton();
        label3 = new javax.swing.JLabel();
        welcomeMsgid = new javax.swing.JLabel();
        JregistreCourseButton = new javax.swing.JButton();
        Lsign_out = new javax.swing.JButton();
        JviewCourse = new javax.swing.JButton();
        JsearchCourse = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        welcomeMsgname.setFont(new java.awt.Font("Tahoma", 1, 18));
        welcomeMsgname.setText("Hello");

        Jprofile.setFont(new java.awt.Font("Tahoma", 1, 14));
        Jprofile.setText("The profile ");
        Jprofile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JprofileActionPerformed(evt);
            }
        });

        label3.setFont(new java.awt.Font("Tahoma", 1, 18));
        label3.setText("ID:");

        welcomeMsgid.setFont(new java.awt.Font("Tahoma", 1, 18));
        welcomeMsgid.setForeground(new java.awt.Color(255, 0, 0));
        welcomeMsgid.setText("jLabel2");

        JregistreCourseButton.setFont(new java.awt.Font("Tahoma", 1, 14));
        JregistreCourseButton.setText("Register Course");
        JregistreCourseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JregistreCourseButtonActionPerformed(evt);
            }
        });

        Lsign_out.setFont(new java.awt.Font("Tahoma", 1, 14));
        Lsign_out.setText("Sign Out");
        Lsign_out.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Lsign_outActionPerformed(evt);
            }
        });

        JviewCourse.setFont(new java.awt.Font("Tahoma", 1, 14));
        JviewCourse.setText("View Course");
        JviewCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JviewCourseActionPerformed(evt);
            }
        });

        JsearchCourse.setFont(new java.awt.Font("Tahoma", 1, 14));
        JsearchCourse.setText("Search Course");
        JsearchCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JsearchCourseActionPerformed(evt);
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
                            .addComponent(label3, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(welcomeMsgid)
                            .addGap(453, 453, 453))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(Jprofile, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(49, 49, 49)
                                    .addComponent(JregistreCourseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(welcomeMsgname, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(JsearchCourse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(JviewCourse, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE))
                            .addContainerGap()))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Lsign_out, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(JregistreCourseButton, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                        .addComponent(JviewCourse, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE))
                    .addComponent(Jprofile, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(welcomeMsgname, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(welcomeMsgid)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(JsearchCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(48, 48, 48)
                .addComponent(Lsign_out, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JprofileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JprofileActionPerformed
      Profile_S p=new Profile_S();
      p.setVisible(true);
      p.viewProfile_Student(id);
    this.setVisible(false);
    }//GEN-LAST:event_JprofileActionPerformed

    private void JregistreCourseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JregistreCourseButtonActionPerformed

        RegisterCourse addCourse = new RegisterCourse(id,name);
   
        addCourse.setVisible(true);
    }//GEN-LAST:event_JregistreCourseButtonActionPerformed

    private void JviewCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JviewCourseActionPerformed
     View_Course_S v=new View_Course_S(id, name);
     v.setVisible(true);
    }//GEN-LAST:event_JviewCourseActionPerformed

    private void Lsign_outActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Lsign_outActionPerformed
     Login l=new Login();
     l.setVisible(true);
     this.setVisible(false);
    }//GEN-LAST:event_Lsign_outActionPerformed

    private void JsearchCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JsearchCourseActionPerformed
    SearchCourse s=new SearchCourse();
    s.setVisible(true);
    }//GEN-LAST:event_JsearchCourseActionPerformed

  
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Welcome_Student().setVisible(true);
            }
        });
    }

     String id;
     String name;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Jprofile;
    private javax.swing.JButton JregistreCourseButton;
    private javax.swing.JButton JsearchCourse;
    private javax.swing.JButton JviewCourse;
    private javax.swing.JButton Lsign_out;
    private javax.swing.JLabel label3;
    private javax.swing.JLabel welcomeMsgid;
    private javax.swing.JLabel welcomeMsgname;
    // End of variables declaration//GEN-END:variables

}
