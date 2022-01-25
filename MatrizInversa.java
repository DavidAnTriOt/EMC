/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matrizinversa;
import java.util.Scanner;
/**
 *
 * @author David
 */
public class MatrizInversa {

    
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int n;
        
        int contador = -1;
        
        System.out.print("Ingrese el valor del numero de filas y columnas: ");
        n = entrada.nextInt();
        
        int[][] matriz = new int[n][n];
        int[] vector = new int[n*n];
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++)
                matriz[i][j] = 1 + (int)(Math.random()*1000);
        }
        
        for(int i = n - 1; i> -1; i--){
            for(int j = n - 1; j > -1; j--){
                contador = contador + 1;
                vector[contador] = matriz[i][j];
            }
        }
        for(int i = 0; i < n*n; i++)
            System.out.print(vector[i]+"    ");
        System.out.println("");
    }
}
