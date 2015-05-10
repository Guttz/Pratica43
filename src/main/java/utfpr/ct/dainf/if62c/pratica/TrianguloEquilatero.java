package utfpr.ct.dainf.if62c.pratica;

public class TrianguloEquilatero implements FiguraComLados {

    private double l;
    
    public TrianguloEquilatero(double l){ 
        this.l = l; 
}
    
    @Override
    public double getArea(){
        double A;
    
        A = (l*l*Math.sqrt(3))/4;
    
        return A;
    }
    
    @Override
    public double getPerimetro(){
        double P;
        
        P = 3*l;
        
        return P;
    }
    
    @Override
    public double getLadoMenor(){
            return l;
    }
    
    @Override
    public double getLadoMaior(){
            return l;
    }
    
    @Override
    public String getNome(){
        return this.getClass().getSimpleName();
    }

}
