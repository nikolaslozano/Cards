
package Cards;

import java.util.Random;

public class Baraja {
    String palo[]={"Tréboles","Corazones","Picas","Diamantes"};
    String número[]={"As","1","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
    
    Carta baraja[]=new Carta[52];
    Carta jugador1[];
    Carta reserva=new Carta();
    Random miRandom=new Random();
    
    void crearBaraja(){
        int cont=0;
        for(int i=0;i<4;i++){
            for(int j=0;j<13;j++){
                baraja[cont]=new Carta();
                baraja[cont].palo=palo[i];
                baraja[cont].número=número[j];
                cont++;
            }
        }
    }
    void barajar(){
        int cambio=miRandom.nextInt(100000);
        for(int i=0;i<cambio;i++){
            int primeraCarta=miRandom.nextInt(52);
            int segundaCarta=miRandom.nextInt(52);
            reserva=baraja[primeraCarta];
            baraja[primeraCarta]=baraja[segundaCarta];
            baraja[segundaCarta]=reserva;
        }
    }
    void repartir(int a){
        jugador1=new Carta[a];
        System.arraycopy(baraja, 0, jugador1, 0, a);
    }
    
}
