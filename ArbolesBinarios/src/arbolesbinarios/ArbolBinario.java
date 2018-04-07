/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolesbinarios;

/**
 *
 * @author Andrés
 */
public class ArbolBinario {
    
    public Nodo nodo;
    
    public ArbolBinario(){
        this.nodo = null;       
    }
    
    public boolean estaVacio(){
        return nodo == null;
    }
    
   
    public void insertar(Integer dato){
        if(estaVacio()){
            nodo = new Nodo(dato);
            
        } else {
            Nodo nuevo = new Nodo(dato);          
            Nodo aux = nodo;

            //Recorremos el árbol para insertar el nodo en la posición adecuada.  
            while((aux.izq != nuevo) && (aux.der != nuevo)){
                if(aux.dato > dato){                   
                    if (aux.izq != null)
                        aux = aux.izq;
                    else
                        aux.izq = nuevo;                       
                }                                     
                else{                
                    if (aux.der != null)
                        aux = aux.der;
                    else
                        aux.der = nuevo;                      
                }               
            }
        }              
    }
    
    public boolean buscar(Integer dato){
        Nodo aux = nodo;
        
        while(aux != null){          
            if(aux.dato == dato){                   
                return true;
            }                                     
            else{                
                if (aux.dato > dato)
                    aux = aux.izq;
                else
                    aux = aux.der;                      
            }               
        }      
        return false;       
    }
    
    public String inOrder(Nodo n){
        
        if (n == null)
            return "";
        else
            return inOrder(n.izq) + n.dato + ", " + inOrder(n.der);
    }
    
    public String preOrder(Nodo n){
        
        if (n == null)
            return "";
        else
            return n.dato + ", " + preOrder(n.izq) + preOrder(n.der);
    }
    
    public String postOrder(Nodo n){
        
        if (n == null)
            return "";
        else
            return  postOrder(n.izq) + postOrder(n.der) + n.dato + ", ";
    }
    
    
}
