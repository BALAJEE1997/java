    import java.sql.*;  
    class MysqlCon{  
    public static void main(String args[]){  
    try{   
    Connection con=DriverManager.getConnection(  
    "jdbc:mysql://localhost:3306/cipher","balajee","balajee");  
    //here sonoo is database name, root is username and password  
    Statement stmt=con.createStatement();  
    ResultSet rs=stmt.executeQuery("select * from Persons");  
    while(rs.next())  
    System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getString(4)+"  "+rs.getString(5));  
    con.close();  
    }catch(Exception e){ System.out.println(e);}  
    }  
    }  
