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
public class Ejemplo0411 {

    public static void main(String[] args) {
        // 
         // se invoca al método (procedimiento) obtenerSuma
        
    
     int arreglo1[][] = {{1,2,3},{3,2,4},{2,6,2}};
        int arreglo2[][] = {{1,2,3},{2,2,2},{3,1,2}};
        int[][] arreglo3 = new int[3][3];
        int tabla;
        for (int i = 0; i <arreglo1.length; i++) {
            for (int j = 0; j < arreglo1[i].length; j++) {
                 tabla = obtenerMultiplicacion(arreglo1[i][j], arreglo2[i][j]);
                arreglo3[i][j] = tabla;        
            }
        }
         System.out.println("\n");
         for (int i = 0; i < arreglo3.length; i++) {
             for (int j = 0; j < arreglo3[i].length; j++) {
                 System.out.printf("%d\t",arreglo3[i][j]);
             }
             System.out.println("\n");
        }
    }
        
    public static int obtenerMultiplicacion(int a, int b){
        int multiplicacion;
        multiplicacion = a * b;
         return multiplicacion;
        
    }
}
        
  

