/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.Vista;

import java.util.Scanner;
import ec.edu.ups.Modelo.Etapa;
import ec.edu.ups.Modelo.Punto;
import java.util.ArrayList;
import java.util.List;
//import ec.edu.ups.Modelo.Punto;

/**
 *
 * @author José Andrés Abad
 */
public class Vista {

    public int imprimirMenu() {
        Scanner scann = new Scanner(System.in);
        System.out.println("Bienvenida !  !!");
        System.out.println("nota:  Esta aplicación permite obetener las vías optimas posibles de un problema" + "\n       en base al Problema de la Diligencia.");
        boolean repetidor = true;
        while (repetidor) {
            System.out.println("\n      MENÚ" + "\n1.Agregar Etapa" + "\n2.Eliminar Etapa");
            int elector = scann.nextInt();
            if (elector != 1 || elector != 2) {
                System.out.println("NO HA SELECCIONDAO NINGUNO...");
                repetidor = true;
            } else {
                return elector;
            }
        }
        return 0;
    }

    public Etapa agregarEtapa() {//Primero se genera
        Scanner scann = new Scanner(System.in);

        Etapa etapa;
        List<Punto> puntos = new ArrayList<Punto>();
        boolean repetidor = true;

        System.out.println("Número de Etapa:");
        String numeroDeEtapa = scann.next();

        System.out.println("\nAGREGACIÓN DE PUNTOS");
        //Agregar más puntos
        while (repetidor) {

            System.out.println("Nombre del Punto:");
            String nombre = scann.next();

            boolean repetidor1 = true;
            while (repetidor1) {
                System.out.println("\n1.Agregar Distancia'+'" + "\n2.Salir");
                int elector = scann.nextInt();
                if(elector != 1 || elector!=2){
                    System.out.println("NO HA SELECCIONDAO NINGUNO...");
                }else{
                    if(elector==1){
                        System.out.println("Valor de la Distancia:");
                        int valorDistancia = scann.nextInt();
                        
                    }
                    if(elector ==2){
                        
                    }
                }
                
            }

            Punto punto = new Punto(nombre, valorDistancia);
            puntos.add(punto);

            /*System.out.println("1.Agregar Distancia" + "\n2.Salir");
            int agregar = scann.nextInt();
            if (agregar != 1 || agregar != 2) {
                System.out.println("NO HA SELECCIONDAO NINGUNO...");
            } else {
                if (agregar == 1) {
                    repetidor = true;
                } else {
                    break;
                }
            }*/
        }

        etapa = new Etapa(numeroDeEtapa, puntos);
        return etapa;
    }
    //public Etapa agregarEtapa(Etapa){//LUego se agrega}

}
