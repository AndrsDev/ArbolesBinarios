/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolesbinarios;

/**
 *
 * @author Andrés Sanabria & Erick Salazar
 */
public class ArbolesBinarios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArbolBinario arbolBinario = new ArbolBinario();
        
        arbolBinario.insertar(5);
        arbolBinario.insertar(3);
        arbolBinario.insertar(7);
        arbolBinario.insertar(2);
        arbolBinario.insertar(4);
        
        /*
        System.out.println(arbolBinario.nodo.dato);
        System.out.println(arbolBinario.nodo.izq.dato);
        System.out.println(arbolBinario.nodo.der.dato);
        System.out.println(arbolBinario.nodo.izq.izq.dato);
        System.out.println(arbolBinario.nodo.izq.der.dato);
        */
        
        
        
        System.out.println(arbolBinario.buscar(4));
        System.out.println(arbolBinario.inOrder(arbolBinario.nodo));
        System.out.println(arbolBinario.preOrder(arbolBinario.nodo));
        System.out.println(arbolBinario.postOrder(arbolBinario.nodo));
        System.out.println(arbolBinario.contar(arbolBinario.nodo));
        System.out.println(arbolBinario.hojas(arbolBinario.nodo));

    }
    
}
