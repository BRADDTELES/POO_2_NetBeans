package conexao;

import java.sql.*;

public class FabricaConexaoMysql {
    private static final String URL_DB = "jdbc:mysql://localhost:3306/agenda";
    private static final String USER_BD = "root";
    private static final String PWD_BD = "root";
    public static Connection getConnection(){
        Connection conexao = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexao = DriverManager.getConnection(URL_DB, USER_BD, PWD_BD);
            return conexao;
        } catch(ClassNotFoundException e){
            System.out.println(e);
        } catch(SQLException e){
            System.out.println(e);
        } catch(Exception e){
            System.out.println(e);
        }
        return null;
    }
}
