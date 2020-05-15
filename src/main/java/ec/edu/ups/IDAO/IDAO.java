/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.IDAO;

import ec.edu.ups.Modelo.Etapa;
/**
 *
 * @author José Andrés Abad
 */
public interface IDAO {
    public void create(Etapa etapa);
    public Etapa read(String nombre);
    public void update(String nombre);
    public void delete(String nombre);
}
