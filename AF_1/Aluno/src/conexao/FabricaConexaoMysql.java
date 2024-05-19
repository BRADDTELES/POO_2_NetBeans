package conexao;

import java.sql.*;

public class FabricaConexaoMysql {
    public static String status = "Não conectou...";
    private static final String URL_DB = "jdbc:mysql://cluster-db-azure.mysql.database.azure.com:3306/aluno?useSSL=true&requireSSL=false";
    private static final String USER_BD = "danillo";
    private static final String PWD_BD = "93820041D@n";
    public static Connection getConnection(){
        Connection conexao = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexao = DriverManager.getConnection(URL_DB, USER_BD, PWD_BD);
            if (conexao != null) {
                status = ("STATUS--->Conectado com sucesso!");
            }else {
                status = ("STATUS--->Não foi possivel realizar conexão");
            }
            return conexao;
        } catch(ClassNotFoundException e){
            System.out.println("O driver expecificado nao foi encontrado.\n" + e);
            return null;
        } catch(SQLException e){
            System.out.println("Nao foi possivel conectar ao Banco de Dados.\n" + e);
            return null;
        } catch(Exception e){
            System.out.println("ERRO: " + e);
        }
        return null;
    }
}