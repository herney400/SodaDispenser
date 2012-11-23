/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sodadispenser;

import java.util.ArrayList;
import sodadispenser.Nodo.*;
/**
 *
 * @author fidelhpc
 */
public class AlgoritmoMinimax {
     ArrayList<Nodo> arbolMinimax;
     
    public AlgoritmoMinimax() {
    
    }
    
    public void crearArbol(Nodo nodo){
    
        while(!(arbolMinimax.isEmpty())){
             
             Nodo nodoActual=arbolMinimax.get(0);
             
               if(esHoja(nodoActual)){
      
                nodoActual.setUtilidad(Utilidad(nodoActual));
                 
             }else{
     
                arbolMinimax.remove(0);
                ArrayList<Nodo> hijos = movimientoMaquina(nodoActual);
               // int movimiento = movimientoMaquina(nodoActual);
                arbolMinimax.addAll(hijos);
                
             }
//             System.out.println("cordenadas"+nodoActual.getEstado().getPosicionActual());
        }
        
    }
    
    public boolean esHoja(Nodo nodo){
    
    return true;
    }
    
    
    
    public int Utilidad(Nodo nodo)
    {
    
    if (nodo.Eshoja()&&nodo.getJugador().equals("MAX"))
    {
    
    return -1;
    }else return 1;
        
    
    }
    
    
    public ArrayList<Nodo> movimientoMaquina(Nodo nodo){
     
        
        ArrayList <Nodo> hijos=new ArrayList<Nodo>();
        
        
        
        
     
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


