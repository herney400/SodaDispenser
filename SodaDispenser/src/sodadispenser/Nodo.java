/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sodadispenser;

/**
 *
 * @author fidelhpc
 */
public class Nodo {
   /* cantidad de litros para cada nodo y el nombre del jugador "MAX" O "MIN"
      operador utilizado Toma1, Toma2, Toma3
   */
     int cantidadLitros, operador, utilidad;
     String jugador;
     
     public Nodo(int cantidadLitros, String jugador, int operador, int utilidad ) {
    
       this.cantidadLitros=cantidadLitros;
       this.utilidad=utilidad;
       this.jugador=jugador;
       this.operador=operador;  
     }
    
    
    
}