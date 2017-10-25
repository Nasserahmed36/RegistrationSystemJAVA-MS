
package registrationsystem;

import java.sql.*;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {
    
    public Login() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        nameLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        userName = new javax.swing.JTextField();
        userPassword = new javax.swing.JPasswordField();
        userLogin = new javax.swing.JButton();
        userType = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Login", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18))); // NOI18N

        nameLabel.setText("Student Name");

        passwordLabel.setText("Password");

        userPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userPasswordActionPerformed(evt);
            }
        });

        userLogin.setText("Login");
        userLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userLoginActionPerformed(evt);
            }
        });

        userType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Student", "Professor" }));
        userType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userTypeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(141, Short.MAX_VALUE)
                .addComponent(userLogin)
                .addGap(92, 92, 92))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(passwordLabel)
                    .addComponent(nameLabel))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(userType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                    .addComponent(userName, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(userType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel)
                    .addComponent(userName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordLabel)
                    .addComponent(userPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(userLogin)
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(129, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(84, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void userLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userLoginActionPerformed
        
        
        char type = getUserType();
        String username = getUserName();
        String password = getUserPassword();
        String id = "";
        
        DB.con = DB.connect("nasser");
        
        if(type == 'S')
        {
            id = getStudentIDByUsername(username);
            
        }
        else
        {
            id = getProfessorIDByUsername(username);
            
        }
        if(checkLoginValidity(username, password, type))
        {
            
            String name = getNameById(id, type);
            
            if(type=='S')
            {
                Welcome_Student w =  new Welcome_Student();
                w.setVisible(true);
                w.setMessageText(name,id);
                this.setVisible(false);
            }
            
            else{
                Welcome_Instructor w =  new Welcome_Instructor();
                w.setVisible(true);
                w.setMessageText(name,id);}
            this.setVisible(false);
        }
        
        
        DB.disconnect(DB.con);
        
        
    }//GEN-LAST:event_userLoginActionPerformed
    
    
    private void userTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userTypeActionPerformed
        
        char type = getUserType();
        if(type == 'S')
        {
            nameLabel.setText("Student Name");
        }
        else
        {
            nameLabel.setText("Professor Name");
        }
    }//GEN-LAST:event_userTypeActionPerformed
    
    private void userPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userPasswordActionPerformed
        
    }//GEN-LAST:event_userPasswordActionPerformed
    
    public char getUserType()
    {
        int type = userType.getSelectedIndex();
        if(type == 0 )
            return 'S';
        else
            return 'P';
    }
    public String getUserName()
    {
        String name = (String)userName.getText();
        return name;
    }
    
    public String getUserPassword()
    {
        String password  =(String) userPassword.getText();
        return password;
    }
    
    
    public String getStudentNameById(int id)
    {
        String query = "select `firstName`,`lastName` from `Student` where `studentId` ="+id;
        ResultSet resultSet = DB.executeQueryselect(query,DB.con);
        
        String s = "";
        try{
            while(resultSet.next())
            {
                s+= resultSet.getString("firstName")+" "+resultSet.getString("lastName");
            }
        }
        catch(Exception e)
        {
            System.out.println("cannt execute the query "+e.getMessage());
        }
        
        return s;
        
    }
    
    
    
    public String getNameById(String id ,char type)
    {
        try{
            if(type == 'S')
            {
                ResultSet rs=DB.executeQueryselect
                        ("SELECT `studInstId`, `Student`.`firstName`,`Student`.`lastName` FROM `Student` inner JOIN `Login` ON `Login`.`studInstId`=`Student`.`studentId`",DB.con);
                
                while(rs.next())
                    if(rs.getString("studInstId").equals(id))
                    {
                        return rs.getString("firstName")+"  "+rs.getString("lastName");
                    }
                
            }
            else
            {
                ResultSet rs= DB.executeQueryselect
                        ("SELECT `studInstId`, `Instructor`.`firstName`,`Instructor`.`lastName` FROM `Instructor` inner JOIN `Login` ON `Login`.`studInstId`=`Instructor`.`instId`",DB.con);
                
                
                while(rs.next())
                    if(rs.getString("studInstId").equals(id))
                    {
                        return rs.getString("firstName")+"  "+rs.getString("lastName");
                    }
                
            }
        }
        catch(Exception e)
        {
            System.out.println("cannt execute the query  getNameById"+ e.getMessage());
        }
        return"";
    }
    
    
    public String getStudentIDByUsername(String username)
    {
        String query = "select `studInstId` from `Login` where `type` = 'S' and `username`='"+username+"'";
        ResultSet resultSet = DB.executeQueryselect(query,DB.con);
        
        String s = "";
        try{
            while(resultSet.next())
            {
                s+= resultSet.getString("studInstId");
            }
        }
        catch(Exception e)
        {
            System.out.println("cannt execute the query  getStudentIDByUsername"+e.getMessage());
        }
        
        return s;
        
    }
    public String getProfessorNameById(int id)
    {
        String query = "select `firstName`,`lastName` from `Instructor` where `instId` ="+id;
        ResultSet resultSet = DB.executeQueryselect(query,DB.con);
        
        String s = "";
        try{
            while(resultSet.next())
            {
                s+= resultSet.getString("firstName")+" "+resultSet.getString("lastName");
            }
        }
        catch(Exception e)
        {
            System.out.println("cannt execute the query getProfessorNameById"+e.getMessage());
        }
        
        return s;
        
    }
    public String getProfessorIDByUsername(String username)
    {
        
        
        String query = "select `studInstId` from `Login` where `type` = 'P' and `username`='"+username+"'";
        ResultSet resultSet = DB.executeQueryselect(query,DB.con);
        
        String s = "";
        try{
            while(resultSet.next())
            {
                s+= resultSet.getString("studInstId");
            }
        }
        catch(Exception e)
        {
            System.out.println("cannt execute the query getProfessorIDByUsername"+e.getMessage());
        }
        
        return s;
        
    }
    
    
    
    
    public boolean checkLoginValidity(String name,String passsword,char type)
    {
        
        String query = "select * from `Login` where `username` = '"+name+"'"+"and `type` ='"+type+"'";
        ResultSet table = DB.executeQueryselect(query,DB.con);
        
        try{
            if(!table.next())
            {
                JOptionPane.showMessageDialog(this, "Invalid Username","Invalid Login",0);
                return false;
            }
            else if(!table.getString("password").equals(passsword))
            {
                numberOfTries--;
                if(numberOfTries == 0)
                {
                    JOptionPane.showMessageDialog(this, "You have typed an incorrect password 3 times","Invalid Login",0);
                    userName.setText("");
                    userName.setEditable(false);
                    userPassword.setEditable(false);
                    userLogin.setEnabled(false);
                    userType.setEnabled(false);
                    
                }
                else
                {
                    JOptionPane.showMessageDialog(this, "Invalid Password \nNumber of Tries is "+numberOfTries,"Invalid Login",0);
                }
                
                return false;
                
                
            }
            studInstId=table.getString("studInstId");
            return true;
        }
        catch(Exception e)
        {
            System.out.println("Tabel Error " +e.getMessage());
        }
        
        
        return true;
        
        
    }
    
    
    
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }
    
    public static int numberOfTries =  3;
    DB_Connection DB =new DB_Connection();
    public static String studInstId;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JButton userLogin;
    private javax.swing.JTextField userName;
    private javax.swing.JPasswordField userPassword;
    private javax.swing.JComboBox userType;
    // End of variables declaration//GEN-END:variables
    
}
