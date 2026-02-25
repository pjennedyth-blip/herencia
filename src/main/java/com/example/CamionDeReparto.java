package com.example;

public class CamionDeReparto extends Transporte {

    private boolean tieneRefrigeracion;

    public CamionDeReparto(String idTransporte, double combustible, double capacidadCarga, boolean tieneRefrigeracion) {
        super(idTransporte, combustible, capacidadCarga);
        this.tieneRefrigeracion = tieneRefrigeracion;
    }

    @Override
    public void viajar(int distancia) {

        if (distancia <= 0) {
            System.out.println("Error: distancia inválida.");
            return;
        }

        double consumo = distancia / 10.0;

        if (tieneRefrigeracion) {
            consumo *= 2;
            System.out.println("El camión viaja con carga refrigerada.");
        } else {
            System.out.println("El camión viaja como transporte normal.");
        }
        if (getcombustible() >= consumo) {
            setCombustible(getcombustible() - consumo);
        } else {
            System.out.println("Combustible insuficiente.");
        }
    }
}
// tienerefrigeracion ? 2.0 : 1.0
