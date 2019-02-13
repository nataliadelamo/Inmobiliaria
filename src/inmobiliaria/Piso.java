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
public class Piso extends Vivienda {
    // atributos de piso
    private int altura;
    private boolean ascensor;

    public Piso(int altura, boolean ascensor, int metros, int habita, String direccion, Propietarios p) {
        super(metros, habita, direccion,p);
        this.altura = altura;
        this.ascensor = ascensor;
        setNumVivi(getNumVivi()+1);
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public boolean isAscensor() {
        return ascensor;
    }

    public void setAscensor(boolean ascensor) {
        this.ascensor = ascensor;
    }
    
    @Override
    public float precioFinal(){
       float pf=0;
       pf = getPrecio() * getMetros();
       if (isAscensor())
           pf+=500;
       
       return pf;
    
    } 

    @Override
    public String toString() {
        return " Piso{ " +super.toString()+ " altura=" + altura + ", ascensor=" + ascensor + '}';
    }
    
            
    
    
}
