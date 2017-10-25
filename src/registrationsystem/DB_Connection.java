package registrationsystem;

import java.sql.*;


public class DB_Connection {
    
    
    Connection con;
    
    public Connection connect (String URL)
    {
        
        try{
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver") ;
            con =  DriverManager.getConnection("jdbc:odbc:"+URL);
            System.out.println("Connection ok.");
        }
        catch(Exception e)
        {
            System.out.println("Can't Connect!! "+e.getMessage());
            
        }
        
        return con;
    }
    
    
    public void update(String sql,Connection con){
        try{
            Statement st=con.createStatement();
            st.executeUpdate(sql);
            disconnect(con);
        }
        catch(Exception e){
            System.err.println("Except1ion: "+e.getMessage());
        }
    }
    
    public ResultSet executeQueryselect(String query ,Connection con)
    {
        try{
            Statement statement = con.createStatement();
            return  statement.executeQuery(query);
        }
        
        catch(Exception e){
            System.out.println("Can't Execute Queryselect "+ e.getMessage());
            return null;
        }
    }
    
    
    
    public void disconnect(Connection con)
    {
        try{
            con.close();
        }
        catch(Exception e)
        {
            System.out.println("Cannt close "+e.getMessage());
        }
        
    }
    
}
