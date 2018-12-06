/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea02ejercicio2;

import java.util.concurrent.Semaphore;

/**
 *
 * @author Diego Castro Freijo
 */
public class Palillo extends Semaphore {
    public static final int PALILLO1 = 0;
    public static final int PALILLO2 = 1;
    public static final int PALILLO3 = 2;
    public static final int PALILLO4 = 3;
    public static final int PALILLO5 = 4;

    private String nombre;

    public Palillo(String nombre) {
        //Damos un permiso 
        super(1, true);
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
}    
}
