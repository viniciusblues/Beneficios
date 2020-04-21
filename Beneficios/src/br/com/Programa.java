package br.com;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Programa {
//    public static void main(String[] args) {
//        String varios = "";
//        boolean repete = true;
//
//        Beneficiario cadastro1 = new Beneficiario();
//        Beneficiario cadastro2 = new Beneficiario();
//        Beneficiario cadastro3 = new Beneficiario();
//
//        cadastro1.setNome("João");
//        cadastro1.setCadastro(1);
//
//        List<Beneficio> beneficios = new ArrayList<>();
//        Beneficio refeicao = new Beneficio();
//        refeicao.setTipoBeneficio(TipoBeneficio.valeRefeicao);
//        refeicao.setSaldo(300);
//
//        Beneficio alimentacao = new Beneficio();
//        alimentacao.setTipoBeneficio(TipoBeneficio.valeAlimentacao);
//        alimentacao.setSaldo(400);
//
//        Beneficio combustivel = new Beneficio();
//        combustivel.setTipoBeneficio(TipoBeneficio.valeCombustivel);
//        combustivel.setSaldo(500);
//
//        beneficios.add(refeicao);
//        beneficios.add(alimentacao);
//        beneficios.add(combustivel);
//
//        cadastro1.setBeneficios(beneficios);
//
//
//        cadastro2.setNome("Maria");
//        cadastro2.setCadastro(2);
//
//        refeicao.setSaldo(200);
//        alimentacao.setSaldo(500);
//        combustivel.setSaldo(50);
//
//
//        cadastro2.setBeneficios(beneficios);
//
//
////        cadastro3.setNome("Pedro");
////        cadastro3.setCadastro("0003");
////        cadastro3.setVR(500);
////        cadastro3.setVA(500);
////        cadastro3.setVC(500);
//
//
//        //System.out.println(cadastro3.DadosParaImpressao());
//        //System.out.println(cadastro2.DadosParaImpressao());
//        //System.out.println(cadastro1.DadosParaImpressao());
//
//        while (repete) {
//
//            int operacao = JOptionPane.showOptionDialog(null,
//                    "Selecione a operação desejada", "Tipo de operação",
//                    JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,
//                    null, new String[]{"Deposita", "Saca", "Transfere"}, "Deposita");
//
///***************NÃO FUNCIONOU**************
// int primeira = JOptionPane.showOptionDialog(null,
// "De qual funcionario será feito a operação?", "Funcionário",
// JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,
// null, new String[]{cadastro1.getNome(), cadastro2.getNome(), cadastro3.getNome()}, cadastro1.getNome());
// switch (primeira) {
// case 0:
// varios = "cadastro1";
// break;
// case 1:
// varios = "cadastro2";
// break;
// case 2:
// varios = "cadastro3";
// break;
// }
//
// */
//
//            int cartao = JOptionPane.showOptionDialog(null,
//                    "Selecione a operação desejada", "Qual cartão escolhido",
//                    JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,
//                    null, new String[]{"Vale refeição", "Vale alimentação", "Vale Combustivel"}, "Vale Combustivel");
//
//            String pontos = JOptionPane.showInputDialog("Valor de pontos para a operação");
//            int pontosConvertido = Integer.parseInt(pontos);
//
//            if (operacao == 0 && cartao == 0) {
//                cadastro1.deposita(pontosConvertido, TipoBeneficio.valeRefeicao);
//            } else if (operacao == 1 && cartao == 0) {
//                cadastro1.saca(pontosConvertido, TipoBeneficio.valeRefeicao);
//                //} else if (operacao == 2 && cartao == 0) {
//                //    cadastro1.transfere(cadastro2, pontosConvertido, TipoBeneficio.valeAlimentacao, TipoBeneficio.valeAlimentacao);
//            } else if (operacao == 0 && cartao == 1) {
//                cadastro1.deposita(pontosConvertido, TipoBeneficio.valeAlimentacao);
//            } else if (operacao == 1 && cartao == 1) {
//                cadastro1.saca(pontosConvertido, TipoBeneficio.valeAlimentacao);
//                //} else if (operacao == 2 && cartao == 1) {
//                //   cadastro1.transfere(cadastro2, pontosConvertido, TipoBeneficio.valeAlimentacao, TipoBeneficio.valeAlimentacao);
//            } else if (operacao == 0 && cartao == 2) {
//                cadastro1.deposita(pontosConvertido, TipoBeneficio.valeCombustivel);
//            } else if (operacao == 1 && cartao == 2) {
//                cadastro1.saca(pontosConvertido, TipoBeneficio.valeCombustivel);
//                //} else if (operacao == 2 && cartao == 2) {
//                //    cadastro1.transfere(cadastro2, pontosConvertido, TipoBeneficio.valeAlimentacao, TipoBeneficio.valeAlimentacao);
//            }
//
//            String imprime = cadastro1.DadosParaImpressao() + "\n" + cadastro2.DadosParaImpressao() + "\n" + cadastro3.DadosParaImpressao();
//
//            JOptionPane.showOptionDialog(null,
//                    "Todos os funcionarios \n\n\n" + imprime, "Saldo geral",
//                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
//                    null, new String[]{"OK"}, "OK");
//
//            int continua = JOptionPane.showOptionDialog(null,
//                    "Deseja fazer outra operação? \n\n\n", "Fim",
//                    JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,
//                    null, new String[]{"Sim", "Sair"}, "Sim");
//            if(continua == 0){
//                repete = true;
//            }else {
//                repete = false;
//            }
//        }
//    }
}
