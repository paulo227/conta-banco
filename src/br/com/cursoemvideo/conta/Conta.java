package br.com.cursoemvideo.conta;

public class Conta {
    public static void main(String[] args) {
        ContaBanco c1 = new ContaBanco();
        c1.abrirConta("cp");
        c1.setDono("Paulo");
        c1.setNumConta(22222);
        c1.depositar(500);
        c1.sacar(630);
        c1.pagarMensal("cp");
        c1.statusAtual();
        c1.fecharConta();

        System.out.println("---------------------");

        ContaBanco c2 = new ContaBanco();
        c2.abrirConta("cc");
        c2.setDono("Clara");
        c2.setNumConta(222333);
        c2.depositar(550);
        c2.sacar(650);
        c2.pagarMensal("cc");
        c2.statusAtual();
        c2.fecharConta();
    }
}
