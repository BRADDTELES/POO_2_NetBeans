package main;

import controller.ContatoDao;
import java.util.ArrayList;
import model.Contato;
import view.ContatoForm;

public class Principal {
    
    public static Contato contato = new Contato();
    public static ContatoDao contatoDao = new ContatoDao();
    public static ArrayList<Contato> contatos = new ArrayList<Contato>();
    
    public static void main(String[] args) {
        ContatoForm contatoForm = new ContatoForm();
        contatoForm.setVisible(true);
        contatoForm.setLocationRelativeTo(null); 
    }
}
