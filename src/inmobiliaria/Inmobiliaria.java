/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inmobiliaria;

/**
 *
 * @author natalia
 */
public class Inmobiliaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Piso piso;
        Chalet chale;
        Propietarios pp;
        String direc;
        
        ListaPisos miListaP = new ListaPisos();
        pp= new Propietarios("123456789", "Mi nombre");
        for (int i = 0; i < 10; i++) {
            piso = new Piso(i, true, i*10, i+5, "Desconocida"+i, pp);
            miListaP.anyadirPiso(piso);
        }
        
        miListaP.mostrarPisos();
        
        direc = "Desconocida8";
        piso = miListaP.buscaPiso(direc);
        if (piso!=null)
            System.out.println("Encontrado "+piso.toString());
           else
            System.out.println("No encontrado");
            
        
        
        
        
        
    }
    
}
