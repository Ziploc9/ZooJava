package Classes;

public class Peces extends Animales {


    public Peces() {
        super();
    }


    public void nadar(String nombre){
        System.out.println("El "+nombre+" esta nadando");
    }

    @Override
    public void hacerRuido() {
        System.out.println("No puedes escuchar el ruido de los peces por la gente de tu alrededor");
    }

    @Override
    public void comer(String nombre) {
        super.comer(nombre);
    }

    @Override
    public void dormir(String nombre) {
        super.dormir(nombre);
    }

    @Override
    public void jugar(String nombre) {
        super.jugar(nombre);
    }
}
