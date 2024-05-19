package main;

import controller.RegistroDao;
import java.util.ArrayList;
import model.Registro;
import view.RegistroForm;

public class Principal {
    
    public static Registro registro = new Registro();
    public static RegistroDao registroDao = new RegistroDao();
    public static ArrayList<Registro> registros = new ArrayList<Registro>();
    
    public static void main(String[] args) {
        RegistroForm registroForm = new RegistroForm();
        registroForm.setVisible(true);
        registroForm.setLocationRelativeTo(null);
    }
}