
package registrationsystem;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class RegisterCourse extends javax.swing.JFrame {

    /** Creates new form AddCourse */
    public RegisterCourse()
    {

    }
    public RegisterCourse(String id ,String name) {
       
        initComponents();
         stdName.setText("stdName : "+name);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setLocationByPlatform(true);
        this.id = id;
        this.name = name;        
        DB.con= DB.connect("System");
        fillTable();
        String[] courses = getRegistredCoursIds();        
        deleteFromTable(courses);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        CourseTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        stdName = new javax.swing.JLabel();
        addButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        CourseTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Course ID", "Course Name", "Class Room", "Period", "Day", "ID"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(CourseTable);
        CourseTable.getColumnModel().getColumn(5).setMinWidth(0);
        CourseTable.getColumnModel().getColumn(5).setPreferredWidth(0);
        CourseTable.getColumnModel().getColumn(5).setMaxWidth(0);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel1.setText("Semester Courses ");

        stdName.setText("stdName :");

        addButton.setText("Add ");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(107, 107, 107)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(102, 102, 102))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(cancelButton)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(addButton)
                            .addGap(151, 151, 151))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(stdName, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap()))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(stdName, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addButton)
                    .addComponent(cancelButton))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed

        if(numberOfRegisteredCourses()>=3)
        {
            JOptionPane.showMessageDialog(this,"You cannt register more than 3 Courses","",0);
            return;
        }

        DefaultTableModel model = (DefaultTableModel)CourseTable.getModel();
        int row = CourseTable.getSelectedRow();
        if(row == -1)
        {
             JOptionPane.showMessageDialog(this,"Please Select one Course !!","Erorr",0);
             return;
        }
        String courseName = (String) model.getValueAt(row, 1);
        String mainID = (String) model.getValueAt(row, 5);
        String peroid = (String) model.getValueAt(row, 3);
        String day = (String) model.getValueAt(row, 4);

        if(seatsLeft(mainID)<=0)                                                              //
        {
            JOptionPane.showMessageDialog(this,"The Class Is Full","",0);
            return;
        }
        if(IsThereConflictInTime(peroid, day))
        {
            JOptionPane.showMessageDialog(this,"There is Conflict In Time","",0);
            return;
        }
        try
        {            
            String query = "INSERT INTO `Coursestaken` (`studentId`,`classCourseId`,`grade`) VALUES("+id+","+ mainID + ",null);";
            DB.update(query,DB.con);
            JOptionPane.showMessageDialog(this,"The "+ courseName  + " Course has correctly Registered ");        
        }
        catch(Exception e)
        {
            System.out.println("cannt execute the query addButtonActionPerformed"+e.getMessage());
        }
