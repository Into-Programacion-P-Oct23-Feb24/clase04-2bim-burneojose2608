/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos02;

/**
 *
 * @author reroes
 */
public class Ejemplo041 {

    public static void main(String[] args) {
        // 
        int arreglo[][] = {{1,2,3},{3,2,4},{2,6,2}};
        int arreglo2[][] = {{1,2,3},{2,2,2},{3,1,2}};
        int[][] arreglo3 = new int[3][3];
        for (int i = 0; i <arreglo.length; i++) {
            for (int j = 0; j < arreglo[i].length; j++) {
                arreglo3[i][j] = obtenerMultiplicacion(arreglo[i][j], arreglo2[i][j]);
            
            }
        }
        
    }
        
    public static void obtenerMultiplicacion(int a, int b){
        int suma;
        suma = a + b;
        System.out.printf("El valor de la suma es: %d\n", suma);
        
    }
    
    
}
