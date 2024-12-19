package com.módulo.videojuego.personajes.equipoA;

import com.módulo.videojuego.personajes.Personaje;

public class Caballo extends Personaje {

    private String nombre;
    private static final int UNIDADES_DE_SALTO = 30;

    public Caballo(int posiciónX, int posiciónY, String nombre) {
        super(posiciónX, posiciónY);
        this.nombre = nombre;
    }
    public void recibirCura(int puntos){
        puntosDeVida += puntos*2;
    }
    public void saltar (){
        posiciónY += UNIDADES_DE_SALTO;
    }
    @Override
    public void emitirSonidoDeDolor (){
        System.out.println("Ujujujuju");
    }
}
