/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;


import java.util.LinkedList;

public class DistanceMatrix {

    private LinkedList<GeometricPoint> list;
    private double matrix[][];

    //Calcular la distancia
    public DistanceMatrix(LinkedList<GeometricPoint> list1) {
        list = list1;
        createDistanceMatrix(); 
    }
    
    //Añadir una ciudad a la lista
    public void addCity(GeometricPoint punto) {
        list.add(punto); 
        createDistanceMatrix(); 

    }   
    
    //Funcion que coge el nombre de la ciudad, siempre y cuando exista
    public void getCityName(int index) {
        if (index > list.size() - 1 || index < 0) {
            System.out.printf("ERROR: Esta ciudad no existe");
            System.out.printf("\n");
        } else {
            System.out.printf("·");
            System.out.println(list.get(index).getname());
        }
    }
    
    //Funcion para poder saber el numero de ciudades en la lista
    public int getNoOfCities() {

        return list.size(); 
    }
    //Funcion que crea la matriz para poder imprimirla posteriormente
    public void createDistanceMatrix() {
        this.matrix = new double[list.size()][list.size()]; 

        for (int i = 0; i < list.size(); ++i) {
            for (int j = 0; j < list.size(); ++j) {
                matrix[i][j] = list.get(i).distancia(list.get(j)); 

            }
        }
    }
    
    //Funcion que coge la distancia de la matriz
    public double getDistanceMatrix(int index1, int index2) {
        if (index1 > list.size() - 1 || index1 < 0) {
            return 0;
        }
        if (index2 > list.size() - 1 || index2 < 0) {
            return 0;
        }
        return (matrix[index1][index2]); 
    }
    //Funcion que imprime la matriz
    public void printMatrix() {

        for (int i = 0; i < list.size(); i++) {
            System.out.print("(");
            for (int j = 0; j < list.size(); j++) {
				//Solo queremos que nos coja dos decimales
                System.out.printf("%.2f",matrix[i][j]);

                if (j < (list.size() - 1)) {
                    System.out.print(" | ");
                }

            }
            System.out.print(")");
            System.out.print("\n");
        }
    }
}

