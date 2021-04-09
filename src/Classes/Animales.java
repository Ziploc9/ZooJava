package Classes;

public abstract class Animales {
    /*--atributos--*/
    private String habitad;

    /*--cnstructor de clase abstracta--*/
    public Animales(){
    }

    /*--metodo abstracto obligatorio dentro de la Clase abstracta*/
    public abstract void hacerRuido();

    /*--metodos--*/
    public void comer(String nombre){
        System.out.println("El "+nombre+" esta comiendo");
    }

    public void caminar(String nombre){
        System.out.println("El "+nombre+" esta caminando");
    }

    public void jugar(String nombre){
        System.out.println("El "+nombre+" esta jugando");
    }

    public void dormir(String nombre){
        System.out.println("El "+nombre+" esta dormir");
    }



}
