# Ejercicio 2
> La dena de los filosofos

## Primera parte

Creamos una clase llamada palillos donde estendemos la clase semaphore donde declaramos 5 vareiables, una por cada palillo que hay en la mesa, en esta clase establecemos un permiso para la clase semaphore, con el parametro justo en true para que el pprimero en invocar al metodo adquiere tenga el primer permiso.

![imagen](https://user-images.githubusercontent.com/44735067/49603893-d0494300-f98c-11e8-872b-9862af55fb58.png)


## Segunda parte

Creamos una clase llamada filosofo donde extenderemos a la clase thread. Dentro de esta clase creamos 5 variables con los nombres de los filosofos y tambien indicamos el tiempo que pasara entre procesos.

![imagen](https://user-images.githubusercontent.com/44735067/49604312-d986df80-f98d-11e8-8fd7-563013bc4e60.png)


Dentro de esta clase creamos el metodo run, en el cual dendro de un buqle con su condicion en true para que se repita hasta que se fuerze su fin.
![imagen](https://user-images.githubusercontent.com/44735067/49604486-4dc18300-f98e-11e8-8001-e267b2c5bf4d.png)

Dentro de dicho bucle se adquiere el permiso para coger dos palillos, en el cual se nos permite el filosofo comera y si no pensara.

![imagen](https://user-images.githubusercontent.com/44735067/49604719-f243c500-f98e-11e8-8d51-38406117d309.png)

Cuando el filosofo piensa o come se le dara un tiempo.

![imagen](https://user-images.githubusercontent.com/44735067/49604952-89108180-f98f-11e8-88dd-f2d7390e4365.png)

## Tercera parte

Finalmente en el metodo main se crean 5 objetos de la clase palillo y se crean 5 objetos de la clase filosofo donde se le para como parametro el nombre del filosofo el numero del palillo de la izquierda y  palillo de la derecha.
Y le paramos las clases  palillo

E iniciamos los hilos.

![imagen](https://user-images.githubusercontent.com/44735067/49605057-d0970d80-f98f-11e8-824b-9ad491337e76.png)

