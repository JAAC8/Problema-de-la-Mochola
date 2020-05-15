/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.EtapaDAO;

import ec.edu.ups.IDAO.IDAO;
import ec.edu.ups.Modelo.Etapa;
import java.util.Map;
import java.util.TreeMap;
/**
 *
 * @author José Andrés Abad
 */
public class EtapaDAO implements IDAO {
    
    private Map<Integer, Etapa> mapEtapas;
    Integer cont=1;
    
    public EtapaDAO(){
        mapEtapas= new TreeMap<Integer,Etapa>();
        cont++;
    }
    
    @Override
    public void create(Etapa etapa) {
        mapEtapas.put(cont, etapa);
        cont++;
    }

    @Override
    public Etapa read(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
