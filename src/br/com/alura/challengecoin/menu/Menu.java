package br.com.alura.challengecoin.menu;

import java.util.Scanner;

public class Menu {

    public final Scanner scanner;

    public Menu() {
        this.scanner = new Scanner(System.in);
    }

    public void showMenu() {
        System.out.println("### Seja bem vindo ao Conversor de Moedas :) ###");
        System.out.println("1. Converter de Real para Dólar");
        System.out.println("2. Converter de Dólar para Real");
        System.out.println("3. Converter de Real para Peso Euro");
        System.out.println("4. Converter de Euro para Real");
        System.out.println("5. Converter de Real para Peso Libra Esterlina");
        System.out.println("6. Converter de Libra Esterlina para Real");
        System.out.println("7. Sair");
        System.out.print("Escolha uma opção: ");
    }

    public int readOption() {
        return scanner.nextInt();
    }

    public void closeScanner() {
        scanner.close();
    }
}

