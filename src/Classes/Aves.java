package Classes;

public class Aves extends Animales {

     public Aves(){
         super();
     }

     public void volar(String nombre){
         System.out.println("El "+nombre+" esta volando");
     }

    @Override
    public void hacerRuido() {
        System.out.println("En la zona de los pajaros estan todos los animales piando");
    }

    @Override
    public void comer(String nombre) {
        super.comer("ñandu");
    }

    @Override
    public void dormir(String nombre) {
        super.dormir("tucan");
    }

    @Override
    public void jugar(String nombre) {
        super.jugar("perico");
    }
}
