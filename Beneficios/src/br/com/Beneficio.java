package br.com;

public class Beneficio {
    private TipoBeneficio tipoBeneficio;
    private double saldo;

    public Beneficio(TipoBeneficio tipoBeneficio){
        this.tipoBeneficio = tipoBeneficio;
    }

    public TipoBeneficio getTipoBeneficio() {
        return tipoBeneficio;
    }

    public void setTipoBeneficio(TipoBeneficio tipoBeneficio) {
        this.tipoBeneficio = tipoBeneficio;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return this.saldo;
    }
}

