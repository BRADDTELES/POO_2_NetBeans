
package main;

import java.util.Scanner;
import model.Calculadora;
import model.Calculadora.TestaCalculadora;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Calculadora calculadora = new Calculadora();
        Calculadora.TestaCalculadora testaCalculadora = calculadora.new TestaCalculadora();
        boolean somouCorretamente = testaCalculadora.testaSoma(2.0, 2.0);
        System.out.println("Resultado de teste de soma: "+somouCorretamente);
        
        boolean subtraiuCorretamente = testaCalculadora.testaSubtracao(2.0, 2.0);
        System.out.println("Resultado de teste da subtração: "+subtraiuCorretamente);
        
        sc.close();
    }
}
