package edu.christopherkv;

import java.util.Scanner;

/**
 * ContaTerminal
 */

public class ContaTerminal {

    int numero = 0;
    String agencia = "";
    String nomecliente = "";
    Double saldo = 0.00;

    public void inserirDados(int Numero) {this.numero = Numero;}
    public void inserirAgencia(String Agencia) {this.agencia = Agencia;}
    public void inserirNome(String NomeCliente) {this.nomecliente = NomeCliente;}
    public void inserirSaldo(Double Saldo) {this.saldo = Saldo;}

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContaTerminal conta = new ContaTerminal();

        System.out.println("Por favor, digite o número da Agência !");
        conta.inserirDados(Integer.parseInt(scanner.nextLine()));

        System.out.println("Insira a Agencia");
        conta.inserirAgencia(scanner.nextLine());

        System.out.println("Insira o nome");
        conta.inserirNome(scanner.nextLine());

        System.out.println("Por favor, digite o número da Agência !");
        conta.inserirSaldo(Double.parseDouble(scanner.nextLine()));

        String usrOut = String.format(
                "Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.",
                conta.nomecliente, conta.agencia, conta.numero, conta.saldo);

        System.out.println(usrOut);

        scanner.close();
    }
}
