/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;


public class TestPoint {

    public static void main(String[] args) {
        
        //Creamos los dos ciudades
        GeometricPoint punto1 = new GeometricPoint(2, 6, "Madrid");
        GeometricPoint punto2 = new GeometricPoint(3, 9, "Valencia");
        
        //Nos imprime los puntos de cada una de las ciudades, llamando a la funcion de print
        System.out.printf("\nLISTA PUNTOS\n");
        System.out.printf("-----------------------------");
        //Punto1
        System.out.printf("\nLugar:"); 
        System.out.println(punto1.getname()); 
        System.out.printf("Punto:(%.2f,%.2f)\n",punto1.getx(),punto1.gety());
        //Punto2
        System.out.printf("\nLugar:");
        System.out.println(punto2.getname()); 
        System.out.printf("Punto:(%.2f,%.2f)\n",punto2.getx(),punto2.gety());
        System.out.printf("-----------------------------");
        
        //Probamos los setters
        //Probamos a establecerle diferentes valores a los dos puntos
        punto1.setx((double) 6.9);
        punto1.sety((double) 4.2);
        punto2.setx((double) 3.5);
        punto2.sety((double) 8.5);
        
        //Probamos a cambiarle el nombre al punto2 que era Valencia
        punto2.setname("Barcelona");
        
        //Imprimimos la lista una vez hechos los cambios
        System.out.printf("\n"); 
        System.out.printf("Actualizamos la lista\n");
        System.out.printf("-----------------------------");
        punto1.print();
        punto2.print();
        System.out.printf("-----------------------------");
        
        //Imprimimos distancia
        System.out.printf("\n\nLa distancia entre %s y %s es de:", punto1.getname(), punto2.getname());
        System.out.printf("%.2f\n\n",punto1.distancia(punto2));
    }
    
}
