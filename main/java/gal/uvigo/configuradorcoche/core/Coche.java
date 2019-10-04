package gal.uvigo.configuradorcoche.core;

public class Coche {

    public Coche() {
        this.observaciones = " ";
        this.suv = false;
        this.familiar = false;
        this.navegador = false;
        this.aireAcondicionado = false;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public boolean isSuv() {
        return suv;
    }

    public void setSuv(boolean suv) {
        this.suv = suv;
    }

    public boolean isFamiliar() {
        return familiar;
    }

    public void setFamiliar(boolean familiar) {
        this.familiar = familiar;
    }

    public boolean isNavegador() {
        return navegador;
    }

    public void setNavegador(boolean navegador) {
        this.navegador = navegador;
    }

    public boolean isAireAcondicionado() {
        return aireAcondicionado;
    }

    public void setAireAcondicionado(boolean aireAcondicionado) {
        this.aireAcondicionado = aireAcondicionado;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "observaciones='" + observaciones + '\'' +
                ", suv=" + suv +
                ", familiar=" + familiar +
                ", navegador=" + navegador +
                ", aireAcondicionado=" + aireAcondicionado +
                '}';
    }

    private  String observaciones;
    private boolean suv;
    private boolean familiar;
    private boolean navegador;
    private boolean aireAcondicionado;

}
