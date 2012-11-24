/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sodadispenser;

import java.util.ArrayList;
import java.util.Hashtable;
import sodadispenser.Nodo.*;
/**
 *
 * @author fidelhpc
 */
public class AlgoritmoMinimax {
     ArrayList<Nodo> arbolMinimax;
     
     Hashtable arbol = new Hashtable();
     String aux;
     
    public AlgoritmoMinimax() {
    
    }
    
    public void crearArbol(Nodo nodo){
    
        while(!(arbolMinimax.isEmpty())){
             Nodo nodoActual=arbolMinimax.get(0);
             
             arbol.put(nodoActual.getProfundida(), nodoActual);
             
             if(nodoActual.Eshoja()){
                nodoActual.setUtilidad(Utilidad(nodoActual));  
                arbolMinimax.remove(0);
             }else{     
                   arbolMinimax.remove(0);
                   ArrayList<Nodo> hijos = movimientoMaquina(nodoActual);
             
                   arbolMinimax.addAll(hijos);                
                 }       
        }
        
    }
    
    
    public boolean verificaParada(){
    
             for(int i=0; arbolMinimax.size()>=0;i++)  
             {
             
                 if(!(arbolMinimax.get(i).Eshoja()))
                 {
                 aux="No todos son hojas";
                 }else aux="Todos son hojas";             
             }
      return true;
    }
    
  
    
    
    
    public int Utilidad(Nodo nodo)
    {
    
    if (nodo.Eshoja()&&nodo.getJugador().equals("MAX"))
    {
    
    return -1;
    }else return 1;
        
    
    }
    
    
    public void CalcularUtilidad()
            
    {
    
    
        
        
    }
    
    
    public ArrayList<Nodo> movimientoMaquina(Nodo nodo){
     
        
        ArrayList <Nodo> hijos=new ArrayList<Nodo>();
        
        if(nodo.getCantidadLitros()>=3){
        
        
        }else if(nodo.getCantidadLitros()>=2){
        
        
        }else if(nodo.getCantidadLitros()>=1){
        
        }
    
        
        
     
//    if(cantidadLIitros!=1){
//     
//    
//    }
//        
//        
//        
//        
    return hijos;
    }
    
    
    
}


