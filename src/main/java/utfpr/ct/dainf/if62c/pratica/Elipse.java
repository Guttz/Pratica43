/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.ct.dainf.if62c.pratica;

/**
 *
 * @author a1654314
 */
public class Elipse implements FiguraComEixos{
    double s, r;
    
    public Elipse(double a, double b){ 
        this.s = a; 
        this.r = b;
    }
    
    @Override
    public double getArea(){
        double A;
    
        A = Math.PI*r*s;
    
        return A;
    }
    
    @Override
    public double getPerimetro(){
        double P;
        
        P = Math.PI*(3*(r + s) - Math.sqrt((3*r + s)*(r + 3*s)));
        
        return P;
    }
    
    @Override
    public double getEixoMenor(){
        if(r<s)
            return s;
        
        else
            return r;
    }
    
    @Override
    public double getEixoMaior(){
        if(r>s)
            return r;
        
        else
            return s;
    }
    
    @Override
    public String getNome(){
        return toString();
    }
}
