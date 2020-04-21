package br.com;

import java.util.ArrayList;
import java.util.List;

public class Beneficiario {
    private int cadastro;
    private String nome;
    private List<Beneficio> beneficios;

    public int getCadastro() {
        return cadastro;
    }

    public void setCadastro(int cadastro) {
        this.cadastro = cadastro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Beneficio> getBeneficios() {
        return beneficios;
    }

    public void setBeneficios(List<Beneficio> beneficios) {
        this.beneficios = beneficios;
    }

    void deposita(TipoBeneficio tipoBeneficio, double valor) {

        for (int i = 0; i < beneficios.size(); i++) {

            Beneficio item = beneficios.get(i);

            if (item.getTipoBeneficio() == tipoBeneficio) {
                double novoSaldo = item.getSaldo() + valor;
                item.setSaldo(novoSaldo);
                break;
            }

        }

    }

    boolean saca(TipoBeneficio tipoBeneficio, double valor) {
        boolean saca = false;
        for (int i = 0; i < beneficios.size(); i++) {
            Beneficio item = beneficios.get(i);
            if (item.getSaldo() >= valor) {
                if (item.getTipoBeneficio() == tipoBeneficio) {
                    double novoSaldo = item.getSaldo() - valor;
                    item.setSaldo(novoSaldo);
                    saca = true;
                    break;
                }

            } else {
                System.out.println("Saldo Insuficiente!!!");
                break;
            }

        }
        return saca;

    }

    boolean transfereBeneficioParaOutroBeneficiario(Beneficiario beneficiarioDestino,
                                                    TipoBeneficio tipoBeneficio, double valor) {
        boolean resultado = false;
        boolean retornoSaca = this.saca(tipoBeneficio, valor);
        if (retornoSaca) {
            beneficiarioDestino.deposita(tipoBeneficio, valor);
            resultado = true;
        } else {
            System.out.println("Saldo insuficiente no " + beneficiarioDestino + "para realizar essa transferência");
        }

        return resultado;
    }

    boolean transfereBeneficio(TipoBeneficio tipoBeneficioOrigem, TipoBeneficio tipoBeneficioDestino, double valor) {
        boolean resultado = false;
        boolean saqueRealizado = saca(tipoBeneficioOrigem, valor);
        if (saqueRealizado) {
            deposita(tipoBeneficioDestino, valor);
            resultado = true;
        } else {
            System.out.println("Saldo insuficiente no " + tipoBeneficioOrigem + " para realizar essa transferência");
        }
        return resultado;
    }

}
