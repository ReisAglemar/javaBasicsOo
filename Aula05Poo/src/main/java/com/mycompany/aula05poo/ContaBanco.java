package com.mycompany.aula05poo;

public class ContaBanco {

    public int numConta;
    protected String tipo; // CP = contaPoupança, CC = contaCorrente
    private String dono;
    private float saldo;
    private boolean status; // true = aberta, false = fechada

    // tenho duvidas quanto a isso, facilita minha vida, no entando tais atributos 
    // não são citados no diagrama de classe. Essas constantes serão usadas para comparar.
    // dessa forma fica mais fácil alterar os valores... estão todas em um único local.
    public static final float CONTA_ZERADA = 0.00f;
    public static final float MENSALIDADE_CP = 20.00f;
    public static final float MENSALIDADE_CC = 12.00f;
    public static final float BONUS_CP = 150.00f;
    public static final float BONUS_CC = 50.00f;

    // constructor //
    public ContaBanco(int numConta, String dono) {
        this.numConta = numConta;
        this.dono = dono;
        this.saldo = CONTA_ZERADA;
        this.status = false;
    }

    // business rules // 
    public void abrirConta(String tipo) { // PASSOU!

        if (tipo.equalsIgnoreCase("cp")) {
            setSaldo(BONUS_CP);
            setTipo(tipo);
            setStatus(true);
            System.out.println("Conta poupança do(a) Sr(a) " + getDono() + ", foi aberta.");
            System.out.println("Saldo atual: R$ " + getSaldo());

        } else if (tipo.equalsIgnoreCase("cc")) {
            setSaldo(BONUS_CC);
            setTipo(tipo);
            setStatus(true);
            System.out.println("Conta corrente do(a) Sr(a) " + getDono() + ", foi aberta.");
            System.out.println("Saldo atual: R$ " + getSaldo());

        } else {
            System.out.println("Verifique o tipo de conta informa, valor inválido");
            System.out.println("Valor informado: " + tipo);
        }
    }

    public void fecharConta() { // PASSOU!

        if (getSaldo() == CONTA_ZERADA) {
            setStatus(false);
            System.out.println("Conta do(a) Sr(a) " + getDono() + ", foi fechada.");

        } else {
            System.out.println("Não é possível fechar a sua conta, seu saldo ou débito é diferente de zero.");

            if (getSaldo() > CONTA_ZERADA) {
                System.out.println("Saldo atual: R$ " + getSaldo());
                System.out.println("Você deve realizar um saque no valor de R$: " + getSaldo());

            } else {
                System.out.println("Saldo atual: R$ " + getSaldo());
                System.out.println("Você deve realizar um depósito no valor de R$: " + getSaldo());
            }
        }
    }

    public void depositar(float valor) { // PASSOU!

        if (valor > CONTA_ZERADA && isStatus()) {
            setSaldo(getSaldo() + valor);
            System.out.println("Seu depósito no valor de R$ " + valor + ", foi realizado.");
            System.out.println("Saldo atual: R$ " + this.saldo);

        } else {
            System.out.println("Não é possível realizar um depósito no valor de zero ou menos");
            System.out.println("Também não é possível depositar em uma conta inativa");
            System.out.println("valor informado para depósito: R$ " + valor);
            System.out.println("Conta ativa? " + isStatus());
        }
    }

    public void sacar(float valor) { // PASSOU!

        if (getSaldo() >= valor && valor > CONTA_ZERADA && isStatus()) {
            setSaldo(getSaldo() - valor);
            System.out.println("Seu saque no valor de R$ " + valor + ", foi realizado.");
            System.out.println("Saldo atual: R$ " + getSaldo());

        } else {
            System.out.println("Não é possível realizar o saque.");
            System.out.println("O valor informado é superior ao saldo da conta.");
            System.out.println("Também não é possível depositar em uma conta inativa");
            System.out.println("Valor informado: R$ " + valor);
            System.out.println("Saldo atual: R$ " + getSaldo());
            System.out.println("Conta ativa? " + isStatus());
        }
    }

    public void pagarMensal(String tipo) { // PASSOU!

        if (tipo.equalsIgnoreCase("cp") && isStatus()) {
            setSaldo(getSaldo() - MENSALIDADE_CP);
            System.out.println("Pagamento da mensalidade realizada.");
            System.out.println("Valor da mensalidade: R$ " + MENSALIDADE_CP);
            System.out.println("Saldo atual: R$ " + getSaldo());

        } else if (tipo.equalsIgnoreCase("cc") && isStatus()) {
            setSaldo(getSaldo() - MENSALIDADE_CC);
            System.out.println("Pagamento da mensalidade realizada.");
            System.out.println("Valor da mensalidade: R$ " + MENSALIDADE_CC);
            System.out.println("Saldo atual: R$ " + getSaldo());

        } else {
            System.out.println("Não é possível realizar o pagamento da mensalidade.");
            System.out.println("Tipo de conta ou a conta é inexistente.");
            System.out.println("Tipo de conta informada: " + tipo);
            System.out.println("Conta ativa? " + isStatus());
        }
    }

    // setters //
    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    // getters //
    public int getNumConta() {
        return numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public String getDono() {
        return dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public boolean isStatus() {
        return status;
    }

    // controle //
    public void controleObjeto() {
        System.out.println("Número da conta: " + getNumConta());
        System.out.println("Tipo de conta: " + getTipo());
        System.out.println("Dono da conta: " + getDono());
        System.out.println("Saldo em conta: R$ " + getSaldo());
        System.out.println("Conta aberta? " + isStatus());
    }
}
