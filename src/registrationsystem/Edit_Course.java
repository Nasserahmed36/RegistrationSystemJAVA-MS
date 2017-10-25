package registrationsystem;

import java.sql.ResultSet;

public class Edit_Course extends javax.swing.JFrame {

   
    public Edit_Course() {

    }
    public Edit_Course(String classId){
                initComponents();
                 this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                this.classId=classId;

        maxCapacity.setText(getmaxCapacity());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        maxCapacity = new javax.swing.JLabel();
        NewMaxCaoacity = new javax.swing.JTextField();
        Save = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("max Capacity =");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("New  max Capacity =");

        maxCapacity.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        maxCapacity.setForeground(new java.awt.Color(153, 0, 0));
        maxCapacity.setText("11");

        NewMaxCaoacity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewMaxCaoacityActionPerformed(evt);
            }
        });

        Save.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Save.setText("Save");
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(NewMaxCaoacity, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(maxCapacity))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(Save, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(132, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(maxCapacity))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NewMaxCaoacity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(Save, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private String getmaxCapacity (){
          DB.connect("System");
        
        try{
      
        String query = "select `maxCapacity` from `ClassRoom` where `classId`="+classId+"";
        ResultSet resultSet =DB.executeQueryselect(query,DB.con);
        resultSet.next();
         max=resultSet.getString("maxCapacity");
        }
        catch(Exception e){
            System.out.println("Exception in getmaxCapacity"+e.getMessage());
        }
        return max;
    }


    private void NewMaxCaoacityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewMaxCaoacityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NewMaxCaoacityActionPerformed

    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed

        try{

            String query="Update `ClassRoom` Set `maxCapacity`="+NewMaxCaoacity.getText()+" WHERE `classId` ="+classId+"";
            DB.update(query,DB.con);

            DB.disconnect(DB.con);
        }

        catch(Exception e){
            System.out.println("cannt execute the query  setProfile_Instructor  "+e.getMessage());
                          }
        this.setVisible(false);
    }//GEN-LAST:event_SaveActionPerformed


    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Edit_Course().setVisible(true);
            }
        });
    }
      DB_Connection DB =new DB_Connection();
      String classId;
      String max;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField NewMaxCaoacity;
    private javax.swing.JButton Save;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel maxCapacity;
    // End of variables declaration//GEN-END:variables

}
