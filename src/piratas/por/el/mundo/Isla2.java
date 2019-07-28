//  @ Project : Piratas por el Mundo
//  @ File Name : ProyectoAnalisis
//  @ Date : 22/06/2019
//  @ Author : Kelly - Tuxh


package piratas.por.el.mundo;

import java.util.ArrayList;



/** */
public class Isla2 extends Arboles {
	/** */
	public String nombreIsla;
	
	/** */
	public ArrayList<Tesoro> tesoros;
	
	/** */
	public String pirataJefe;
	
	/** */
	public ArrayList<Esclavo> cantEsclavos;
	
	/** */
	public int estrellas;

    public Isla2(String nombreIsla, ArrayList<Tesoro> tesoros, String pirataJefe, ArrayList<Esclavo> cantEsclavos) {
        this.nombreIsla = nombreIsla;
        this.tesoros = tesoros;
        this.pirataJefe = pirataJefe;
        this.cantEsclavos = cantEsclavos;
        this.estrellas = ObtenerEstrellas(tesoros);
    }
        
        
	
	/** */
	public int ObtenerEstrellas(ArrayList<Tesoro> tesoros) {
            int totalFortuna = 0;
            
            for (Tesoro tesoro : tesoros) {
                totalFortuna += tesoro.getCantFortuna();
            }
            
            if(totalFortuna>0 && totalFortuna<10){
                estrellas = 1;
            }
            if(totalFortuna>10 && totalFortuna<20){
                estrellas = 2;
            }
            if(totalFortuna>20 && totalFortuna<30){
                estrellas = 3;
            }
            if(totalFortuna>30 && totalFortuna<40){
                estrellas = 4;
            }
            if(totalFortuna>40){
                estrellas = 5;
            }
            
            return estrellas;
	}
}
