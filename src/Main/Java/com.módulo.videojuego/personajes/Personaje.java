package com.módulo.videojuego.personajes;

public class Personaje {
    protected int puntosDeVida = 100;
    protected int posiciónX = 0;
    protected int posiciónY = 0;

    public Personaje(int posiciónX, int posiciónY){
        this.posiciónX = posiciónX;
        this.posiciónY = posiciónY;
    }

    public void recibirDaño (int puntos){
        puntosDeVida -= puntos;
    }

    public void moverHaciaLaDerecha (int unidades){
        posiciónX += unidades;

    }

    public void moverHaciaLaIzquierda (int unidades){
        posiciónY += unidades;

    }

    public void emitirSonidoDeDolor (){
        System.out.println("!Aaayy!");
    }
}
