/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.covinea.siscom.controladores;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.ManagedBean;
import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import javax.faces.application.FacesMessage;

/**
 *
 * @author manuel
 */
@Named
@RequestScoped
public class usuarioController {
    private List<String> permisosMaquinaria;
    private String[] permisoMaquinariaSelected;
    private List<String> permisosCronograma;
    private List<String> permisosMantenimiento;
    private boolean esUser;

    public void setEsUser(boolean esUser) {
        this.esUser = esUser;
    }

    public boolean getEsUser() {
        return esUser;
    }

  
   

    public void setPermisoMaquinariaSelected(String[] permisoMaquinariaSelected) {
        this.permisoMaquinariaSelected = permisoMaquinariaSelected;
    }

    public String[] getPermisoMaquinariaSelected() {
        return permisoMaquinariaSelected;
    }

    public List<String> getPermisosMaquinaria() {
        return permisosMaquinaria;
    }

    @PostConstruct
    public void init() {
        permisosMaquinaria = new ArrayList<String>();
        permisosMaquinaria.add("Crear");
        permisosMaquinaria.add("Modificar");
        permisosMaquinaria.add("Cambiar Estatus");
        permisosMaquinaria.add("Eliminar");
        permisosMaquinaria.add("Trasladar");
        
        
        permisosCronograma = new ArrayList<String>();
        permisosCronograma.add("Crear2");
        permisosCronograma.add("Modificar");
        permisosCronograma.add("Eliminar");

        esUser = true;

    }
    
    public void addMessage() {
        String summary = esUser ? "Checked" : "Unchecked";
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(summary));
    }
    
}
