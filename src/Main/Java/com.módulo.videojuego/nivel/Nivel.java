package com.módulo.videojuego.nivel;

import com.módulo.videojuego.personajes.Personaje;
import com.módulo.videojuego.personajes.equipoA.Caballo;
import com.módulo.videojuego.personajes.equipoA.León;
import com.módulo.videojuego.personajes.equipoA.Protagonista;
import com.módulo.videojuego.personajes.equipoB.Dragón;
import com.módulo.videojuego.personajes.equipoB.Enemigo;
import com.módulo.videojuego.personajes.equipoB.Orco;

public class Nivel {
    public static void main(String[] args) {
        Personaje enemigo = new Personaje(5,5);
        Dragón dragón = new Dragón(10,5);
        Enemigo enemigo2 = new Enemigo(8,6);
        Orco orco = new Orco(4,7);
        Protagonista protagonista = new Protagonista(0,0,"Julián");
        Caballo caballo = new Caballo(3,12,"Rex");
        León león = new León(9,5,"Beilon");

        //Pruebas en consola
        enemigo.moverHaciaLaDerecha(1);
        enemigo.moverHaciaLaIzquierda(2);
        enemigo.recibirDaño(20);
        enemigo.emitirSonidoDeDolor();

        dragón.obtenerPuntosDeDaño();
        dragón.emitirSonidosDeFuria();
        dragón.emitirSonidoDeDolor();
        dragón.moverHaciaLaDerecha(2);
        dragón.moverHaciaLaIzquierda(1);
        dragón.recibirDaño(20);

        orco.obtenerPuntosDeDaño();
        orco.emitirSonidosDeFuria();
        orco.emitirSonidoDeDolor();
        orco.moverHaciaLaDerecha(1);
        orco.moverHaciaLaIzquierda(3);
        orco.recibirDaño(12);

        enemigo2.obtenerPuntosDeDaño();
        enemigo2.emitirSonidosDeFuria();
        enemigo2.emitirSonidoDeDolor();
        enemigo2.moverHaciaLaDerecha(4);
        enemigo2.moverHaciaLaIzquierda(2);
        enemigo2.recibirDaño(32);

        protagonista.emitirSonidoDeDolor();
        protagonista.recibirCura(23);
        protagonista.moverHaciaLaDerecha(2);
        protagonista.moverHaciaLaIzquierda(4);
        protagonista.recibirDaño(25);
        protagonista.saltar();

        caballo.emitirSonidoDeDolor();
        caballo.recibirCura(34);
        caballo.moverHaciaLaDerecha(2);
        caballo.moverHaciaLaIzquierda(1);
        caballo.recibirDaño(3);
        caballo.saltar();

        león.emitirSonidoDeDolor();
        león.recibirCura(20);
        león.moverHaciaLaDerecha(5);
        león.moverHaciaLaIzquierda(3);
        león.recibirDaño(35);
        león.saltar();

    }
}
