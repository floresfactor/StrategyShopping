# 	Strategy Shopping
Este mini proyecto escrito en Java, nos demuestra como se aplica el patron de diseno Strategy.
El cual contiene tres participantes:

**Contexto**: Es el elemento que usa los algoritmos, por tanto, delega en la jerarquía de estrategias. Configura una estrategia concreta mediante una referencia a la estrategia necesaria. Puede definir una interfaz que permita a la estrategia el acceso a sus datos en caso de que fuese necesario el intercambio de información entre el contexto y la estrategia. En caso de no definir dicha interfaz, el contexto podría pasarse a sí mismo a la estrategia como parámetro.

**Estrategia (Strategy)**: Declara una interfaz común para todos los algoritmos soportados. Esta interfaz será usada por el contexto para invocar a la estrategia concreta.

**EstrategiaConcreta (ConcreteStrategy)**: Implementa el algoritmo utilizando la interfaz definida por la estrategia.

![enter image description here](https://upload.wikimedia.org/wikipedia/commons/3/32/Strategy_Pattern.jpg)


# Ventajas

- Factoriza aspectos comunes de una familia de algoritmos y utilizarlos en las clases base de la jerarquía.
-   Aumenta cohesión del cliente.
-   Sistematiza el uso de implementaciones alternativas.

# Desventajas
-   El cliente es el responsable de crear estrategias, por tanto debe comprender las posibilidades que ofrecen, esto es, debe ser relevante para el contexto del cliente.
-   Menor eficiencia. Aumenta el número de objetos creados.

# Requerimiento cumple basado de este patrón

El requerimiento que cumple en el caso de nuestra tienda en  linea es que se busca que un controlador lleva a cabo el proceso del pago con el metodo pay, pero puede usar diferente forma de pago.
Esto ayuda a monitorear todo el pago en un solo conducto.

