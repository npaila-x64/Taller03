
## Taller03

Nicolás Paila

i.

Clases identificadas:
* Jugador
* Partido
* Gol

Relaciones identificadas:
* Como el enunciado dice que los goles forman parte de los partidos, podemos decir que los goles agregan el partido. Por tanto existe una agregación desde la clase Gol hasta la clase Partido.
* Hay una asociación de varios a varios entre la clase Jugador y la clase Partido 
* Una asociación de uno a varios desde Jugador hasta Gol
* El Jugador puede anotar un Gol, por tanto existe un método en Jugador para tal operación.

ii.

Clases identificadas:
* Empresa
* Buque
* EstadoBuque {enum: ACTIVO, OBSOLETO}
* Parte

Relaciones identificadas:
* Un buque puede estar activo u obsoleto, por tanto, estos estados los podemos restringir con un enum con los literales ACTIVO, y OBSOLETO.
* La empresa puede comprar, vender, y dar de baja los buques que posee, por tanto estas son operaciones de la clase Empresa.
* Se identificó que las partes de un buque son intercambiables entre buques, por tanto las partes existen independiente del buque pero al mismo tiempo son partes de este. Luego, existe una agregación entre la clase Parte y la clase Buque.


iii.

Clases identificadas:
* Pedido
* Mesero

Relaciones identificadas:
* Existe una asociación de uno a muchos desde la clase Mesero hasta la clase Pedido.
* Un Mesero puede atender un pedido, por tanto es una operación del Mesero.
* Se puede intuir una relación de agregación entre un Pedido y el Mesero, ya que el pedido puede existir de manera independiente al mesero, y al mismo tiempo compartirse entre meseros siempre y cuando tenga exactamente uno.

iv.

Clases identificadas:
* Equipo
* Jugador

Relaciones identificadas:
* Se sabe que cada equipo debe tener al menos un jugador, al mismo tiempo, se sabe que cada equipo tiene al menos un capitan, el cual es un jugador. Luego, tenemos una agregación tal que cada Equipo tiene uno cero o más jugadores. La agregación es porque se intuye que los jugadores son intercambiables entre equipos.
* Uno de los jugadores que posee un Equipo es asignado capitán.

v.

Clases identificadas:
* Evento

Relaciones identificadas:
* Se intuye un tipo de agregación entre eventos por que estos pueden existir de manera independiente unos con otros.
* Un Evento es tiene uno o más Eventos
* Un Evento es parte de cero o un Evento.
