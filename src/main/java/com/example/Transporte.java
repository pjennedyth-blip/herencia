 package com.example;

public class Transporte {
    private String idTransporte;
    private double combustible;
    private double capacidadCarga;

    public Transporte(String idTransporte, double combustible, double capacidadCarga) {

        this.idTransporte = idTransporte;
        this.combustible = combustible;
        this.capacidadCarga = capacidadCarga;
    }

    
    public void setCombustible(double nivel) {
        if (nivel < 0) {
            this.combustible = 0;
        } else if(nivel > 100){
            this.combustible = 100;
        }if(nivel >= 0 && nivel <= 100) {
            this.combustible = nivel;
        }
    }

    public void setCapacidadCarga(double carga) {
        if (carga >= 0) {
            this.capacidadCarga = carga;
        } else {
            System.out.println("Error: la capacidad de carga no puede ser negativa.");
        }
    }

    
    public double getCombustible() {
        return combustible;
    }

    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    public String getIdTransporte() {
        return idTransporte;
    }
    
    public void viajar(int distancia) {
        if (distancia <= 0) {
            System.out.println("Error: la distancia debe ser mayor que 0.");
            return;
        }
        double consumo = distancia / 10.0;
        if (combustible >= consumo) {
            setCombustible(combustible - consumo);
            System.out.println("El transporte ha viajado " + distancia + " km.");
        } else {
            System.out.println("Error: combustible insuficiente para viajar.");
        }
    }
}