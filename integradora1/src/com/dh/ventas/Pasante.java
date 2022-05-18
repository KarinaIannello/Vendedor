package com.dh.ventas;

public class Pasante extends Vendedor {

    private int ventasRealizadas;

    //constructor
    public Pasante(String nombre, int ventasRealizadas) {
        super(nombre);
        this.ventasRealizadas = ventasRealizadas;
    }

    @Override
    protected int calcularPuntaje() {
        return 5 * this.ventasRealizadas;
    }
}
