/***
 * CONEXÃO USANDO O PHPMyAdmin
 * User: root1
 * Password: root
 * Tem que Ligar o XAMPP primeiro
 * 
 * CONEXÃO USANDO O MySql
 * User: root
 * Password: root
 * MySql Local tem que estar em execução
 */
package conexao;
import java.sql.*;
public class FabricaConexaoMysql {
    private static final String URL_DB = "jdbc:mysql://localhost:3306/agenda";
    private static final String USER_BD = "root1";
    private static final String PWD_BD = "root";
    public static Connection getConnection(){
        Connection conexao = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexao = DriverManager.getConnection(URL_DB, USER_BD, PWD_BD);
            return conexao;
        } catch(ClassNotFoundException e){
            System.err.println(e);
        } catch(SQLException e){
            System.err.println(e);
        } catch(Exception e){
            System.err.println(e);
        }
        return null;
    }
}
