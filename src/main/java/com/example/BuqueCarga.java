package com.example;

public class BuqueCarga extends Transporte {

    private int cantidadContenedores;

    public BuqueCarga(String idTransporte,double combustible,double capacidadCarga, int cantidadContenedores) {
        super(idTransporte,combustible, capacidadCarga);
        this.cantidadContenedores = cantidadContenedores;
    }

    public void atracarEnPuerto() {
        System.out.println(getIdTransporte() + " lista para descargar");
    }

    public void mostrarDatos() {
            double costodeviaje = cantidadContenedores *100;
        System.out.println("ID Transporte: " + getIdTransporte());
        System.out.println("tu combustible es :" + getCombustible());
        System.out.println(" su capacidad de carga es : " + getCapacidadCarga());
        System.out.println("Cantidad de contenedores: " + cantidadContenedores);
        System.out.println("tu costo de viaje " +costodeviaje + "usd");
    }
}