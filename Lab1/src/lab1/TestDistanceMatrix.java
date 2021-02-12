/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;


import java.util.LinkedList;

public class TestDistanceMatrix {

    public static void main(String[] args) {
        
        //Creamos las tres ciudades con sus puntos
        GeometricPoint punto1 = new GeometricPoint(2, 5, "Londres"); 
        GeometricPoint punto2 = new GeometricPoint(8, 4, "Viena");
        GeometricPoint punto3 = new GeometricPoint(3, 1, "Roma"); 
        
        //Creamos la lista de clases de GeometricPoint
        LinkedList<GeometricPoint> list = new LinkedList<GeometricPoint>();
        
        //Añadimos a la lista los dos primeros puntos
        list.add(punto1);
        list.add(punto2);

        DistanceMatrix mat = new DistanceMatrix(list);
        //Creamos la matriz en este caso 2x2 y la imprimimos
        mat.createDistanceMatrix();
        System.out.print("Matriz de ciudades 2x2\n");
        mat.printMatrix();
        
        //Añadimos otra ciudad
        mat.addCity(punto3);
        //Creamos la matriz en este caso 3x3 y la imprimimos
        System.out.printf("\nMatriz de ciudades 3x3\n");
        mat.printMatrix();
        System.out.println("\n");
        
        //Imprimimos el numero de ciudades
        System.out.printf("Nº de Ciudades: %d\n\n",mat.getNoOfCities() );
        
        //Imprimimos las ciudades, llamando a la funcion que nos coge su nombre
        System.out.println("---------Lista-------");
        mat.getCityName(0);
        mat.getCityName(1);
        mat.getCityName(2);
        mat.getCityName(5);
        System.out.println("----------------------");

        //Calculamos la distancia
        System.out.println("--Calculo distancias--");
        System.out.println("En el caso de ERROR saldrá cero");
        
        System.out.printf("Distancia con el punto (4,3)= ");
        System.out.println(mat.getDistanceMatrix(4,3)); 
        System.out.printf("Distancia con el punto (2,1)= ");
        System.out.printf("%.2f",mat.getDistanceMatrix(2, 1));
      
        System.out.println("\n-----------------------");



    }

}
