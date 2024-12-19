package com.módulo.videojuego.personajes.equipoB;

import com.módulo.videojuego.personajes.Personaje;

public class Enemigo extends Personaje {
    private static int PUNTOS_DE_DAÑO = 10;

    public Enemigo(int posiciónX, int posiciónY) {
        super(posiciónX, posiciónY);
    }
    public int obtenerPuntosDeDaño (){
        return PUNTOS_DE_DAÑO;
    }
    public void emitirSonidosDeFuria (){
        System.out.println("Aaaaaaaaaaaaaaa");
    }
}
