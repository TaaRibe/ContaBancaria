package ContaBancaria;

import java.util.Scanner;

public class Cliente {
    public static void main(String[] args) {

    Scanner cc = new Scanner(System.in);
    int contaCorrente;
    String agencia;
    String nomeCliente;
    double saldo;
    
    System.out.println("Digite o numero da conta bancaria: ");
        contaCorrente = cc.nextInt();
    cc.nextLine();

    System.out.println("Digite o número da agência: ");
        agencia = cc.nextLine();

    System.out.println("Digite o Nome do Cliente: ");
        nomeCliente = cc.nextLine();

    System.out.println("Digite o valor do saldo: ");
        saldo = cc.nextDouble();

        System.out.println("Bem vindo ao BancoValores" + "\n" +
        "-------Dados do Cliente--------" + "\n"+
        "Sr(a): "+ nomeCliente + "\n" +
        "Número da Conta Corrente: " + contaCorrente + "\n" +
        "Número da Agência Bancária: "+ agencia + "\n"+
        "Valor do saldo atual é de R$" + saldo);
            
        cc.close();

}
    
}
