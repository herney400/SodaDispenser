/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sodadispenser;

import java.util.ArrayList;

/**
 *
 * @author fidelhpc
 */
public class Nodo {
    
    private int cantidadLitros;
    private String operador;
    private int utilidad;
    private String tipojugador;/*MAX o MIN*/
    boolean noneMin;
    boolean noenMax;
    private Nodo padre; 
   
     ArrayList<Nodo> hijos = new ArrayList<>();    
    private int profundida;
     public Nodo(int cantidadLitros, String jugador, String operador,int profundida,
                /* int utilidad,*/ Nodo padre, boolean  noneMin, boolean noneMax) {
    
       this.cantidadLitros=cantidadLitros;
     //  this.utilidad=utilidad;
       this.tipojugador=jugador;
       this.operador=operador; 
       this.padre=padre;
       this.noneMin=noneMin;
       this.noenMax=noneMax;
       this.profundida=profundida;
       
       if(jugador.equals("MAX")){
          this.setUtilidad(Integer.MIN_VALUE);
       
       }else{
          this.setUtilidad(Integer.MAX_VALUE);
       }
      
     
     }

    public Nodo(int cantidadLitros, String jugador, boolean  noneMin, boolean noneMax) {
    
       this.cantidadLitros=cantidadLitros;
      // this.utilidad=utilidad;
       this.tipojugador=jugador;
       this.operador=operador;      
       this.noneMin=noneMin;
       this.noenMax=noneMax;
       
       if(jugador.equals("MAX")){
          this.setUtilidad(Integer.MIN_VALUE);
       
       }else{
          this.setUtilidad(Integer.MAX_VALUE);
       }
       
     }
     public ArrayList<Nodo> movimientoMaquina(){
        String tipo= this.getJugador();
        String tipoinicialjugador="incognito";
        ArrayList <Nodo> hijos=new ArrayList<Nodo>();
        
        if(tipo.equals("MAX")){
            tipoinicialjugador="MIN";
        
        }else if(tipo.equals("MIN")){
            tipoinicialjugador="MAX";
        }
        
        if(cantidadLitros>=3){
           Nodo hijo1 = new Nodo(cantidadLitros-3, tipoinicialjugador, "3l", profundida+1,  /*utilidad,*/ this, noneMin, noenMax);
           hijos.add(hijo1);
          
        } if(cantidadLitros>=2){
           Nodo hijo2=new Nodo(cantidadLitros-2, tipoinicialjugador, "2l", profundida+1, /*utilidad, */this, noneMin, noenMax);
           hijos.add(hijo2);
        } if(cantidadLitros>=1){
           Nodo hijo3=new Nodo(cantidadLitros-1, tipoinicialjugador, "1l", profundida+1, this, noneMin, noenMax) ;
           hijos.add(hijo3);
        } if(cantidadLitros>0){
            if(tipo.equals("MIN")&& !noneMin){
               Nodo hijo=new Nodo(cantidadLitros,tipoinicialjugador, "noneMin", profundida+1, this, !noneMin, noenMax); 
               hijos.add(hijo);
            }if(tipo.equals("MAX")&&!noenMax){
               Nodo hijo=new Nodo(cantidadLitros,tipoinicialjugador, "noneMax", profundida+1, this, noneMin, !noenMax);
               hijos.add(hijo);
            }
        
        }
        
        
    return hijos;
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
    public String getOperador() {
        return operador;
    }

    /**
     * @param operador the operador to set
     */
    public void setOperador(String operador) {
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
        return tipojugador;
    }

    /**
     * @param jugador the jugador to set
     */
    public void setJugador(String jugador) {
        this.tipojugador = jugador;
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

    /**
     * @return the padre
     */
    public Nodo getPadre() {
        return padre;
    }

    /**
     * @param padre the padre to set
     */
    public void setPadre(Nodo padre) {
        this.padre = padre;
    }
    
}
