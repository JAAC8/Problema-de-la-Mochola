/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.Controlador;

import ec.edu.ups.EtapaDAO.EtapaDAO;
import  ec.edu.ups.Vista.Vista;
import ec.edu.ups.Modelo.Etapa;
/**
 *
 * @author José Andrés Abad
 */
public class Controlador {
    
    Vista vista;
    EtapaDAO etapaDAO;
    public Controlador(Vista vista){
        this.vista = vista;
        this.etapaDAO = new EtapaDAO();
    }
    
    public void agregarEtapa(){
        Etapa etapa =vista.agregarEtapa();
        etapaDAO.create(etapa);
    }
    
    
}
