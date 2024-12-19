package com.módulo.videojuego.personajes.equipoA;


import com.módulo.videojuego.personajes.Personaje;

public class León extends Personaje {
    private String nombre;
    private static final int UNIDADES_DE_SALTO =50;

    public León(int posiciónX, int posiciónY, String nombre) {
        super(posiciónX, posiciónY);
        this.nombre = nombre;
    }
    public void recibirCura(int puntos){
        puntosDeVida += puntos*3;
    }
    public void saltar (){
        posiciónY += UNIDADES_DE_SALTO;
    }

    public void emitirSonidoDeDolor (){
        System.out.println("Ggggrrrrrr");
    }

}
