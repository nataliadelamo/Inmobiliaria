/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inmobiliaria;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author natalia
 */
public class ListaPisos {
    
    private ArrayList <Piso> listaP;

    public ListaPisos() {
        this.listaP = new ArrayList ();
    }

    public ListaPisos(ArrayList<Piso> listaP) {
        this.listaP = listaP;
    }
    
    public boolean anyadirPiso(Piso p){
    boolean insertado = false;
    
    insertado = listaP.add(p);
    
    return insertado;
    
    }
    
    // mostrar los pisos
    public void mostrarPisos(){
        for (Piso piso : listaP) {
            System.out.println(piso.toString());
            System.out.println();
            System.out.println(piso.precioFinal());
            System.out.println();
            System.out.println(piso.getProp().toString());
            System.out.println();
        }
    }
    
    public Piso buscaPiso(String d){
        Piso p = null, enc=null;
        boolean salir=false;
        Iterator<Piso> iterator = listaP.iterator();
        
        while (salir==false && iterator.hasNext()) {
             p = iterator.next();
             if (p.getDireccion().equalsIgnoreCase(d)){
                 salir = true;
                 enc = p;
             }
        }
 
        return enc;
    }
    
    
    
}
