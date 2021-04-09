package Classes;

public class Reptiles extends Animales{

    public Reptiles(){
        super();
    }

    @Override
    public void hacerRuido() {
        System.out.println("Llegaste a la zona de los reptiles y algunos hacen ruido");
    }

    @Override
    public void caminar(String nombre) {
        super.caminar(nombre);
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
