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
class Filosofo extends Thread{
    
    public static final String FILOSOFO1 = "Filosofo 1";
    public static final String FILOSOFO2 = "Filosofo 2";
    public static final String FILOSOFO3 = "Filosofo 3";
    public static final String FILOSOFO4 = "Filosofo 4";
    public static final String FILOSOFO5 = "Filosofo 5";

    //Tiempo que el hilo estara durmiendo
    private static final int TIEMPO = 1000;

    public static Palillo[] palillos;

    private int Palillo1, Palillo2;

    public Filosofo(String name, int Palillo1, int Palillo2) {
        super(name);
        this.Palillo1 = Palillo1;
        this.Palillo2 = Palillo2;
    }

    @Override
    public void run() {
        while (true) {
            //Espera hasta tener turno para comer
            if (esperarTurno()) {
                //Cuando le toca el turno coge los palillos y come
                System.out.println(getName() + " Hambriento");
                System.out.println(getName()+ " Comiendo");
                filosofoRetardo(TIEMPO);

                //Cuando termina de comer piensa y deja los palillos disponibles
                System.out.println(getName()+ " Termina de comer, libres palillos "+ Palillo1+" y "+ Palillo2);
                palillos[Palillo1].release();
                palillos[Palillo2].release();
                filosofoRetardo(TIEMPO);
            }
        }
    }
    private boolean esperarTurno(){
        try {
            palillos[Palillo1].acquire();
            palillos[Palillo2].acquire();

            if(palillos[Palillo1].availablePermits() == 0 && palillos[Palillo2].availablePermits() == 0) {
                return true;
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return false;
    }

    private void filosofoRetardo(int time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
}


}
