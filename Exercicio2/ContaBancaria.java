 package exercicio2;

import java.util.Scanner;

public class ContaBancaria {
    
    public static Scanner input = new Scanner(System.in);

    private String nome;
    private int numero;
    private double saldo;


    ContaBancaria(String nome, int numero, double saldoinicial){
        this.nome = nome;
        this.numero = numero;
        this.saldo = saldoinicial;
    }


    public void Depositar(double saldoinicial){

        System.out.println("Qual valor você deseja adicionar à sua conta?");
        saldo = input.nextDouble();

        double resultado = saldoinicial + saldo;
        System.out.println("Valor atual: " + resultado);

    }

    



}