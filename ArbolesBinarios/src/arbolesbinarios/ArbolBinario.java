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
    
    private Nodo nodo;
    
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
    
    public String inOrder(){
        return inOrderH(this.nodo);
    }
    
    private String inOrderH(Nodo n){    
        if (n == null)
            return "";
        else
            return inOrderH(n.izq) + n.dato + ", " + inOrderH(n.der);
    }
    
    
    public String preOrder(){
        return preOrderH(this.nodo);
    }
    
    private String preOrderH(Nodo n){
        
        if (n == null)
            return "";
        else
            return n.dato + ", " + preOrderH(n.izq) + preOrderH(n.der);
    }
    
    
    public String postOrder(){
        return postOrderH(this.nodo);
    }
       
    private String postOrderH(Nodo n){
        
        if (n == null)
            return "";
        else
            return  postOrderH(n.izq) + postOrderH(n.der) + n.dato + ", ";
    }
    
    
    public Integer contar(){
        return contarH(this.nodo);
    }
    
    private Integer contarH(Nodo n){
        if(n == null)
            return 0;
        else
            return 1 + contarH(n.izq) + contarH(n.der);       
    }
    
    public Integer hojas(){
        return hojasH(this.nodo);
    }
      
    private Integer hojasH(Nodo n){   
        if(n == null)
            return 0;
        else if((n.izq == null) && (n.der == null))
            return 1;
        else
            return hojasH(n.izq) + hojasH(n.der);
    }
    
    
    public Integer profundidad(){
        return profundidadH(this.nodo);
    }
    
    private Integer profundidadH(Nodo n){
        if (n== null)
            return 0;
        else if(profundidadH(n.izq) > profundidadH(n.der))
            return 1 + profundidadH(n.izq);
        else
            return 1 + profundidadH(n.der);
    }
    
    
}
