/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.Test;

import ec.edu.ups.Vista.Vista;
import ec.edu.ups.Controlador.Controlador;
/**
 *
 * @author José Andrés Abad
 */
public class Test {
    public static void main(String args[]){
       Vista vista = new Vista();
       Controlador controlador = new Controlador(vista);
       
       //INGRESO DE VALORES
       int elector = vista.imprimirMenu();
       
       if(elector==1){//Agregar etapa
           controlador.agregarEtapa();
       }else{//eliminar etapa
           
       }
       //Ingreso de da
        
    }
}