DB.disconnect(DB.con);
 dispose();
    }//GEN-LAST:event_addButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        dispose();
    }//GEN-LAST:event_cancelButtonActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterCourse().setVisible(true);
                
            }
        });
    }

    private void fillTable()
    {
        String query = "SELECT `ClassCourse`.`classCourseId` ,`Course`.`courseId`,  `Course`.`courseName`,`ClassRoom`.`location` ,`ClassCourse`.`period`,`ClassCourse`.`day` from (`ClassCourse`left join `Course` on `Course`.`courseId` = `ClassCourse`.`courseId`) left join `ClassRoom` on `ClassRoom`.`classId`= `ClassCourse`.`classId`;";
        ResultSet resultSet =DB.executeQueryselect(query,DB.con);
        DefaultTableModel model = (DefaultTableModel)CourseTable.getModel();                                    

        try
        {
            while(resultSet.next())
            {
                Object [] row = new Object[6];
                
                row[0] = resultSet.getString("courseId");
                row[1] = resultSet.getString("courseName");
                row[2] = resultSet.getString("location");
                row[3] = resultSet.getString("period");
                row[4] = resultSet.getString("day");
                row[5] = resultSet.getString("classCourseId");
                model.addRow(row);
            }
        }
        catch(Exception e)
        {
            System.out.println("cannt  fiil table"+e.getMessage());
        }
      
    }
    private void deleteFromTable(String [] courseName)
    {

        if(courseName == null)
            return;
        DefaultTableModel model = (DefaultTableModel)CourseTable.getModel();
        for(int j=0;j<courseName.length;j++)
        {
            for(int i =0;i<model.getRowCount();i++)
            {
                if(courseName[j].equalsIgnoreCase((String)(model.getValueAt(i, 0))))
                {
                    model.removeRow(i);
                    i--;
                }
            }
        }       
        
    }

    private int numberOfRegisteredCourses()
    {
         int ID = Integer.parseInt(id);         
         int size =0;
         String query = "SELECT COUNT(`studentId`) FROM `Coursestaken` WHERE `studentId` = "+ID;
         ResultSet resultSet =DB.executeQueryselect(query,DB.con);

         try{
             resultSet.next();
             size = Integer.parseInt(resultSet.getString("Expr1000"));                                                     //
         }
         catch(Exception e)
         {
             System.out.println("numberOfRegisteredCourses "+ e.getMessage());
         }

         return size;
    }
    private String [] getRegistredCoursIds()
    {
         String registredCoursIds[] = null;

        try
        {
            int ID = Integer.parseInt(id);
            int size = numberOfRegisteredCourses();


            String query = "SELECT `ClassCourse`.`courseId`  FROM `Coursestaken`inner join `ClassCourse` on `ClassCourse`.`classCourseId` = `Coursestaken`.`classCourseId` WHERE `studentId` = "+ID;
            ResultSet resultSet =DB.executeQueryselect(query,DB.con);

            registredCoursIds = new String[size];

            for(int i=0;i<size;i++)
            {
                resultSet.next();
                registredCoursIds[i] = resultSet.getString("courseId");
            }          
           
        }
        catch(Exception e)
        {
            System.out.println("cannt execute the query getRegistredCoursIds"+e.getMessage());
        }



        return registredCoursIds;
    }
    public int numberOfRegisteredStudents(String classCourseID)
    {
        int ID = Integer.parseInt(classCourseID);
        int numbnerOFstudents = 0;
        String query = "SELECT count(`ClassCourse`.`classCourseId`) from `Coursestaken` inner join `ClassCourse` on `ClassCourse`.`classCourseId` = `Coursestaken`.`classCourseId`where `Coursestaken`.`classCourseId` =" + ID;
        ResultSet resultSet =DB.executeQueryselect(query,DB.con);

        try{
             resultSet.next();
             numbnerOFstudents = Integer.parseInt(resultSet.getString("Expr1000"));
        }
        catch(Exception e)
        {
             System.out.println("numberOfRegisteredStudents "+ e.getMessage());
        }

        return numbnerOFstudents;
    }
    public int maxCapacity(String classCourseID)
    {
        int ID = Integer.parseInt(classCourseID);
        int capacity = 0;
        String query = "SELECT `ClassRoom`.`maxCapacity` from `ClassRoom` inner join `ClassCourse` on `ClassCourse`.`classId` = `ClassRoom`.`classId` where `ClassCourse`.`classCourseId` =" + ID;
        ResultSet resultSet =DB.executeQueryselect(query,DB.con);

        try{
             resultSet.next();
             capacity = Integer.parseInt(resultSet.getString("maxCapacity"));
        }
        catch(Exception e)
        {
             System.out.println("maxCapacity "+ e.getMessage());
        }

        return capacity;
    }
    public int seatsLeft(String classCourseID)
    {
        return maxCapacity(classCourseID)-numberOfRegisteredStudents(classCourseID);
    }
    public boolean IsThereConflictInTime(String peroid,String day)
    {
        int ID = Integer.parseInt(id);
        String query = "SELECT `ClassCourse`.`period`,`ClassCourse`.`day` from `ClassCourse`inner join `Coursestaken` on `Coursestaken`.`classCourseId` =`ClassCourse`.`classCourseId` where `studentId` ="+ id;
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
    
    public void setNameAndId(String name,String id)
    {

        this.id = id;        
        this.name = name;
        stdName.setText(name);
    }

    private String id ;
    private String name;
    DB_Connection DB =new DB_Connection();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable CourseTable;
    private javax.swing.JButton addButton;
    private javax.swing.JButton cancelButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel stdName;
    // End of variables declaration//GEN-END:variables

}
