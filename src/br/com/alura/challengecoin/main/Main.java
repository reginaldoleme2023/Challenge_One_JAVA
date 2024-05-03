    package br.com.alura.challengecoin.main;

    import br.com.alura.challengecoin.converter.CurrencyConverter;
    import br.com.alura.challengecoin.menu.Menu;

    public class Main {

        public static void main(String[] args) {

            var menu = new Menu();
            var converter = new CurrencyConverter();
            int option;

            do {
                menu.showMenu();
                option = menu.readOption();

                if(option > 0 && option <7) {

                    System.out.print("Digite o valor a ser convertido: ");
                    double valueToConvert = menu.scanner.nextDouble();
                    double convertedeValue;
                    switch (option) {
                        case 1 -> {
                            convertedeValue = converter.converterCurrency(valueToConvert, 1);
                            System.out.println("O Valor de R$ " + valueToConvert + " [BRL] corresponde a $ " + convertedeValue + " [USD]");
                        }
                        case 2 -> {
                            convertedeValue = converter.converterCurrency(valueToConvert, 2);
                            System.out.println("O Valor de $ " + valueToConvert + " [USD] corresponde a R$ " + convertedeValue + " [BRL]");
                        }
                        case 3 -> {
                            convertedeValue = converter.converterCurrency(valueToConvert, 3);
                            System.out.println("O Valor de R$ " + valueToConvert + " [BRL] corresponde a € " + convertedeValue + " [EUR]");
                        }
                        case 4 -> {
                            convertedeValue = converter.converterCurrency(valueToConvert, 4);
                            System.out.println("O Valor de € " + valueToConvert + " [EUR] corresponde a R$ " + convertedeValue + " [BRL]");
                        }
                        case 5 -> {
                            convertedeValue = converter.converterCurrency(valueToConvert, 5);
                            System.out.println("O Valor de R$ " + valueToConvert + " [BRL] corresponde a £ " + convertedeValue + " [GBP]");
                        }
                        case 6 -> {
                            convertedeValue = converter.converterCurrency(valueToConvert, 6);
                            System.out.println("O Valor de £ " + valueToConvert + " [GBP] corresponde a R$ " + convertedeValue + " [BRL]");
                        }
                        default -> System.out.println("Opção inválida! Tente novamente.");
                    }

                }


            } while (option != 7);

            System.out.println("Obrigado por utilizar o Conversor de Moedas :) até a próxima!!!");

            menu.closeScanner();
        }


    }

