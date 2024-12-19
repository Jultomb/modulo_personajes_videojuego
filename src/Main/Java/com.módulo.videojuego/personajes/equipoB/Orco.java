package com.módulo.videojuego.personajes.equipoB;

public class Orco extends Enemigo {
    private static int PUNTOS_DE_DAÑO = 70;

    public Orco(int posiciónX, int posiciónY) {
        super(posiciónX, posiciónY);
    }
    @Override
    public int obtenerPuntosDeDaño (){
        return PUNTOS_DE_DAÑO;
    }


    public void emitirSonidoDeDolor() {
        System.out.println("!Nooooooo!");
    }
}