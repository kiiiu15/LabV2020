1. Con un solo hilo consumidor es suficiente para que se llegue  a cero ya que aunque le tome demasiado tiempo llegara un ounto en el que el hilo consumidor consuma todos los recursos.
2. Los bloques synchronyzed son aquellos que se usan para cceder al recurso compartido por lo que se debe garantizar que se acceda de a un hilo por vez asi evitamos problemas de congruencias.
3. En mi casa el recurso compartido es beerHouse, esn una clase que tiene com atributos una variable de tipo object cerveza  a la cual los hilos productos y consumidor quieren acceder asincronamente
luego tiene una variable para la condicion de si esta ccesible o no el recurso, por ultimo esta clase posee un Integer que indica cuanta capacidad tiene la beerhouse para decirle al producto cuando llego al tope.e
4. Las 3 formas de instanciar un thread sin:
    a. Hacer un new ThreadO();
    b. Crear una clase que extienda de Thread y llamar al super.
    c. Crear una clase que implemente Runneable y un objeto de dicho tipo se le pase en el constructor de un Thread.