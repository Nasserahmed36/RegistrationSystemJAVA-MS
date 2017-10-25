package registrationsystem;

import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class View_Course_I extends javax.swing.JFrame {

    /** Creates new form View_Course_I */
    public View_Course_I() {
        initComponents();
    }

    
    public View_Course_I(String id ,String name){
       
        initComponents();
         instName.setText("instName : "+name);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.id = id;
        this.name = name;
        DB.con= DB.connect("System");
        RegistredClasscours();
       
    }
    public void fillTable(String classCourseId){
        
        String query = "SELECT `ClassRoom`.`classId`,`ClassCourse`.`classCourseId`,`Course`.`courseName`,`ClassRoom`.`location` ,`ClassCourse`.`period`,`ClassCourse`.`day` from (`ClassCourse`left join `Course` on `Course`.`courseId` = `ClassCourse`.`courseId`) left join `ClassRoom` on `ClassRoom`.`classId`= `ClassCourse`.`classId` where `classCourseId`="+classCourseId+"";
        ResultSet resultSet =DB.executeQueryselect(query,DB.con);
        DefaultTableModel model = (DefaultTableModel)CourseTable.getModel();  

        try
        {

            while(resultSet.next())
            {

                Object [] row = new Object[5];
                row[0] = resultSet.getString("classId");
                row[1] = resultSet.getString("courseName");
                row[2] = resultSet.getString("location");
                row[3] = resultSet.getString("period");
                row[4] = resultSet.getString("day");
               
                model.addRow(row);

            }
        }
        catch(Exception e)
        {
            System.out.println("cannt  fiil table   "+e.getMessage());
        }

        
    }

     private void RegistredClasscours()
    {

 String idClasscours[]= getRegistredClasscours();

        for (int i = 0; i <idClasscours.length; i++) {
            fillTable(idClasscours[i]);
        }
DB.disconnect(DB.con);
    }


        private String [] getRegistredClasscours()
    {
         String registredClasscours[] = null;

        try
        {
                 int ID = Integer.parseInt(id);
            int size = numberOfRegisteredCourses();
            String query = "SELECT `ClassCourse`.`classCourseId`  FROM `instructorClassCourse` inner join `ClassCourse` on `ClassCourse`.`classCourseId` = `instructorClassCourse`.`classcourseId` WHERE `instId` = "+ID;
            ResultSet resultSet =DB.executeQueryselect(query,DB.con);

            registredClasscours = new String[size];

            for(int i=0;i<size;i++)
            {
                resultSet.next();
                registredClasscours[i] = resultSet.getString("classCourseId");
                
            }

        }
        catch(Exception e)
        {
            System.out.println("cannt execute the query getRegistredClasscours"+e.getMessage());
        }

      return registredClasscours;
    }


    private int numberOfRegisteredCourses()
    {
         int ID = Integer.parseInt(id);
         int size =0;
         String query = "SELECT COUNT(`instId`) FROM `instructorClassCourse` WHERE `instId` = "+ID;
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



    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        CourseTable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        instName = new javax.swing.JLabel();
        Edit_Course = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        CourseTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Class Id", "Course Name", "Class Room", "Period", "Day"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(CourseTable);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14));
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        instName.setText("instName :");

        Edit_Course.setFont(new java.awt.Font("Tahoma", 1, 14));
        Edit_Course.setText("Edit Course");
        Edit_Course.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Edit_CourseActionPerformed(evt);
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
                        .addComponent(instName, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)
                        .addComponent(Edit_Course, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 393, Short.MAX_VALUE)
                .addGap(49, 49, 49))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(instName, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Edit_Course, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE))
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
}//GEN-LAST:event_jButton1ActionPerformed

    private void Edit_CourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Edit_CourseActionPerformed
       DefaultTableModel model = (DefaultTableModel)CourseTable.getModel();
           //JOptionPane.showMessageDialog(null,"Please Select one  Courses !!");
        int row = CourseTable.getSelectedRow();
              if(row == -1)
        {
             JOptionPane.showMessageDialog(this,"Please Select one Course !!","Erorr",0);
             return;
        }
        String classId = (String) model.getValueAt(row,0);
        Edit_Course e=new Edit_Course(classId);
        e.setVisible(true);
}//GEN-LAST:event_Edit_CourseActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View_Course_I().setVisible(true);
            }
        });
    }
   private String id ;
    private String name;
      DB_Connection DB =new DB_Connection();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable CourseTable;
    private javax.swing.JButton Edit_Course;
    private javax.swing.JLabel instName;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

}
