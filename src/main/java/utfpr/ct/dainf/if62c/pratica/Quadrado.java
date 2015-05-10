package utfpr.ct.dainf.if62c.pratica;

/**
 * IF62C Fundamentos de Programação 2
 * Exemplo de interface em Java.
 * @author Wilson Horstmeyer Bogado <wilson@utfpr.edu.br>
 */
public class Quadrado implements FiguraComEixos{
    double l;
    
    public Quadrado(double l){ 
        this.l = l; 
}
    
    @Override
    public double getArea(){
        double A;
    
        A = l*l;
    
        return A;
    }
    
    @Override
    public double getPerimetro(){
        double P;
        
        P = 4*l;
        
        return P;
    }
    
    @Override
    public double getladoMenor(){
            return l;
    }
    
    @Override
    public double getladoMaior(){
            return l;
    }
    
    @Override
    public String getNome(){
        return toString();
    }
}