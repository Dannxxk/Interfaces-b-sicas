
package com.danielamar.controldegastossemanales;

public class ControlDeGastos {

    private int alimentacion;
   
    private int transporte;
    private int telefonia;
    private int otros;

    public ControlDeGastos(int alimentacion, int transporte, int telefonia, int otros) {
        this.alimentacion = alimentacion;
        this.transporte = transporte;
        this.telefonia = telefonia;
        this.otros = otros;
    }

    public int getTotalSemanal() {
        return alimentacion + transporte + telefonia + otros;
    }

    public String getGastoMasAlto() {
        if (alimentacion >= transporte && alimentacion >= telefonia && alimentacion >= otros) {
            return "Alimentación";     
        } else if (transporte >= telefonia && transporte >= otros) {
            return "Transporte";
        } else if (telefonia >= otros) {
            return "Telefonía";
        } else {
            return "Otros";
        }
    }
}
    

