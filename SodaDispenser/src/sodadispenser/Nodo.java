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
     private int cantidadLitros;
    private int operador;
    private int utilidad;
    private String jugador;
    Nodo padre; 
     public Nodo(int cantidadLitros, String jugador, int operador, int utilidad ) {
    
       this.cantidadLitros=cantidadLitros;
       this.utilidad=utilidad;
       this.jugador=jugador;
       this.operador=operador;  
     }
     
     

    /**
     * @return the cantidadLitros
     */
    public int getCantidadLitros() {
        return cantidadLitros;
    }

    /**
     * @param cantidadLitros the cantidadLitros to set
     */
    public void setCantidadLitros(int cantidadLitros) {
        this.cantidadLitros = cantidadLitros;
    }

    /**
     * @return the operador
     */
    public int getOperador() {
        return operador;
    }

    /**
     * @param operador the operador to set
     */
    public void setOperador(int operador) {
        this.operador = operador;
    }

    /**
     * @return the utilidad
     */
    public int getUtilidad() {
        return utilidad;
    }

    /**
     * @param utilidad the utilidad to set
     */
    public void setUtilidad(int utilidad) {
        this.utilidad = utilidad;
    }

    /**
     * @return the jugador
     */
    public String getJugador() {
        return jugador;
    }

    /**
     * @param jugador the jugador to set
     */
    public void setJugador(String jugador) {
        this.jugador = jugador;
    }
    
    
    
}
