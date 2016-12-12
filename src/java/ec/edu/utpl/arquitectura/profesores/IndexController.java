/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.utpl.arquitectura.profesores;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Rafael
 */
@ManagedBean(name = "index")
@SessionScoped
public class IndexController {
    
   
    private List<Profesores> productos=new ArrayList<>();
   
    @EJB profesoresBeanRemote csb;

    public List<Profesores> getProductoList() {
        productos = csb.obtenerTodo();
        return productos;
    }
   
    
    

   
    
    
}
