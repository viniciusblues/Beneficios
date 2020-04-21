package br.com.beneficios;

public class Executavel {
    public static void main(String[] args) {

        Beneficiarios Funcionario1 = new Beneficiarios();
        Funcionario1.nome = "Joao";
        Funcionario1.numeroFuncionario = 7;
        Funcionario1.valeCombustivel = 200;
        Funcionario1.valeMaquina = 200;
        Funcionario1.valeRefeicao = 200;

        Beneficiarios Funcionario2 = new Beneficiarios();
        Funcionario2.nome = "Maria";
        Funcionario2.numeroFuncionario = 3;
        Funcionario2.valeCombustivel = 200;
        Funcionario2.valeMaquina = 200;
        Funcionario2.valeRefeicao = 200;

        Beneficiarios Funcionario3 = new Beneficiarios();
        Funcionario3.nome = "Camila";
        Funcionario3.numeroFuncionario = 18;
        Funcionario3.valeCombustivel = 200;
        Funcionario3.valeMaquina = 200;
        Funcionario3.valeRefeicao = 200;

//*********sacar**************8
        if (Funcionario1.sacar(20, TipoBeneficio.valeRefeicao)) {
            System.out.println(Funcionario1.nome + ", foi realizado um saque do vale refeição. Seu saldo é de: " + Funcionario1.valeRefeicao);
        } else {
            System.out.println("Nao foi possivel sacar do vale refeição!");
        }

        if (Funcionario1.sacar(30, TipoBeneficio.valeCombustivel)) {
            System.out.println(Funcionario1.nome + ", foi realizado um saque do vale refeição. Seu saldo é de: " + Funcionario1.valeCombustivel);
        } else {
            System.out.println("Nao foi possivel sacar do vale combustivel!");
        }


        if (Funcionario1.sacar(20, TipoBeneficio.valeMaquina)) {
            System.out.println(Funcionario1.nome + ", foi realizado um saque do vale refeição. Seu saldo é de: " + Funcionario1.valeMaquina);
        } else {
            System.out.println("Nao foi possivel sacar do vale máquina!");
        }

//**********depositar*********************
        if (Funcionario1.depositar(50, TipoBeneficio.valeRefeicao)) {
            System.out.println(Funcionario1.nome + ", foi realizado um deposito no seu VR. Seu saldo é de: " + Funcionario1.valeRefeicao);
        } else {
            System.out.println("não foi realizado o deposito.");
        }

        if (Funcionario1.depositar(50, TipoBeneficio.valeCombustivel)) {
            System.out.println(Funcionario1.nome + ", foi realizado um deposito no seu VC. Seu saldo é de: " + Funcionario1.valeCombustivel);
        } else {
            System.out.println("não foi realizado o deposito.");
        }

        if (Funcionario1.depositar(50, TipoBeneficio.valeMaquina)) {
            System.out.println(Funcionario1.nome + ", foi realizado um deposito no seu Vale máquina. Seu saldo é de: " + Funcionario1.valeMaquina);
        } else {
            System.out.println("não foi realizado o deposito.");
        }

//********tranferir******************
        System.out.println(Funcionario1.nome + " Saldo da Combustivel é : " + Funcionario1.valeCombustivel + " Saldo da Maquina é : " + Funcionario1.valeMaquina);
        System.out.println(Funcionario2.nome + " Saldo da Combustivel é : " + Funcionario2.valeCombustivel + " Saldo da Maquina é : " + Funcionario2.valeMaquina);


        Funcionario1.transferir(Funcionario2, 75, TipoBeneficio.valeCombustivel, TipoBeneficio.valeMaquina);


        System.out.println(Funcionario1.nome + " Saldo da Combustivel é : " + Funcionario1.valeCombustivel + " Saldo da Maquina é : " + Funcionario1.valeMaquina);
        System.out.println(Funcionario2.nome + " Saldo da Combustivel é : " + Funcionario2.valeCombustivel + " Saldo da Maquina é : " + Funcionario2.valeMaquina);
        System.out.println(Funcionario3.nome + " Saldo do Refeição é : " + Funcionario3.valeRefeicao);

    }
}
