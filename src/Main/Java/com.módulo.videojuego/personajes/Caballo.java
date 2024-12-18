package com.módulo.videojuego.personajes;

import java.security.PublicKey;

public class Caballo extends EquipoA{

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

