package br.com.beneficios;

public class Beneficiarios {


    String nome;
    double valeRefeicao, valeCombustivel, valeMaquina;
    int numeroFuncionario;

    boolean sacar(double pontos, TipoBeneficio operacao) {
        boolean saqueRealizado = false;

        if (operacao == TipoBeneficio.valeRefeicao) {
            if (this.valeRefeicao > pontos) {
                this.valeRefeicao -= pontos;
                saqueRealizado = true;
            }
        }

        if (operacao == TipoBeneficio.valeCombustivel) {
            if (this.valeCombustivel > pontos) {
                this.valeCombustivel -= pontos;
                saqueRealizado = true;
            }
        }

        if (operacao == TipoBeneficio.valeMaquina) {
            if (this.valeMaquina > pontos) {
                this.valeMaquina -= pontos;
                saqueRealizado = true;
            }
        }
        return saqueRealizado;
    }


    boolean depositar(double Pontos, TipoBeneficio operacao) {
        boolean depositoRealizado = false;

        if (operacao == TipoBeneficio.valeRefeicao) {
            this.valeRefeicao += Pontos;
            depositoRealizado = true;
        }

        if (operacao == TipoBeneficio.valeCombustivel) {
            this.valeCombustivel += Pontos;
            depositoRealizado = true;
        }

        if (operacao == TipoBeneficio.valeMaquina) {
            this.valeMaquina += Pontos;
            depositoRealizado = true;
        }
        return depositoRealizado;
    }

    void transferir(Beneficiarios destino, int pontos, TipoBeneficio origem, TipoBeneficio destinoPontos) {
        boolean tranferenciaRealizada = sacar(pontos, origem);
        if (tranferenciaRealizada){
            destino.depositar(pontos, destinoPontos);
            System.out.println("Um saque de " + pontos + " pontos do " + origem + " foi realizado do funcionario " + nome + " " +
                    "e depositado no " + destinoPontos + " do funcionario " + destino.nome);
        }
        else{
            System.out.println("não tem saldo da conta de origem");
        }
    }

}
