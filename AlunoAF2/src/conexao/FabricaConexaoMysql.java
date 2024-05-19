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
 * 
 * CONEXÃO usando o Banco de Dados Azure na nuvem
 * String URL: jdbc:mysql://cluster-db-azure.mysql.database.azure.com:3306/aluno
 * User: danillo
 * Password: rootD@n1llo
 * CONECTAR NO TERMINAL BASH, usar esses comandos abaixo:
 * mysql -h cluster-db-azure.mysql.database.azure.com -u danillo -p ''
 */
package conexao;

import java.sql.*;

public class FabricaConexaoMysql {
    
    private static final String URL_DB = "jdbc:mysql://cluster-db-azure.mysql.database.azure.com:3306/aluno";
    private static final String USER_BD = "danillo";
    private static final String PWD_BD = "rootD@n1llo";
    
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