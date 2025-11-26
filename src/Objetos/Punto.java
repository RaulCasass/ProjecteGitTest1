/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

/**
 *
 * @author rca4813
 */
public class Punto {
    private int x;
    private int y;

    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    public void imprime(){
        System.out.println("(" + x + "," + y + ")");
    }
    
    public void setXY(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    public void desplaza(int dx, int dy){
        this.x += dx;
        this.x += dy;
    }
    
    public void resta(Punto p){
        this.x -= p.getX();
        this.y -= p.getY();
    }
    
    public void suma(Punto p){
        this.x += p.getX();
        this.y += p.getY();
    }
}
