package registrationsystem;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class SearchByDay_Period extends javax.swing.JFrame {


    public SearchByDay_Period() {
        initComponents();
         this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
      CourseTable.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Jback = new javax.swing.JButton();
        Jperiod = new javax.swing.JTextField();
        Jday = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        CourseTable = new javax.swing.JTable();
        Jsearch = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Period :");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Search Course By Day and Period");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Day :");

        Jback.setFont(new java.awt.Font("Tahoma", 1, 24));
        Jback.setText("Back");
        Jback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbackActionPerformed(evt);
            }
        });

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

        Jsearch.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Jsearch.setText("Search");
        Jsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JsearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(217, 217, 217)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Jsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addContainerGap(121, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(Jback, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Jperiod)
                    .addComponent(Jday, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Jday, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Jperiod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))))
                .addGap(28, 28, 28)
                .addComponent(Jsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addComponent(Jback, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbackActionPerformed
        SearchCourse s=new SearchCourse();
        s.setVisible(true);
        this.setVisible(false);
}//GEN-LAST:event_JbackActionPerformed

    private void JsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JsearchActionPerformed
          DB.con= DB.connect("System");
                  DefaultTableModel model = (DefaultTableModel)CourseTable.getModel();

        String Day =Jday.getText();
        String Period =Jperiod.getText();
        for (int i = 0; i <model.getRowCount(); i++) {
            model.removeRow(i);
            i--;
        }
                if(Day.equals("")){
            JOptionPane.showMessageDialog(null,"Please Enter  Day");
            return;
        }
        if(Period.equals("")){
            JOptionPane.showMessageDialog(null,"Please Enter Period");
            return;
        }



        CourseTable.setVisible(true);
fillTable(Day,Period);
    }//GEN-LAST:event_JsearchActionPerformed




     public void fillTable(String Day,String Period){

        String query = "SELECT `ClassCourse`.`classCourseId`,`Course`.`courseName`,`ClassRoom`.`location` ,`ClassCourse`.`period`,`ClassCourse`.`day` from (`ClassCourse`left join `Course` on `Course`.`courseId` = `ClassCourse`.`courseId`) left join `ClassRoom` on `ClassRoom`.`classId`= `ClassCourse`.`classId` where `day` ='"+Day+"' and `period` ="+Period+"";
        ResultSet resultSet =DB.executeQueryselect(query,DB.con);
        DefaultTableModel model = (DefaultTableModel)CourseTable.getModel();

        try
        {
               int i=0;
            while(resultSet.next())
            {
            i++;
                Object [] row = new Object[4];

                row[0] = resultSet.getString("courseName");
                row[1] = resultSet.getString("location");
                row[2] = resultSet.getString("period");
                row[3] = resultSet.getString("day");
               
                model.addRow(row);

            }
               if(i==0)
                        JOptionPane.showMessageDialog(null,"Sorry, Not Found Course In The Period And Day");
               i=0;
            DB.disconnect(DB.con);
        }
        catch(Exception e)
        {
            System.out.println("cannt  fiil table   "+e.getMessage());
        }


    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SearchByDay_Period().setVisible(true);
            }
        });
    }

             DB_Connection DB =new DB_Connection();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable CourseTable;
    private javax.swing.JButton Jback;
    private javax.swing.JTextField Jday;
    private javax.swing.JTextField Jperiod;
    private javax.swing.JButton Jsearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

}
