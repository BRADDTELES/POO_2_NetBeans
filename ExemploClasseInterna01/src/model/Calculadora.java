
package model;

public class Calculadora {
    
    public Double v1;
    public Double v2;
    public Double resultado;
    
    public Double somar(Double v1, Double v2){
        this.v1 = v1;
        this.v2 = v2;
        resultado = this.v1 + this.v2;
        return resultado;
    }
    
    public Double subtrair(Double v1, Double v2){
        this.v1 = v1;
        this.v2 = v2;
        resultado = this.v1 - this.v2;
        return resultado;
    }
    
    public class TestaCalculadora{
        
        public boolean testaSoma(Double v1, Double v2){
            Double resultadoTeste = v1 + v2;
            Double resultadoClasseOriginal = somar(v1, v2);
            if(resultadoTeste.doubleValue() == resultadoClasseOriginal){
                return true;
            }else{
                return false;
            }
        }
        
        public boolean testaSubtracao(Double v1, Double v2){
            Double resultadoTeste = v1 - v2;
            Double resultadoClasseOriginal = subtrair(v1, v2);
            if(resultadoTeste.doubleValue() == resultadoClasseOriginal){
                return true;
            }else{
                return false;
            }
        }
        
    }
}
