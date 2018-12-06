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
public class Tarea02Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Palillo[] palillos = {
            new Palillo("Palillo 1"),
            new Palillo("Palillo 2"),
            new Palillo("Palillo 3"),
            new Palillo("Palillo 4"),
            new Palillo("Palillo 5")
        };
        Filosofo[] filosofos = {
            new Filosofo(Filosofo.FILOSOFO1, Palillo.PALILLO5, Palillo.PALILLO1),
            new Filosofo(Filosofo.FILOSOFO2, Palillo.PALILLO1, Palillo.PALILLO2),
            new Filosofo(Filosofo.FILOSOFO3, Palillo.PALILLO2, Palillo.PALILLO3),
            new Filosofo(Filosofo.FILOSOFO4, Palillo.PALILLO3, Palillo.PALILLO4),
            new Filosofo(Filosofo.FILOSOFO5, Palillo.PALILLO4, Palillo.PALILLO5),};
        Filosofo.palillos = palillos;

        filosofos[0].start();
        filosofos[1].start();
        filosofos[2].start();
        filosofos[3].start();
        filosofos[4].start();

    }

}
