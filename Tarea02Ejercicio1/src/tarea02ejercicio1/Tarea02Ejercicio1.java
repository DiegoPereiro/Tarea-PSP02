/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea02ejercicio1;

/**
 *
 * @author Diego Castro Freijo
 */
public class Tarea02Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Almacen almacen=new Almacen();
        Productor productor=new Productor(almacen);
        Consumidor consumidor=new Consumidor(almacen);        
        productor.start();
        consumidor.start();
        
        
        
        
        
    }
    
}
