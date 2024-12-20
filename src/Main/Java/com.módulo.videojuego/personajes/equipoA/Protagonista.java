package com.módulo.videojuego.personajes.equipoA;


import com.módulo.videojuego.personajes.Personaje;

public class Protagonista extends Personaje {

    private String nombre;
    private static final int UNIDADES_DE_SALTO = 10;

    public Protagonista(int posiciónX, int posiciónY, String nombre) {
        super(posiciónX, posiciónY);
        this.nombre = nombre;
    }

    public void recibirCura(int puntos) {
        puntosDeVida += puntos;
    }

    public void saltar() {
        posiciónY += UNIDADES_DE_SALTO;
    }

    @Override
    public void emitirSonidoDeDolor() {
        System.out.println("wwwwshhh");

    }
}