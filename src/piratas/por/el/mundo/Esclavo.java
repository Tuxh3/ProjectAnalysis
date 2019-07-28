//
//
//  
//
//  @ Project : Piratas por el Mundo
//  @ File Name : ProyectoAnalisis
//  @ Date : 22/06/2019
//  @ Author : Kelly - Tuxh
//
//
package piratas.por.el.mundo;



/** */
public class Esclavo {
	/** */
	private String edad;
	
	/** */
	private int tiempoVida;

    public Esclavo(String edad) {
        this.edad = edad;
        this.tiempoVida = tiempoVida(edad);
    }
        
        
	
	/** */
	public int tiempoVida(String edad) {
            
        if(edad=="joven"){
         tiempoVida=5;}
         if(edad=="adulto"){
         tiempoVida=3;}
         if(edad=="viejo"){
         tiempoVida=1;}
                        
                       
            return getTiempoVida();
	}

    /**
     * @return the edad
     */
    public String getEdad() {
        return edad;
    }

    /**
     * @return the tiempoVida
     */
    public int getTiempoVida() {
        return tiempoVida;
    }
}
