# Ejercicio 1
> ejeccio productor - constructor donde el productor producte 15 caracteres y los guarda en un buffer con una capacidad de 6 caracteres y el consumidor consume 15 caracteres

## 1º Creamos la clases almacen donde se almacenaran los datos
Mediante un arraylist con un limite de 6 caracteres almacemamos los caracteres.

![captura1](https://user-images.githubusercontent.com/44735067/49602057-d2f56980-f987-11e8-8a5e-fbf75c6a55f8.PNG)

Creamos un metodo sincronizado que almacenara los caracteres recibidos de la clase productor, este metodo comprueva que el buffer no estea completo y entonces almacenara dicho caracter y si esta completo espera de espacion disponible.

![captura2](https://user-images.githubusercontent.com/44735067/49602167-15b74180-f988-11e8-928b-c87861309406.PNG)

Creamos un metodo sincronidado que suministra los caracteres pedidos por la clase consumidor, este metodo comprueva que el buffer no esté vacio, entonces suministra el primer caracter disponible en el buffer, si esta vacio espera a algun caracter disponible.

![captura3](https://user-images.githubusercontent.com/44735067/49602513-f1a83000-f988-11e8-904b-b839d9be0c64.PNG)

## 2º Creamos la clase productor extendida de la clase Thread donde se produciran los caracteres.

Al invocar esa clases desde la clase main, recibira como parametro la clase almacen, y especificamos los caracteres que debe generar y la canditad.

![imagen](https://user-images.githubusercontent.com/44735067/49602781-9dea1680-f989-11e8-9c26-9be3adc88e72.png)

Creamos el metodo run donde se genera el numero de caracteres especificados y de forma aleatoria y estes los guardamos en la clase almacen.

![imagen](https://user-images.githubusercontent.com/44735067/49602929-0933e880-f98a-11e8-9fff-e409e1bcbbe4.png)

##3º Creamos la clase consumidor estendidad de la clase Thread donde se recogeran los caracteres.

Al invocar esa clases desde la clase main, recibira como parametro la clase almacen, y especificamos la canditad de caracteres que debe consumir.

![imagen](https://user-images.githubusercontent.com/44735067/49603171-cc1c2600-f98a-11e8-87cb-47604eb1a34c.png)

Creamos el metodo run donde se recoge un caracter que nos suministra la clase almacen a traves del metodo recoger.

![imagen](https://user-images.githubusercontent.com/44735067/49603266-14d3df00-f98b-11e8-8e67-608d501a638a.png)

## 4º Programamos el metodo main

Instanciamos la clase almacen.
Instanciamos la clase productor y la pasamos como parametro la clase almacen
Instanciamos la clase consumidor y la pasamos como parametro la clase almacen
Iniciamos las clases productor y consumidor.

![imagen](https://user-images.githubusercontent.com/44735067/49603409-7ac06680-f98b-11e8-845b-44115bbce12b.png)


