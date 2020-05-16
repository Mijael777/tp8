/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp8;

import java.util.Arrays;



/**
 *
 * @author Alumno
 */
public class Matriz {
   
    int matriz[][] = new int[4][5];	
    

public Matriz(){ //pasa los valores de filas y columnas
    
matriz[0][0] = 3; //1ra fila
matriz[0][1] = 6;
matriz[0][2] = 9;
matriz[0][3] = 12;


matriz[1][0] = 15; //2da fila
matriz[1][1] = 18;
matriz[1][2] = 21;

matriz[2][0] = 24;  //3ra fila
matriz[2][1] = 27;
matriz[2][2] = 30;
matriz[2][3] = 33;
matriz[2][4] = 36;

matriz[3][0] = 39; //4ta fila
matriz[3][1] = 42;
}

public void armar(){
                
        for (int[] matriz1 : matriz) {
            System.out.print("|");
            for (int y = 0; y < matriz1.length; y++) {
                System.out.print(matriz1[y]);
                
                if (y != matriz1.length - 1) {
                    System.out.print("\t");
                          
                } 
              
            }
            System.out.println("|");
                              
                   
        }
        
  for (int p=0;p < matriz.length;p++) {
            
            for (int y = 0; y < matriz.length; y++) {
               if ( matriz[p][y] %2==0) {
                    System.out.print("El numero es la posicion "+matriz[p][y]+"es par\n");
                }
                }}
       
        
            
} //fin metodo armar


}// fin programa
