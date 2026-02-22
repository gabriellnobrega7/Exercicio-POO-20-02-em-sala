 package exercicio2;

import java.util.Scanner;

public class Main {
    
    public static Scanner input = new Scanner(System.in);


    public static void main(String[] args) {
        

        ContaBancaria conta = null;
        int opcao;

        do {
            
            System.out.println("---MENU---");
            System.out.println("OPÇÃO 1 - CRIAR CONTA BANCÁRIA");
            System.out.println("OPÇÃO 2 - DEPOSITAR DINHEIRO");
            System.out.println("OPÇÃO 3 - SACAR DINHEIRO");
            System.out.println("OPÇÃO 4 - EXIBIR SALDO");
            System.out.println("OPÇÃO 0 - SAIR");

            System.out.println();
            System.out.println("Digite a opção desejada:");
            opcao = input.nextInt();
            input.nextLine();


            switch (opcao) {
                case 1:
                    
                    System.out.println("Nome do titular:");
                    String nome = input.nextLine();

                    System.out.println("Número da conta:");
                    int numero = input.nextInt();

                    System.out.println("Saldo inicial:");
                    double saldo = input.nextDouble();

                    conta = new ContaBancaria(nome, numero, saldo);

                    System.out.println("Conta criada com sucesso!");

                    break;

                case 2:
                    System.out.println("Valor para depósito:");
                    double valor = input.nextDouble(); 
                    conta.depositar(valor);
                    
                break;

                case 3:
                    System.out.println("Valor para saque:");
                    double valorSaque = input.nextDouble();
                    conta.sacar(valorSaque);
                break;

                case 4:

                    conta.exibirSaldo();

                break;
                
                case 0:

                    System.out.println("SAINDO DO MENU...");
                break;

                default:
                    System.out.println("Opção Inválida");
                    break;
            }


        } while (opcao != 0);


    }



}
