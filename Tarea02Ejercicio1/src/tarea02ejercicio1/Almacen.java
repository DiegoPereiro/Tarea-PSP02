/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea02ejercicio1;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Diego Castro Freijo
 */
class Almacen {

    private int capacidad = 6;
    private ArrayList<Character> buffer = new ArrayList<Character>();

    //creamos metodo para depositar letras
    public synchronized void depositar(char caracter) {
        //comprobamos si el buffer esta lleno
        if (buffer.size() != capacidad) {
            //al no estar lleno añadimos un carracter 
            buffer.add(caracter);
            //desbloqueamo el consumomidor que esta esperando
            notify();
        } else {
            //al estar lleno Esperamos que haya hueco
            try {
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(Almacen.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    //creamos metodo para recoger letras 
    public synchronized char recoger() {
        char caracter;
        //si el buffer esta vacio esperamos a que se deje de estarlo
        if (buffer.size() == 0) {
            try {
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(Almacen.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        caracter = buffer.get(0);
        //eliminarmos el caracter entregado
        buffer.remove(0);
        //desbloqueamos el productor que esta esperando
        notify();
        //entregamos el primer caracter que es encuentra en el buffer  
        return caracter;
    }

}
