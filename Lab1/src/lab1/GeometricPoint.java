/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

public class GeometricPoint {

    //Creamos los tres atributos que va a tener cada clase
    private double x;
    private double y;
    private String name;
    
    public GeometricPoint(double x1, double y1, String name1) {
        x = x1; 
        y = y1;
        name = name1;
    }
    
    //GETTERS
    public double getx() {
        return x;
    }
    public double gety() {
        return y;
    }    
     public String getname() {
        return name;
    }  
    
    //SETTERS 
    public void setx(double x) {
        this.x = x;
    }
    public void sety(double y) {
        this.y = y;
    }
    public void setname(String name) {
        this.name = name;
    }
    
    //PRINTEAR EL PUNTO
    public void print() {
        
        System.out.printf("\nLugar:");
        System.out.println(name);
        System.out.printf("Punto:");
        //Solo queremos dos decimales
        System.out.printf("(%.2f,%.2f)" ,x,y);
        System.out.printf("\n");
   
    }
    
    //Funcion que nos calculara la distancia  raiz[(x2 − x1)2+ (y2 − y1)2] . 
    public double distancia(GeometricPoint punto) {
        double resultado = Math.sqrt (Math.pow(punto.x-x, 2)+Math.pow(punto.y-y, 2)); 
        return resultado;

    }

}
