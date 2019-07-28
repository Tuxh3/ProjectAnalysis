//
//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : Untitled
//  @ File Name : Barco.java
//  @ Date : 29/06/2019
//  @ Author : 
//
//

package piratas.por.el.mundo;


public class Barco {
	public String nombreBarco;
	public Pirata capitan;
	public int combustibleBarco;
	public int velocidadB;
	public Esclavo [] Esclavos;
	public Tesoro [] tesorosBarco;
        private int cantidadFortuna ;
        

    public Barco(String nombreBarco, Pirata capitan, Esclavo[] Esclavos) {
        this.nombreBarco = nombreBarco;
        this.capitan = capitan;
        this.combustibleBarco = combustible(Esclavos);
        this.velocidadB =velocidadBarco(cantidadDeEsclavos(Esclavos));
        this.Esclavos = Esclavos;
        this.tesorosBarco = tesorosBarco;
        this.cantidadFortuna = cantidadFortuna(tesorosBarco);
    }
        
        
	public int combustible(Esclavo [] cantEsclavos) {
            int combustible = 0;
             for (Esclavo cantEsclavo : cantEsclavos) {
                combustible += cantEsclavo.getTiempoVida();
            }
            
            return combustible;
	}
	
	public int velocidadBarco(int cantEsclavos) {
            int velocidadBarco = 0;
            
            if(cantEsclavos>0 && cantEsclavos<30){
                velocidadBarco = 5;
            }
            if(cantEsclavos>30 && cantEsclavos<60){
                velocidadBarco = 10;
            }
            if(cantEsclavos>60){
                velocidadBarco = 15;
            }
            return velocidadBarco;
	}
	
	
        
        public int cantidadDeEsclavos (Esclavo [] canEsclavos){
            int cantidadEsclavos = 0;
            for (Esclavo canEsclavo : canEsclavos) {
                cantidadEsclavos += 1;
            }
            return cantidadEsclavos;
        }
        
        
        public int cantidadFortuna (Tesoro tesoros[]){
            
            int cantidadFortuna=0;
            for (Tesoro tesoro : tesoros) {
                cantidadFortuna+=tesoro.getCantFortuna();
            }
        return cantidadFortuna;
        }
                
                
}
