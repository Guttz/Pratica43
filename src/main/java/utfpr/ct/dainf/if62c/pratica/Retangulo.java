package utfpr.ct.dainf.if62c.pratica;

public class Retangulo implements FiguraComLados {
    double b, h;
    
    public Retangulo(double b, double h){ 
        this.b = b; 
        this.h = h;
    }
    
    @Override
    public double getArea(){
        double A;
    
        A = b*h;
    
        return A;
    }
    
    @Override
    public double getPerimetro(){
        double P;
        
        P = 2*b + 2*h;
        
        return P;
    }
    
    @Override
    public double getladoMenor(){
        if(b<h)
            return b;
        
        else
            return h;
    }
    
    @Override
    public double getladoMaior(){
        if(h>b)
            return h;
        
        else
            return b;
    }
    
    @Override
    public String getNome(){
        return this.getClass().getSimpleName();
    }
}
