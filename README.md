# Trabajo2Prog1

Diferencias entre Arrays y Listas Enlazadas
Un array es como una fila de casilleros pegados uno al lado del otro. Cada casillero tiene un número (índice) y podés ir directo al que quieras. Una lista enlazada es como una cadena de fichas: cada ficha guarda un dato y además tiene una flechita que apunta a la siguiente ficha. Para llegar a una ficha en el medio, tenés que ir pasando por todas las anteriores.

En un array:
El tamaño está fijo desde el principio.
Podés acceder rápido a cualquier posición.
Si querés agregar o borrar algo en el medio, tenés que mover muchos elementos.

En una lista enlazada:
El tamaño puede crecer o achicarse sin problema.
Para buscar algo tenés que recorrer nodo por nodo.
Agregar o borrar es más fácil porque solo cambiás las flechitas.

Ventajas de listas enlazadas en este trabajo:

No tenés que preocuparte por el tamaño, podés seguir agregando estudiantes o materias sin límite.
Es más fácil insertar o eliminar cosas, porque no hay que mover todo como en un array.
Te obliga a practicar recursión y punteros, que es lo que pide la consigna.
Te prepara para pensar en estructuras dinámicas, que se usan mucho en programación real.

Desventajas de listas enlazadas:

Son más lentas para acceder a un elemento específico, porque tenés que recorrer desde el principio.
Gastan más memoria porque cada nodo guarda también la referencia al siguiente.
Ordenar o buscar rápido es más complicado; a veces conviene pasar la lista a un array para usar algoritmos conocidos.
El código es más largo y hay que tener cuidado de no perder nodos o romper la cadena.
