
import utfpr.ct.dainf.if62c.pratica.Circulo;
import utfpr.ct.dainf.if62c.pratica.Elipse;
import utfpr.ct.dainf.if62c.pratica.Quadrado;
import utfpr.ct.dainf.if62c.pratica.Retangulo;
import utfpr.ct.dainf.if62c.pratica.TrianguloEquilatero;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gustavopguto
 */
public class Pratica43 {
    public static void main(String[] args){
        Circulo C1 = new Circulo(1);
        Elipse E1 = new Elipse(1,2);
        Quadrado Q1 = new Quadrado(1);
        Retangulo R1 = new Retangulo(1,2);
        TrianguloEquilatero T1 = new TrianguloEquilatero(1);
        
        double AQ, AT, PQ, PT, AR, PR, AC, AE, PC, PE;
        
        AQ = Q1.getArea();
        AT = T1.getArea();
        AR = R1.getArea();
        PQ = Q1.getPerimetro();
        PT = T1.getPerimetro();
        PR = R1.getPerimetro();
        AC = C1.getArea();
        AE = E1.getArea();
        PC = C1.getPerimetro();
        PE = E1.getPerimetro();
        
        System.out.println("Area da Elipse: " + AE);
        System.out.println("Area do Triangulo: " + AT);
        System.out.println("Area do Quadrado: " + AQ);
        System.out.println("Area do Retangulo: " + AR);
        System.out.println("Area do Circulo: " + AC);
        System.out.println("Perimetro do Circulo: " + PC);
        System.out.println("Perimetro da Elipse: " + PE);
        System.out.println("Perimetro do Quadrado: " + PQ);
        System.out.println("Perimetro da Triangulo: " + PT);
        System.out.println("Perimetro do Retangulo: " + PR);
        
    }
}
