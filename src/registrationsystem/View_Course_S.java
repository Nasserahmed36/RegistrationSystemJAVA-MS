package registrationsystem;

import java.sql.*;
import javax.swing.table.DefaultTableModel;

public class View_Course_S extends javax.swing.JFrame {

   
    public View_Course_S() {
        initComponents();
    }

    public View_Course_S(String id ,String name){
       
        initComponents();
         stdName.setText("stdName : "+name);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.id = id;
        this.name = name;
        DB.con= DB.connect("System");
        RegistredClasscours();
       
    }
    public void fillTable(String classCourseId){
        
        String query = "SELECT `ClassCourse`.`classCourseId`,`Course`.`courseName`,`ClassRoom`.`location` ,`ClassCourse`.`period`,`ClassCourse`.`day` from (`ClassCourse`left join `Course` on `Course`.`courseId` = `ClassCourse`.`courseId`) left join `ClassRoom` on `ClassRoom`.`classId`= `ClassCourse`.`classId` where `classCourseId`="+classCourseId+"";
        ResultSet resultSet =DB.executeQueryselect(query,DB.con);
        DefaultTableModel model = (DefaultTableModel)CourseTable.getModel();  

        try
        {

            while(resultSet.next())
            {

                Object [] row = new Object[4];

                row[0] = resultSet.getString("courseName");
                row[1] = resultSet.getString("location");
                row[2] = resultSet.getString("period");
                row[3] = resultSet.getString("day");
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
            String query = "SELECT `ClassCourse`.`classCourseId`  FROM `Coursestaken`inner join `ClassCourse` on `ClassCourse`.`classCourseId` = `Coursestaken`.`classCourseId` WHERE `studentId` = "+ID;
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
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        CourseTable = new javax.swing.JTable();
        stdName = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        stdName.setText("stdName :");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14));
        jButton1.setText("Back");
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
                        .addGap(32, 32, 32)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(stdName, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(stdName, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View_Course_S().setVisible(true);
            }
        });
    }

   private String id ;
    private String name;
      DB_Connection DB =new DB_Connection();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable CourseTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel stdName;
    // End of variables declaration//GEN-END:variables

}
