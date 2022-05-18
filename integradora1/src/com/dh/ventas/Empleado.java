package com.dh.ventas;

public class Empleado extends Vendedor {

    private int añosDeAntigüedad;
    private int cantidadDeAfiliados;
    private int ventasRealizadas;

    public Empleado(String nombre, int añosDeAntigüedad) {
        super(nombre);
        this.añosDeAntigüedad = añosDeAntigüedad;
    }

    public void addAfiliado(Vendedor afiliado) {
        if(afiliado != null){
            this.cantidadDeAfiliados ++;
        }
    }

    @Override
    public int calcularPuntaje() {
        return (10 * this.cantidadDeAfiliados) + (5 * this.ventasRealizadas) + (5 * this.añosDeAntigüedad);
    }
}
