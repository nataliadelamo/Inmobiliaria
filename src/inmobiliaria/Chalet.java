package inmobiliaria;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author natalia
 */
public class Chalet extends Vivienda{
      // atributos
      private int mJardin;
      private boolean piscina;

    public Chalet(int mJardin, boolean piscina, int metros, int habita, String direccion, Propietarios p) {
        super(metros, habita, direccion,p);
        this.mJardin = mJardin;
        this.piscina = piscina;
        setNumVivi(getNumVivi()+1);
    }

    public int getmJardin() {
        return mJardin;
    }

    public void setmJardin(int mJardin) {
        this.mJardin = mJardin;
    }

    public boolean isPiscina() {
        return piscina;
    }

    public void setPiscina(boolean piscina) {
        this.piscina = piscina;
    }
 
    @Override
    public float precioFinal(){
       float pf=0;
       pf = getPrecio() * getMetros();
       if (isPiscina())
           pf+=3000;
       if (getmJardin()>0)
           pf+=getMetros()*300;
       return pf;
    
    } 

    @Override
    public String toString() {
        return "Chalet{" + "mJardin=" + mJardin + ", piscina=" + piscina + '}';
    }
      
        
    
}
