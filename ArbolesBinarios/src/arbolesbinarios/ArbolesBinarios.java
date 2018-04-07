/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolesbinarios;

import java.util.Scanner;
/**
 *
 * @author Andrés Sanabria & Erick Salazar
 */
public class ArbolesBinarios {

    /**
     * @param args the command line arguments
     */
    
    public static Scanner read = new Scanner(System.in);
    public static void main(String[] args) {
        
        ArbolBinario arbolBinario = new ArbolBinario();
       
        
        //Insertamos algunos elementos al árbol
        arbolBinario.insertar(5);
        arbolBinario.insertar(3);
        arbolBinario.insertar(7);
        arbolBinario.insertar(2);
        arbolBinario.insertar(4);
        arbolBinario.insertar(1);
        
        
        String inOrder = arbolBinario.inOrder(arbolBinario.nodo);
        String preOrder = arbolBinario.preOrder(arbolBinario.nodo);
        String postOrder = arbolBinario.postOrder(arbolBinario.nodo);
        Integer contar = arbolBinario.contar(arbolBinario.nodo);
        Integer hojas = arbolBinario.hojas(arbolBinario.nodo);
        Integer profundidad = arbolBinario.profundidad(arbolBinario.nodo);

        
        
  
        System.out.println("El formato inOrder es: " + inOrder);
        System.out.println("El formato preOrder es: " + preOrder);
        System.out.println("El formato postOrder es: " + postOrder);
        
        System.out.println();
        
        System.out.println("La cantidad de nodos son: " + contar);
        System.out.println("La cantidad de hojas es: " + hojas);
        System.out.println("La profundidad del árbol es: " + profundidad);
        
        System.out.println();
        
        
        System.out.println("Ingrese un número que desea buscar: ");
        Integer num = read.nextInt();
        
        if(arbolBinario.buscar(num))
            System.out.println("Se ha encontrado el número");
        else
            System.out.println("No se ha encontrado el número");
    }
    
}
