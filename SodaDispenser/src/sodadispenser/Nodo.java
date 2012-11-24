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
    boolean noneMin;
    boolean noenMax;
    Nodo padre; 
    private int profundida;
     public Nodo(int cantidadLitros, String jugador, int operador,int profundida,
                 int utilidad, Nodo padre, boolean  noneMin, boolean noneMax) {
    
       this.cantidadLitros=cantidadLitros;
       this.utilidad=utilidad;
       this.jugador=jugador;
       this.operador=operador; 
       this.padre=padre;
       this.noneMin=noneMin;
       this.noenMax=noneMax;
       this.profundida=profundida;
     }

    public Nodo(int cantidadLitros, String jugador, int operador, int profundidad,
                int utilidad,  boolean  noneMin, boolean noneMax) {
    
       this.cantidadLitros=cantidadLitros;
       this.utilidad=utilidad;
       this.jugador=jugador;
       this.operador=operador;      
       this.noneMin=noneMin;
       this.noenMax=noneMax;
       this.profundida=profundidad;
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
    
    public boolean Eshoja()
    {
    
    if(this.cantidadLitros==0)
    {
      return true;
    } else 
      return false;
    
    }

    /**
     * @return the profundida
     */
    public int getProfundida() {
        return profundida;
    }
    
}
