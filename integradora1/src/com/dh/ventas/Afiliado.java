package com.dh.ventas;

public class Afiliado extends Vendedor{

    public Afiliado(String nombre) {
        super(nombre);
    }

    @Override
    public int calcularPuntaje() {
        return 0;
    }
}
