package br.com.cursoemvideo.conta;

public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;


    public void statusAtual(){
        System.out.println("Numero da conta: " + numConta);
        System.out.println("Dono da conta: " + dono);
        System.out.println("Saldo: " + saldo);
        System.out.println("Status: " + status);
    }
    public void abrirConta(String c){
        this.setStatus(true);
        this.setTipo(getTipo());
        if (c.equals("cc")){
            this.setSaldo(50);
            System.out.println("Conta aberta com sucesso!!!");
        } else if (c.equals("cp")) {
            this.setSaldo(150);
            System.out.println("Conta aberta com sucesso!!!");
        }else System.out.println("Conta inválida");

    }
    public void fecharConta(){
        if(getSaldo() < 0){
            System.out.println("Quite sua divida");
        } else if (getSaldo()> 0) {
            System.out.println("Conta contem dinheiro");
        }else {
            this.setStatus(false);
            System.out.println("Conta fechada..");
        }

    }
    public void depositar(float v){
        this.setStatus(true);
        this.setSaldo(getSaldo() + v);
    }

    public void sacar(float v){
        this.setStatus(true);
        this.setSaldo(getSaldo() - v);
    }
    public void pagarMensal(String t){
        if (t.equals("cc")){
            this.setSaldo(getSaldo() - 12);
        } else if (t.equals("cp")) {
            this.setSaldo(getSaldo() - 20);

        }
    }

    public ContaBanco() {
        this.saldo = 0;
        this.status = false;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
