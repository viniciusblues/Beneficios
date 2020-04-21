package br.com;

import java.util.ArrayList;
import java.util.List;

public class Beneficiario {
    //atributos
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

    boolean transfereBeneficioParaOutroBeneficiario( Beneficiario beneficiarioDestino,
                                  TipoBeneficio tipoBeneficio, double valor) {
        boolean resultado = false;
        boolean retornoSaca = this.saca(tipoBeneficio, valor);
        if(retornoSaca){
            beneficiarioDestino.deposita(tipoBeneficio,valor);
            resultado = true;
        }else{
            System.out.println("Saldo insuficiente no " + beneficiarioDestino + "para realizar essa transferência");
        }

        return resultado;
    }

    boolean transfereBeneficio(TipoBeneficio tipoBeneficioOrigem, TipoBeneficio tipoBeneficioDestino, double valor) {
        boolean resultado = false;
        boolean saqueRealizado = saca(tipoBeneficioOrigem, valor);
        if (saqueRealizado){
            deposita(tipoBeneficioDestino, valor);
            resultado = true;
        }
        else{
            System.out.println("Saldo insuficiente no " + tipoBeneficioOrigem + " para realizar essa transferência");
        }
        return resultado;
    }


//    void transfere(Beneficiario beneficiario, double valor, TipoBeneficio origemPontos, TipoBeneficio destinoPontos) {
//        boolean realizado = saca(origemPontos, valor);
//        if (realizado) {

//    void transfere(Beneficiario destino, int valor, TipoBeneficio origemPontos, TipoBeneficio destinoPontos) {
//        boolean realizado = saca(valor, origemPontos);
//        if (realizado) {
//            destino.deposita(valor, destinoPontos);
//
//            System.out.println("Um saque de " + valor + " pontos do " + origemPontos + " foi realizado do funcionario " + nome + " " +
//                    "e depositado no " + destinoPontos + " do funcionario " + destino.nome);
//
//        } else {
//            System.out.println("Não tem saldo");
//        }
//    }

/*
    private void printaLogOrigem(int valor, TipoBeneficio origem) {
        switch (origem) {
            case VR:
                System.out.print(nome + " tranferiu do seu VR o valor de " + valor);
                break;
            case VA:
                System.out.print(nome + " tranferiu do seu VA o valor de " + valor);
                break;
            case VC:
                System.out.print(nome + " tranferiu do seu VC o valor de " + valor);
                break;
        }
    }

    private void printaLogDestinoPontos(Beneficios destino, TipoBeneficio destinoPontos) {
        switch (destinoPontos) {
            case VR:
                System.out.println(" pontos para o VR de " + destino.nome);
                break;
            case VA:
                System.out.println(" pontos para o VA de" + destino.nome);
                break;
            case VC:
                System.out.println(" pontos para o VC de" + destino.nome);
                break;
        }
    }

 */

    String DadosParaImpressao() {
        String dados = "============================================================================";
        dados += "\nTitular: " + nome;
        dados += " - Número funcional: " + cadastro;
//        dados += " - Saldo do VR: " + VR + " pontos";
//        dados += " - Saldo do VA: " + VA + " pontos";
//        dados += " - Saldo do VC: " + VC + " pontos";
        dados += "\n****************************************************************************";
        return dados;
    }
}
