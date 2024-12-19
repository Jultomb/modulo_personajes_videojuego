package com.módulo.videojuego.personajes.equipoB;

public class Dragón extends Enemigo {
    private static int PUNTOS_DE_DAÑO = 80;

    public Dragón(int posiciónX, int posiciónY) {
        super(posiciónX, posiciónY);
    }
    @Override
    public int obtenerPuntosDeDaño (){
        return PUNTOS_DE_DAÑO;
    }
}
