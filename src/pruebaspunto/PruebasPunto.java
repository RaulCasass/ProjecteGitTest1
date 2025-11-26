/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebaspunto;

import Objetos.Punto;

/**
 *
 * @author rca4813
 */
public class PruebasPunto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Punto point1 = new Punto(5,0);
        Punto point2 = new Punto(10,10);
        Punto point3 = new Punto(-3,7);
        
//        point1.x = 5;
//        point1.y = 0;
//        point2.x = 10;
//        point2.y = 10;
//        point3.x = -3;
//        point3.y = 7;
//        
        point1.imprime();
        point2.imprime();
        point3.imprime();
        point2.resta(point1);
        point2.imprime();
    }
    
}
