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
import javax.inject.Named;

/**
 *
 * @author manuel
 */
@Named
@RequestScoped
public class usuarioController {
    private List<String> permisosMaquinaria;

    public List<String> getPermisosMaquinaria() {
        return permisosMaquinaria;
    }

    
    private List<String> permisosCronograma;
    private List<String> permisosMantenimiento;
    
    @PostConstruct
    public void init() {
        permisosMaquinaria = new ArrayList<String>();
        permisosMaquinaria.add("Crear");
        permisosMaquinaria.add("Modificar");
        permisosMaquinaria.add("Cambiar Estatus");
        permisosMaquinaria.add("Eliminar");
        permisosMaquinaria.add("Trasladar");
        permisosMaquinaria.add("Listar");
        
        permisosCronograma = new ArrayList<String>();
        permisosMaquinaria.add("Crear");
        permisosMaquinaria.add("Modificar");
        permisosMaquinaria.add("Eliminar");

        permisosCronograma = new ArrayList<String>();
        permisosMaquinaria.add("Crear");
        permisosMaquinaria.add("Modificar");
        permisosMaquinaria.add("Suspender");
    }
    
    
}
