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
            if(nivel <= 0 ){
                this.combustible = 0;
            }else if(nivel >= 100){
                this.combustible = 100;
            }else {
                this.combustible = nivel;
            }
        }
     public void setCapacidadCarga(double carga){
        if(carga>= 0){
            this.capacidadCarga = carga;
        }else{
            System.out.println("La capacidad de carga no puede ser negativa");
        }
    }

        public void viajar(int distancia){
            double consumo = distancia / 10.0;
            if (combustible >= consumo){
                combustible -=consumo;
                System.out.println("viaje realizado. combustible restante" + combustible);
            }else{
                    System.out.println("no hay suficiente combustible para viajar ");
            }
     }

     public String getIdTransporte() {
         return idTransporte;
     }
     public double getcombustible(){
            return combustible;
     }
     public double getcapacidadCarga(){
        return capacidadCarga;
     }
    

}