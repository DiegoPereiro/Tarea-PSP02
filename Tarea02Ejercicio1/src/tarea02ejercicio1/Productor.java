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
public class Productor extends Thread {

    private Almacen almacen;
    private String caracteres = "ABCEFGHIJKLMNOPQRSTUVWXYZ";
    private int produce=15;

    public Productor(Almacen almacen) {
        //compartimos la calse tuberia para operar con ella
        this.almacen = almacen;
    }
    @Override
    public void run() {
        char letra;
        //introducimos 15 caracteres en la clase almacen
        for (int i = 0; i < produce; i++) {
            //extraemos de la cadena caracteres una letra aleatoria
            letra = caracteres.charAt((int) (Math.random() * 25));
            //depositamos la letra en la clase almacen
            almacen.depositar(letra);
            //Imprimimos 
            System.out.println("Depositado el caráter " + letra + " en el buffer");
        }
    }
}
