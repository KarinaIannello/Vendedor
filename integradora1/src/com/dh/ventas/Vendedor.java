package com.dh.ventas;

public abstract class Vendedor {

    protected String nombre;
    private int ventasRealizadas;

    public Vendedor(String nombre) {
        this.nombre = nombre;
    }

    public void vender(int ventas) {
        this.ventasRealizadas += ventas;
    }

    public final String mostrarCategoria(){
        int puntajeFinal = calcularPuntaje();
        String categoría = "";

        if(puntajeFinal < 20){
            categoría = "novato";
        }else if(puntajeFinal >= 20 && puntajeFinal <= 30){
            categoría = "aprendiz";
        }else if(puntajeFinal >= 31 && puntajeFinal <= 40){
            categoría = "buenos";
        }else{
            categoría = "maestro";
        }

        String respuesta = this.nombre + " tiene un total de " + puntajeFinal + " puntos y categoriza como " + categoría;

        return respuesta;
    }

    protected abstract int calcularPuntaje();
}





