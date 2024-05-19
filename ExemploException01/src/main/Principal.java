package main;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Double altura;
        boolean leuAlturaCorreta = false;
        Scanner sc = new Scanner(System.in);
        do{
            try{
                System.out.println("Informe sua altura: ");
                sc = new Scanner(System.in);
                altura = sc.nextDouble();
                leuAlturaCorreta = true;
            }catch(java.util.InputMismatchException e){
                System.out.println("Altura informada incorretamente!");
                System.out.println("Erro Encontrado: "+e.toString());
            }catch(Exception e){
                System.out.println("Erro genérico!");
                System.out.println("Erro Encontrado: "+e.toString());
            }
        }while(leuAlturaCorreta == false);
       

        
        sc.close();
    }
}
