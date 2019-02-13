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
public class Vivienda {
    // atributos de clase
    private static int numVivi;
    private static final float precio=1000;

    

    // atributos
    private int metros;
    private int habita;
    private String direccion;
    private Propietarios prop;


    
    public Vivienda(int metros, int habita, String direccion, Propietarios p) {
        this.metros = metros;
        this.habita = habita;
        this.direccion = direccion;
        this.prop=p;
    }

    public Propietarios getProp() {
        return prop;
    }

    public void setProp(Propietarios prop) {
        this.prop = prop;
    }
     
    public static int getNumVivi() {
        return numVivi;
    }

    public static void setNumVivi(int numVivi) {
        Vivienda.numVivi = numVivi;
    }

    public int getMetros() {
        return metros;
    }

    public void setMetros(int metros) {
        this.metros = metros;
    }

    public int getHabita() {
        return habita;
    }

    public void setHabita(int habita) {
        this.habita = habita;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    public static float getPrecio() {
        return precio;
    }
    
    public float precioFinal(){
       float pf=0;
       pf = getPrecio() * getMetros();
       
       return pf;
    
    } 

    @Override
    public String toString() {
        return "Vivienda{" + "metros=" + metros + ", habita=" + habita + ", direccion=" + direccion + '}';
    }
    
}
