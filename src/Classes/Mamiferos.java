package Classes;

public class Mamiferos extends Animales{

    public Mamiferos(){
        super();
    }

    @Override
    public void hacerRuido() {
        System.out.println("En la zona de los mamiferos los aniamles estan haciendo mucho ruido ");
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
