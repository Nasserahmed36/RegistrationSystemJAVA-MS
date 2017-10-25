package registrationsystem;

import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class AddCourse extends javax.swing.JFrame {

    public AddCourse() {
        initComponents();
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }




    public String getClassid (String nameclass){

        try{
            String Classid;
        String query ="Select `classId` from `ClassRoom` where `location`='"+nameclass+"'";
        ResultSet resultset=DB.executeQueryselect(query,DB.con);
        resultset.next();
        Classid=resultset.getString("classId");
        return Classid;
        }
        catch(Exception e){
            System.out.println("Exeption in getClassid"+e.getMessage());
        }
        return "";
    }

    public String getCourseid(String namecourse){

        try{
            String Courseid;
        String query ="Select `courseId` from `Course` where `courseName`='"+namecourse+"'";
        ResultSet resultset=DB.executeQueryselect(query,DB.con);
        resultset.next();
        Courseid=resultset.getString("courseId");
        return Courseid;
        }
        catch(Exception e){
            System.out.println("Exeption in getClassid"+e.getMessage());
        }
        return "";
    }

public boolean IsThereConflictInTime(String peroid,String day)
    {
        String query = "SELECT `ClassCourse`.`period`,`ClassCourse`.`day` from `ClassCourse`inner join `instructorClassCourse` on `instructorClassCourse`.`classcourseId` =`ClassCourse`.`classCourseId` where `instId` ="+ id;
        ResultSet resultSet =DB.executeQueryselect(query,DB.con);

        try{
             while(resultSet.next())
             {
                 String p = resultSet.getString("period");
                 String d = resultSet.getString("day");

                 if(p.equalsIgnoreCase(peroid) && d.equalsIgnoreCase(day))
                 {
                     return true;
                 }
             }
        }
        catch(Exception e)
        {
             System.out.println("IsThereConflictInTime"+ e.getMessage());
        }

        return false;
    }


public boolean IsThereConflict(String id,String period,String day){
            String query = "SELECT `classId`,`period`,`day` from `ClassCourse`";
        ResultSet resultSet =DB.executeQueryselect(query,DB.con);

        try{
             while(resultSet.next())
             {
                 String p = resultSet.getString("period");
                 String d = resultSet.getString("day");
                 String i=resultSet.getString("classId");
                 if(p.equalsIgnoreCase(period) && d.equalsIgnoreCase(day) && i.equalsIgnoreCase(id))
                 {
                     return true;
                 }
             }
        }
        catch(Exception e)
        {
             System.out.println("IsThereConflictInTime"+ e.getMessage());
        }


    return false;
}
public String getIdClassCourse(){

    String query = "SELECT COUNT(`classCourseId`) FROM `ClassCourse`";
         ResultSet resultSet =DB.executeQueryselect(query,DB.con);
         int size=0;
         try{

             resultSet.next();
             size = Integer.parseInt(resultSet.getString("Expr1000"));
             return (size+1)+"";
         }
         catch(Exception e)
         {
             System.out.println("numberOfRegisteredCourses "+ e.getMessage());
         }
         return "";
}

public void Stord_InstructorClassCourse(String idclasscourse){
    try{
     String query = "INSERT INTO `instructorClassCourse` (`instId`,`classcourseId`) VALUES("+id+","+ idclasscourse + ")";
           DB.update(query,DB.con);
           DB.disconnect(DB.con);
    }
    catch(Exception e){
        System.out.println("Exception IN Stord_InstructorClassCourse"+e.getMessage());
    }
}

public void Stord_ClassCourse(String idclasscourse,String idclass,String idcourse,String period,String day){
        try{
            DB.connect("System");
     String query = "INSERT INTO `ClassCourse` (`classCourseId`,`classId`,`courseId`,`period`,`day`) VALUES("+idclasscourse+","+ idclass+","+idcourse+","+period+",'"+day+ "')";
           DB.update(query,DB.con);
            JOptionPane.showMessageDialog(this,"The  correctly Registered ");
    }
    catch(Exception e){
        System.out.println("Exception IN Stord_ClassCourse"+e.getMessage());
    }
}



    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Period = new javax.swing.JComboBox();
        Day = new javax.swing.JComboBox();
        Save = new javax.swing.JButton();
        CourseName = new javax.swing.JComboBox();
        ClassName = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Period.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "8", "9", "10", "11", "12", "1", "2", "3", "4" }));

        Day.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2" }));

        Save.setFont(new java.awt.Font("Tahoma", 1, 14));
        Save.setText("Save");
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });

        CourseName.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Java1", "Java2", "Database", "Web", "Data Structure", "Data Mining", "Software", "UML", "Security", "Analysis" }));
        CourseName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CourseNameActionPerformed(evt);
            }
        });

        ClassName.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "IT101", "IT103", "IT202", "IT301", "IT303" }));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel4.setText("Day   :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel3.setText("Period :");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel1.setText("Class  :");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel2.setText("Course :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(50, 50, 50))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Period, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Day, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CourseName, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ClassName, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(85, 85, 85)
                .addComponent(Save, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(ClassName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CourseName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Period, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(Day, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(203, 203, 203)
                .addComponent(Save, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed
        DB.connect("System");
        String Classid=getClassid((String) ClassName.getSelectedItem());
        String Courseid=getCourseid((String) CourseName.getSelectedItem());
        String period=(String) Period.getSelectedItem();
        String day=(String) Day.getSelectedItem();

        if(IsThereConflictInTime(period, day)) {
            JOptionPane.showMessageDialog(this,"There is Conflict In Time","",0);
            return;
        }
        if(IsThereConflict(Classid,period, day)){
            JOptionPane.showMessageDialog(this,"There is Conflict In Class","",0);
            return;
        }
        String count=getIdClassCourse();
        Stord_InstructorClassCourse(count);
        Stord_ClassCourse(count,Classid,Courseid,period, day);

        DB.disconnect(DB.con);
    }//GEN-LAST:event_SaveActionPerformed

    private void CourseNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CourseNameActionPerformed

}//GEN-LAST:event_CourseNameActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddCourse().setVisible(true);
            }
        });
    }

    public void getidinstructor(String id){
        this.id=id;
    }



    String id;
   DB_Connection DB =new DB_Connection();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox ClassName;
    private javax.swing.JComboBox CourseName;
    private javax.swing.JComboBox Day;
    private javax.swing.JComboBox Period;
    private javax.swing.JButton Save;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables

}
