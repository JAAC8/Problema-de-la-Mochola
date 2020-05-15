/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.Modelo;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author José Andrés Abad
 */
public class Etapa {
    String numeroEtapa;
    List<Punto> puntos;
    int cont=1;

    public Etapa(){
        puntos = new ArrayList<Punto>();
    }
    public Etapa(String numeroEtapa, List<Punto> puntos){
        this.numeroEtapa = numeroEtapa;
        this.puntos = this.puntos;
        cont ++;
    }

    public String getNumeroEtapa() {
        return numeroEtapa;
    }

    public void setNumeroEtapa(String numeroEtapa) {
        this.numeroEtapa = numeroEtapa;
    }
        
   
       
}
