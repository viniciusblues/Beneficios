package br.com;

import java.util.ArrayList;
import java.util.List;

public class Programa {
    public static void main(String[] args) {

        Beneficiario cadastroVinicius = new Beneficiario();
        Beneficiario cadastroAfonso = new Beneficiario();
        Beneficiario cadastroWellington = new Beneficiario();

        cadastroVinicius.setNome("Vinicius");
        cadastroVinicius.setCadastro(1);

        List<Beneficio> beneficios = new ArrayList<>();
        Beneficio refeicao = new Beneficio(TipoBeneficio.valeRefeicao);
        refeicao.setSaldo(100);

        Beneficio alimentacao = new Beneficio(TipoBeneficio.valeAlimentacao);
        alimentacao.setSaldo(110);

        Beneficio combustivel = new Beneficio(TipoBeneficio.valeCombustivel);
        combustivel.setSaldo(120);

        beneficios.add(refeicao);
        beneficios.add(alimentacao);
        beneficios.add(combustivel);


        cadastroVinicius.setBeneficios(beneficios);

        cadastroVinicius.saca(TipoBeneficio.valeRefeicao, 50);

        beneficios = new ArrayList<>();
        cadastroAfonso.setNome("Afonso");
        cadastroAfonso.setCadastro(2);

        refeicao = new Beneficio(TipoBeneficio.valeRefeicao);
        alimentacao = new Beneficio(TipoBeneficio.valeAlimentacao);
        combustivel = new Beneficio(TipoBeneficio.valeCombustivel);

        refeicao.setSaldo(200);
        alimentacao.setSaldo(210);
        combustivel.setSaldo(220);

        beneficios.add(refeicao);
        beneficios.add(alimentacao);
        beneficios.add(combustivel);

        cadastroAfonso.setBeneficios(beneficios);

        cadastroAfonso.deposita(TipoBeneficio.valeCombustivel, 20);

        beneficios = new ArrayList<>();
        cadastroWellington.setNome("Wellington");
        cadastroWellington.setCadastro(3);

        refeicao = new Beneficio(TipoBeneficio.valeRefeicao);
        alimentacao = new Beneficio(TipoBeneficio.valeAlimentacao);
        combustivel = new Beneficio(TipoBeneficio.valeCombustivel);

        refeicao.setSaldo(300);
        alimentacao.setSaldo(310);
        combustivel.setSaldo(320);

        beneficios.add(refeicao);
        beneficios.add(alimentacao);
        beneficios.add(combustivel);

        cadastroWellington.setBeneficios(beneficios);

        cadastroWellington.saca(TipoBeneficio.valeAlimentacao, 100);

        cadastroWellington.deposita(TipoBeneficio.valeCombustivel, 100);


        boolean resultadoTransferenciaParaOutroBeneficiario = cadastroAfonso.transfereBeneficioParaOutroBeneficiario(cadastroVinicius, TipoBeneficio.valeRefeicao, cadastroAfonso.getBeneficios().get(0).getSaldo());
        if (resultadoTransferenciaParaOutroBeneficiario) {
            System.out.println("Transferencia Realizada");
        } else {
            System.out.println("Transferencia nao realizada");
        }


        boolean resultadoTransferencia = cadastroWellington.transfereBeneficio(TipoBeneficio.valeAlimentacao, TipoBeneficio.valeCombustivel, cadastroWellington.getBeneficios().get(1).getSaldo());
        if (resultadoTransferencia) {
            System.out.println("Transferencia Realizada");
        } else {
            System.out.println("Transferencia nao realizada");
        }

        exibeValoresBeneficios(cadastroVinicius, cadastroAfonso, cadastroWellington);

    }

    private static void exibeValoresBeneficios(Beneficiario cadastroVinicius, Beneficiario cadastroAfonso, Beneficiario cadastroWellington) {
        System.out.println("VR Vinicius : " + cadastroVinicius.getBeneficios().get(0).getSaldo());
        System.out.println("VR Afonso : " + cadastroAfonso.getBeneficios().get(0).getSaldo());
        System.out.println("VR Wellington : " + cadastroWellington.getBeneficios().get(0).getSaldo());
        System.out.println("VA Vinicius : " + cadastroVinicius.getBeneficios().get(1).getSaldo());
        System.out.println("VA Afonso : " + cadastroAfonso.getBeneficios().get(1).getSaldo());
        System.out.println("VA Wellington : " + cadastroWellington.getBeneficios().get(1).getSaldo());
        System.out.println("VC Vinicius : " + cadastroVinicius.getBeneficios().get(2).getSaldo());
        System.out.println("VC Afonso : " + cadastroAfonso.getBeneficios().get(2).getSaldo());
        System.out.println("VC Wellington : " + cadastroWellington.getBeneficios().get(2).getSaldo());
    }
}
