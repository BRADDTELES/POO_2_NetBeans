package controller;

import conexao.FabricaConexaoMysql;
import model.Contato;
import java.sql.*;
import java.util.ArrayList;

public class ContatoDao {

    public boolean inserir(Contato contato) {
        Connection conexao = (Connection) FabricaConexaoMysql.getConnection();
        try {
            PreparedStatement pstm = (PreparedStatement) conexao.prepareStatement("INSERT INTO contato (nome,fone,email) values (?,?,?)");
            pstm.setString(1, contato.getNome());
            pstm.setString(2, contato.getFone());
            pstm.setString(3, contato.getEmail());
            int linhas = pstm.executeUpdate();
            conexao.close();
            return (linhas > 0) ? true : false;
        } catch (Exception e) {
            System.err.println(e);
        } finally {
            if (conexao != null) {
                try {
                    conexao.close();
                } catch (Exception e) {
                    System.err.println(e);
                }
            }
        }
        return false;
    }

    public boolean atualizar(Contato contato) {
        Connection conexao = (Connection) FabricaConexaoMysql.getConnection();
        try {
            PreparedStatement pstm = (PreparedStatement) conexao.prepareStatement("UPDATE contato SET nome = ? , fone = ? ,email = ? WHERE id = ?");
            pstm.setString(1, contato.getNome());
            pstm.setString(2, contato.getFone());
            pstm.setString(3, contato.getEmail());
            pstm.setInt(4, contato.getId());
            int linhas = pstm.executeUpdate();
            conexao.close();
            return (linhas > 0) ? true : false;
        } catch (Exception e) {
            System.err.println(e);
        } finally {
            if (conexao != null) {
                try {
                    conexao.close();
                } catch (Exception e) {
                    System.err.println(e);
                }
            }
        }
        return false;
    }

    public Contato buscar(int id) {
        Contato contato = new Contato();
        Connection conexao = (Connection) FabricaConexaoMysql.getConnection();
        try {
            PreparedStatement pstm = (PreparedStatement) conexao.prepareStatement("SELECT * FROM contato WHERE id = ?");
            pstm.setInt(1, id);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                contato = new Contato();
                contato.setId(rs.getInt("id"));
                contato.setNome(rs.getString("nome"));
                contato.setFone(rs.getString("fone"));
                contato.setEmail(rs.getString("email"));
            }
            conexao.close();
            return contato;
        } catch (Exception e) {
            System.err.println(e);
        } finally {
            if (conexao != null) {
                try {
                    conexao.close();
                } catch (Exception e) {
                    System.err.println(e);
                }
            }
        }
        return null;
    }

    public ArrayList<Contato> getListaContatos() {
        Contato contato = new Contato();
        ArrayList<Contato> contatos = new ArrayList<Contato>();
        Connection conexao = (Connection) FabricaConexaoMysql.getConnection();
        try {
            PreparedStatement pstm = (PreparedStatement) conexao.prepareStatement("SELECT * FROM contato");
            
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                contato = new Contato();
                contato.setId(rs.getInt("id"));
                contato.setNome(rs.getString("nome"));
                contato.setFone(rs.getString("fone"));
                contato.setEmail(rs.getString("email"));
                contatos.add(contato);
            }
            conexao.close();
            return contatos;
        } catch (Exception e) {
            System.err.println(e);
        } finally {
            if (conexao != null) {
                try {
                    conexao.close();
                } catch (Exception e) {
                    System.err.println(e);
                }
            }
        }
        return null;
    }
    
    public boolean excluir(int id) {
        Connection conexao = (Connection) FabricaConexaoMysql.getConnection();
        try {
            PreparedStatement pstm = (PreparedStatement) conexao.prepareStatement("DELETE FROM contato WHERE id = ?");
            pstm.setInt(1, id);
            int linhas = pstm.executeUpdate();
            conexao.close();
            return (linhas > 0) ? true : false;
        } catch (Exception e) {
            System.err.println(e);
        } finally {
            if (conexao != null) {
                try {
                    conexao.close();
                } catch (Exception e) {
                    System.err.println(e);
                }
            }
        }
        return false;
    }
}
