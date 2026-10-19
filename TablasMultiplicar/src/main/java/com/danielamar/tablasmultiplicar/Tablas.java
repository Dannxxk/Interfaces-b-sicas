
package com.danielamar.tablasmultiplicar;


public class Tablas {
    
    private int nIngresado;

    public Tablas(int nIngresado) {
        this.nIngresado = nIngresado;
    }

    public int getnIngresado() {
        return nIngresado;
    }

    public void setnIngresado(int nIngresado) {
        this.nIngresado = nIngresado;
    }

    // Método para generar la cadena la tabla del 1 al 10
    public String generarTabla() {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 10; i++) {
            sb.append(String.format("%d x %d = %d\n", nIngresado, i, nIngresado * i));
        }
        return sb.toString().trim();
    }
}
    
    

