package ContaBancaria;

public class Conta {
    int contaCorrente;
    String agencia;
    String nomeCliente;
    double saldo;

    public int getcontaCorrente(){
        return contaCorrente;
    }
    public String getagencia(){
        return agencia;
    }
    public String getnomeCliente(){
        return nomeCliente;
    }
    public double getsaldo(){
        return saldo;
    }

    public void setcontaCorrente(){
        this.contaCorrente = contaCorrente;
    }
    public void setagencia(){
        this.agencia = agencia;
    }
    public void setnomeCliente(){
        this.nomeCliente = nomeCliente;
    }
    public void setsaldo(){
        this.saldo = saldo;
    }
}
