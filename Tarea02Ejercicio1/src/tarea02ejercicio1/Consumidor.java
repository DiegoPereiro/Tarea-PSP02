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
public class Consumidor extends Thread{
    private Almacen almacen;
    private int consume=15;

    public Consumidor(Almacen almacen) {
        this.almacen = almacen;
    }

    @Override
    public void run() {        
        char caracter;
        //consumimos 15 letras de la clase almacen
        for (int i = 0; i < consume; i++) {    
            //recogemos un caracter de la clase almecen
            caracter= almacen.recoger();
            System.out.println("Recogido el caracter "+caracter+" del buffer");
        }
    }
}
