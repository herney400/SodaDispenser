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
      Nodo nodoRaiz=nodo;
      String jugadaMax="";
      while(!(arbolMinimax.isEmpty())){
             Nodo nodoActual=arbolMinimax.get(0);
             
             arbol.put(nodoActual.getProfundida(), nodoActual);
             
             if(!nodoActual.Eshoja()){
                
                 arbolMinimax.remove(0);
                  ArrayList<Nodo> hijos = nodoActual.movimientoMaquina();             
                  arbolMinimax.addAll(hijos);
             }else{  /* Si el que hizo la primera jugada #nodoRaiz es MAX el #nodoActual es MAx y esta por
                      * jugar pero se encontro que es una hoja entonces se determina la utilidad entre -1 y 1 
                      */   
                    if(nodoRaiz.getJugador().equals("MAX")&&nodoActual.getJugador().equals("MAX")){
                      nodoActual.setUtilidad(1);                   
                    }else{
                      nodoActual.setUtilidad(-1); 

                    }
                                     
                 }       
        }
      jugadaMax=CalculaDesicionminimax(arbol);   
    }
    
    public String CalculaDesicionminimax(Hashtable arbolCompleto){
    
        
        
        
        
        
        
    return " ";
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


