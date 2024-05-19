package controller;

import conexao.FabricaConexaoMysql;
import java.sql.*;
import java.util.ArrayList;
import model.Registro;

public class RegistroDao {
    
    public boolean inserir(Registro registro){
        Connection conexao = (Connection) FabricaConexaoMysql.getConnection();
        try {
            PreparedStatement pstm = (PreparedStatement) conexao.prepareStatement("INSERT INTO registro (nome,matricula,curso,fone,email) values (?,?,?,?,?)");
            pstm.setString(1, registro.getNome());
            pstm.setInt(2, registro.getMatricula());
            pstm.setString(3, registro.getCurso());
            pstm.setString(4, registro.getFone());
            pstm.setString(5, registro.getEmail());
            int linhas = pstm.executeUpdate();
            conexao.close();
            if(linhas > 0){
                return true;
            }else{
                return false;
            }
        } catch (SQLException e) {
            System.out.println("ERRO: " + e);
        } finally {
            if (conexao != null) {
                try {
                    conexao.close();
                } catch (SQLException e) {
                    System.err.println(e);
                }
            }
        }
        return false;
    }
    
    public boolean atualizar(Registro registro){
        Connection conexao = (Connection) FabricaConexaoMysql.getConnection();
        try {
            PreparedStatement pstm = (PreparedStatement) conexao.prepareStatement("UPDATE registro SET nome = ? , matricula = ? , curso = ? , fone = ? , email = ? WHERE id = ?");
            pstm.setString(1, registro.getNome());
            pstm.setInt(2, registro.getMatricula());
            pstm.setString(3, registro.getCurso());
            pstm.setString(4, registro.getFone());
            pstm.setString(5, registro.getEmail());
            pstm.setInt(6, registro.getId());
            int linhas = pstm.executeUpdate();
            conexao.close();
            if(linhas > 0){
                return true;
            }else{
                return false;
            }
        } catch (SQLException e) {
            System.out.println("ERRO: " + e);
        } finally {
            if (conexao != null) {
                try {
                    conexao.close();
                } catch (SQLException e) {
                    System.err.println(e);
                }
            }
        }
        return false;
    }
    
    public Registro buscar(int id){
        Registro registro = new Registro();
        Connection conexao = (Connection) FabricaConexaoMysql.getConnection();
        try {
            PreparedStatement pstm = (PreparedStatement) conexao.prepareStatement("SELECT * FROM registro WHERE id = ?");
            pstm.setInt(1, id);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                registro = new Registro();
                registro.setId(rs.getInt("id"));
                registro.setNome(rs.getString("nome"));
                registro.setMatricula(rs.getInt("matricula"));
                registro.setCurso(rs.getString("curso"));
                registro.setFone(rs.getString("fone"));
                registro.setEmail(rs.getString("email"));
            }
            conexao.close();
            return registro;
        } catch (SQLException e) {
            System.err.println(e);
        } finally {
            if (conexao != null) {
                try {
                    conexao.close();
                } catch (SQLException e) {
                    System.err.println(e);
                }
            }
        }
        return null;
    }

    public boolean excluir(int id) {
        Connection conexao = (Connection) FabricaConexaoMysql.getConnection();
        try {
            PreparedStatement pstm = (PreparedStatement) conexao.prepareStatement("DELETE FROM registro WHERE id = ?");
            pstm.setInt(1, id);
            int linhas = pstm.executeUpdate();
            conexao.close();
            return (linhas > 0)? true : false;
        } catch (SQLException e) {
            System.err.println(e);
        } finally {
            if (conexao != null) {
                try {
                    conexao.close();
                } catch (SQLException e) {
                    System.err.println(e);
                }
            }
        }
        return false;
    }

    public ArrayList<Registro> getListaDeRegistros(){
        Registro registro = new Registro();
        ArrayList<Registro> registros = new ArrayList<Registro>();
        Connection conexao = (Connection) FabricaConexaoMysql.getConnection();
        try {
            PreparedStatement pstm = (PreparedStatement) conexao.prepareStatement("SELECT * FROM registro");
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                registro = new Registro();
                registro.setId(rs.getInt("id"));
                registro.setNome(rs.getString("nome"));
                registro.setMatricula(rs.getInt("matricula"));
                registro.setCurso(rs.getString("curso"));
                registro.setFone(rs.getString("fone"));
                registro.setEmail(rs.getString("email"));
                registros.add(registro);
            }
            conexao.close();
            return registros;
        } catch (Exception e) {
            System.err.println(e);
        } finally {
            if (conexao != null) {
                try {
                    conexao.close();
                } catch (SQLException e) {
                    System.err.println(e);
                }
            }
        }
        return null;
    }
}