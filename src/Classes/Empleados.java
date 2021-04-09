package Classes;

import java.util.Scanner;

public class Empleados extends Personas{
    Scanner scan = new Scanner(System.in);
    private String cargo;


    public Empleados(){
        super();
    }


    public void alta(Scanner scan){
        this.cargo = scan.nextLine();
    }

    public void entrar(){

    }
}
