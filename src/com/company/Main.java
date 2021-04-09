package com.company;
import Classes.* ;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Personas personas = new Personas();
        int option = 0;


        while(option != 923219){

            menu();
            System.out.println("Ingrese opcion: ");
           option = scan.nextLine();

            switch (option){
                case 1:
                    personas.entrar();
                    switch (){

                    }
                case 2:
                    personas.irse();
            }
        }
    }

    public void menu(){
        System.out.println("1- Entrar al zoologico");
        System.out.println("2- Volver a casa");
    }
}
