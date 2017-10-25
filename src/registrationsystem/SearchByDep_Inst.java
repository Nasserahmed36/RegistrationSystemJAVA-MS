package registrationsystem;

import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class SearchByDep_Inst extends javax.swing.JFrame {

    public SearchByDep_Inst() {
        initComponents();
              this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }





    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        CourseTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Jdepartment = new javax.swing.JTextField();
        Jinstructor = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 24));
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel1.setText("Search Course By Department and Instructor");

        CourseTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Course Name", "Class Room", "Period", "Day"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(CourseTable);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel2.setText("Department :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel3.setText("Instructor :");

        Jdepartment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JdepartmentActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18));
        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Jinstructor)
                            .addComponent(Jdepartment, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE))
                        .addGap(135, 135, 135)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 140, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Jdepartment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Jinstructor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)))
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        SearchCourse s=new SearchCourse();
        s.setVisible(true);
        this.setVisible(false);
}//GEN-LAST:event_jButton2ActionPerformed

public String getIdInstructor(String nameInstructor){
    try{
         String query = "SELECT `instId` From `Instructor` where `firstName`='"+nameInstructor+"'";
            ResultSet resultSet =DB.executeQueryselect(query,DB.con);
while(resultSet.next()){
    return resultSet.getString("instId");
}

    }
     catch(Exception e)
        {
            System.out.println("cannt execute the query  getIdInstructor"+e.getMessage());
        }


    return "";
}



public String getIdDepartment(String nameDepartment){
    try{
         String query = "SELECT `deptId` From `Department` where `deptName`='"+nameDepartment+"'";
            ResultSet resultSet =DB.executeQueryselect(query,DB.con);
while(resultSet.next()){
    return resultSet.getString("deptId");
}

    }
     catch(Exception e)
        {
            System.out.println("cannt execute the query  getIdInstructor"+e.getMessage());
        }


    return "";
}

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        DB.con= DB.connect("System");
                DefaultTableModel model = (DefaultTableModel)CourseTable.getModel();
        String Department =getIdDepartment(Jdepartment.getText());
        String Instructor =getIdInstructor(Jinstructor.getText());
                for (int i = 0; i <model.getRowCount(); i++) {
            model.removeRow(i);
            i--;
        }
        if(Department.equals("")){
            JOptionPane.showMessageDialog(null,"Please Enter Department name");
            return;
        }
        if(Instructor.equals("")){
            JOptionPane.showMessageDialog(null,"Please Enter InstructorName name");
            return;
        }
        String z[]= FindIdClassCourse(Department,Instructor);
        IdClassCourse(z);
         DB.disconnect(DB.con);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void JdepartmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JdepartmentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JdepartmentActionPerformed

    
    public void IdClassCourse(String classcourse[]){
        
        for (int i = 0; i <classcourse.length; i++) {
            fillTable(classcourse[i]);
        }
    }
    
    
    public String[] FindIdClassCourse(String d,String i){
    String  registredClasscours[]=new String[100];
    int j=0;
    try{
    String query = "SELECT `ClassCourse`.`classCourseId`  FROM (`ClassCourse` inner join `Course` on `Course`.`courseId` = `ClassCourse`.`courseId`) inner join `instructorClassCourse` on `instructorClassCourse`.`classcourseId` = `ClassCourse`.`classCourseId` where `instructorClassCourse`.`instId`="+i+" and `Course`.`deptId`="+d+"";
            ResultSet resultSet =DB.executeQueryselect(query,DB.con);

  while(resultSet.next()){

                  registredClasscours[j] = resultSet.getString("classCourseId");
      j++;
            }

    }
    catch(Exception e)
        {
            System.out.println("cannt execute the query  getCourse"+e.getMessage());
        }

    return  registredClasscours;

}

     public void fillTable(String IdClassCourse){

        String query = "SELECT `ClassCourse`.`classCourseId`,`Course`.`courseName`,`ClassRoom`.`location` ,`ClassCourse`.`period`,`ClassCourse`.`day` from (`ClassCourse`left join `Course` on `Course`.`courseId` = `ClassCourse`.`courseId`) left join `ClassRoom` on `ClassRoom`.`classId`= `ClassCourse`.`classId` where `ClassCourse`.`classCourseId`="+IdClassCourse+"";
        ResultSet resultSet =DB.executeQueryselect(query,DB.con);
        DefaultTableModel model = (DefaultTableModel)CourseTable.getModel();

        try
        {
              int i = 0;
            while(resultSet.next())
            {
            i++;
                Object [] row = new Object[4];

                row[0] = resultSet.getString("courseName");
                row[1] = resultSet.getString("location");
                row[2] = resultSet.getString("period");
                row[3] = resultSet.getString("day");
                model.addRow(row);
                               if(i==0)
                        JOptionPane.showMessageDialog(null,"Sorry, Not Found Course In The Period And Day");
               i=0;
            }
        }
        catch(Exception e)
        {
            System.out.println("cannt  fiil table   "+e.getMessage());
        }


    }



    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SearchByDep_Inst().setVisible(true);
            }
        });
    }

          DB_Connection DB =new DB_Connection();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable CourseTable;
    private javax.swing.JTextField Jdepartment;
    private javax.swing.JTextField Jinstructor;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

}
