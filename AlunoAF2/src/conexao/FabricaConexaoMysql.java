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
    
    private static final String URL_DB = "jdbc:mysql://localhost:3306/aluno";
<<<<<<< HEAD
    private static final String USER_BD = "root";
    private static final String PWD_BD = "";
=======
    private static final String USER_BD = "root1";
    private static final String PWD_BD = "root";
>>>>>>> 88bfa0f1ec6b0d6265728edcac9225d5056b2177
    
    public static Connection getConnection(){
        
        try{
            Connection conexao;
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexao = DriverManager.getConnection(URL_DB, USER_BD, PWD_BD);
            return conexao;
        } catch(ClassNotFoundException e){
            System.out.println("O driver expecificado nao foi encontrado.\n");
            System.out.println(">>> " + e + " <<< \n");
        } catch(SQLException e){
            System.out.println("Nao foi possivel conectar ao Banco de Dados.\n");
            System.out.println(">>> " + e + " <<< \n");
        }
        return null;
    }
}
